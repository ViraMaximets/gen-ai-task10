package com.gen.ai;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(validatePassword("Pssw0//rd", 12));
    }

    public static boolean validatePassword(String input, int maxLength) {
        // validate the maximum string length
        if (input.length() > maxLength) {
            return false;
        }

        // uppercase, lowercase letter, digit, special character
        if (!Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]).*$", input)) {
            return false;
        }

        // not contain any whitespace characters
        if (Pattern.matches(".*\\s.*", input)) {
            return false;
        }
        return true;
    }
}
