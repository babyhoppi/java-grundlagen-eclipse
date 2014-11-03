package de.chuqa.StartingJavaEE.presentation.validation;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * Created with IntelliJ IDEA.
 * User: M46923
 * Date: 09.01.13
 * Time: 15:40
 * To change this template use File | Settings | File Templates.
 */
public class NachnameValidator implements Validator {
            @Override
        public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
            boolean nameCorrect = true;
            if (value == null){
                nameCorrect = false;
            }
            String name = (String)value;

            //context.disableDefaultConstraintViolation();
            if (name.length() == 0 || name.length() > 50){
                nameCorrect = false;
            }

            if (!nameCorrect){
                FacesMessage message = new FacesMessage();
                message.setSeverity(FacesMessage.SEVERITY_ERROR);
                message.setSummary("Der Familienname ist nicht korrekt.");
                message.setDetail("Der Nachname muss mindestens ein Zeichen enthalten und darf höchstens 50 Zeichen lang sein.");
                throw new ValidatorException(message);
            }}}
