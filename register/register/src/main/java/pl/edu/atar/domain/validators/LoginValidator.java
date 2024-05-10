package pl.edu.atar.domain.validators;

import pl.edu.atar.domain.forms.RegisterFormFields;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginValidator implements Validator {

    private final String login;

    public LoginValidator(final String login) {
        this.login = login;
    }

    public boolean isValid() {
        final int LOGIN_MIN_LENGTH = 4;

        if(login == null || login.length() < LOGIN_MIN_LENGTH) {
            return false;
        }

        //String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()_+=-]).{4,}$";
        //Pattern pattern = Pattern.compile(regex);
        //Matcher matcher = pattern.matcher(login);

        return true;
    }

    public String fieldName() {
        return RegisterFormFields.LOGIN.fieldName();
    }
}
