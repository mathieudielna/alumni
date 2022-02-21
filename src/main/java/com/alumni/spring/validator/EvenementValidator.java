package com.alumni.spring.validator;

import com.alumni.spring.models.Evenement;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class EvenementValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Evenement.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
