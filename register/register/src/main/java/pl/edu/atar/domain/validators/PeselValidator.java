package pl.edu.atar.domain.validators;

import pl.edu.atar.domain.forms.RegisterFormFields;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeselValidator implements Validator {

    private final String pesel;

    public PeselValidator(final String pesel) {
        this.pesel = pesel;
    }

    public boolean isValid() {
        final int PESEL_LENGTH = 11;

        if(pesel == null || pesel.length() != PESEL_LENGTH) {
            return false;
        }

        //walidacja cyfry kontrolnej numeru pesel
        int[] weights = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3};
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += weights[i] * (pesel.charAt(i) - '0');
        }
        int controlNumber = 10 - sum % 10;
        if (controlNumber == 10) {
            controlNumber = 0;
        }
        if (controlNumber != pesel.charAt(10) - '0') {
            return false;
        }

        String regex = "^[0-9]*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pesel);

        return matcher.matches();
    }

    public String fieldName() {
        return RegisterFormFields.PESEL.fieldName();
    }
}
