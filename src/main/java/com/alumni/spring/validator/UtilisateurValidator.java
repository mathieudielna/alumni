package com.alumni.spring.validator;

import com.alumni.spring.models.Utilisateur;
import com.alumni.spring.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.executable.ExecutableValidator;
import javax.validation.metadata.BeanDescriptor;
import java.util.Set;

public class UtilisateurValidator implements Validator {
    @Autowired
    private UtilisateurService utilisateurService;

    public boolean supports(Class<?> aClass) {
        return Utilisateur.class.equals(aClass);
    }

  /*  @Override*/
    public void validate(Object o, Errors errors) {
        Utilisateur utilisateur = (Utilisateur) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");
        if (utilisateur.getUsername().length() < 6 || utilisateur.getUsername().length() > 32) {
            errors.rejectValue("username", "Size.userForm.username");
        }
        if (utilisateurService.trouverParLogin(utilisateur.getUsername()) != null) {
            errors.rejectValue("username", "Duplicate.userForm.username");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
        if (utilisateur.getPassword().length() < 8 || utilisateur.getPassword().length() > 32) {
            errors.rejectValue("password", "Size.userForm.password");
        }
      /*  if (!utilisateur.getPasswordConfirm().equals(utilisateur.getPassword())) {
            errors.rejectValue("passwordConfirm", "Diff.userForm.passwordConfirm");
        }*/
    }

    /*-------------- implement auto de la classe -------------------*/
    @Override
    public <T> Set<ConstraintViolation<T>> validate(T object, Class<?>... groups) {
        return null;
    }

    @Override
    public <T> Set<ConstraintViolation<T>> validateProperty(T object, String propertyName, Class<?>... groups) {
        return null;
    }

    @Override
    public <T> Set<ConstraintViolation<T>> validateValue(Class<T> beanType, String propertyName, Object value, Class<?>... groups) {
        return null;
    }

    @Override
    public BeanDescriptor getConstraintsForClass(Class<?> clazz) {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> type) {
        return null;
    }

    @Override
    public ExecutableValidator forExecutables() {
        return null;
    }
}
