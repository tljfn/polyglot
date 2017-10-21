package fckdroid.polyglot.util;


public class AppUtil {
    public static final String EMPTY_STRING = "";

    private AppUtil() { }

    public static String formatWord(String word) {
        if (word.isEmpty()) {
            return EMPTY_STRING;
        }
        char[] charArray = word.toLowerCase().toCharArray();
        char firstChar = charArray[0];
        charArray[0] = Character.toUpperCase(firstChar);
        return String.valueOf(charArray);
    }

    public static boolean checkAnswer(String translation, String userAnswer) {
        for (String translationVariant : translation.split("/")) {
            if (translationVariant.equalsIgnoreCase(userAnswer)) {
                return true;
            }
        }
        return false;
    }
}
