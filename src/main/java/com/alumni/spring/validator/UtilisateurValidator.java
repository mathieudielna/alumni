package com.alumni.spring.validator;

import com.alumni.spring.models.Utilisateur;
import com.alumni.spring.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class UtilisateurValidator implements Validator {
    @Autowired
    private UtilisateurService utilisateurService;

    @Override
    public boolean supports(Class<?> clazz) {
        return Utilisateur.class.equals(clazz);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Utilisateur utilisateur = (Utilisateur) o;
        System.err.println(utilisateur.getUsername());
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "login", "NotEmpty");
        if (utilisateur.getUsername().length() < 2   || utilisateur.getUsername().length() > 32) {
            errors.rejectValue("login", "Size.utilisateurForm.login");
        }
        if (utilisateurService.trouverParLogin(utilisateur.getUsername()) != null) {
            errors.rejectValue("login", "Duplicate.utilisateurForm.login");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
        if (utilisateur.getPassword().length() < 2 || utilisateur.getPassword().length() > 32) {
            errors.rejectValue("password", "Size.utilisateurForm.password");
        }
      /*  if (!utilisateur.getPasswordConfirm().equals(utilisateur.getPassword())) {
            errors.rejectValue("passwordConfirm", "Diff.userForm.passwordConfirm");
        }*/
    }
}
