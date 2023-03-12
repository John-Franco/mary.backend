package com.mary.domain.value_objects.validators;

import java.util.regex.Pattern;

public class RegexValidator {

    public static boolean validateRegex(String text, String regex) {
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(text).matches();
    }
}
