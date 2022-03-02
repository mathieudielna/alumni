package com.alumni.spring.validator;

import com.alumni.spring.models.Evenement;
import com.alumni.spring.service.EvenementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class AjoutEvenementValidator implements Validator {

    @Autowired
    private EvenementService evenementService;

    @Override
    public boolean supports(Class<?> clazz) {
        return Evenement.class.equals(clazz);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Evenement evenement = (Evenement) o;
        System.err.println(evenement.getNomEvent());

        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"nomEvent", "NotEmpty");
        if(evenement.getNomEvent().length() < 2 || evenement.getNomEvent().length() > 32) {
            errors.rejectValue("nomEvent", "Size.evenementForm.nomEvent");
        }

        if(evenementService.trouverEvenementParNom(evenement.getNomEvent()) != null){
            errors.rejectValue("nomEvent", "Duplicate.evenementForm.nomEvent");
        }
    }
}
