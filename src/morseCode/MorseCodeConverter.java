package morseCode;

import java.util.HashMap;
import java.util.Map;

public class MorseCodeConverter {
    private static final Map<String, String> morseToEnglish = new HashMap<>();
    private static final Map<String, String> englishToMorse = new HashMap<>();

    static {
        morseToEnglish.put("*-", "A");
        morseToEnglish.put("-***", "B");
        morseToEnglish.put("-*-*", "C");
        morseToEnglish.put("-**", "D");
        morseToEnglish.put("*", "E");
        morseToEnglish.put("**-*", "F");
        morseToEnglish.put("--*", "G");
        morseToEnglish.put("****", "H");
        morseToEnglish.put("**", "I");
        morseToEnglish.put("*---", "J");
        morseToEnglish.put("-*-", "K");
        morseToEnglish.put("*-**", "L");
        morseToEnglish.put("--", "M");
        morseToEnglish.put("-*", "N");
        morseToEnglish.put("---", "O");
        morseToEnglish.put("*--*", "P");
        morseToEnglish.put("--*-", "Q");
        morseToEnglish.put("*-*", "R");
        morseToEnglish.put("***", "S");
        morseToEnglish.put("-", "T");
        morseToEnglish.put("**-", "U");
        morseToEnglish.put("***-", "V");
        morseToEnglish.put("*--", "W");
        morseToEnglish.put("-**-", "X");
        morseToEnglish.put("-*--", "Y");
        morseToEnglish.put("--**", "Z");
        morseToEnglish.put("*----", "1");
        morseToEnglish.put("**---", "2");
        morseToEnglish.put("***--", "3");
        morseToEnglish.put("****-", "4");
        morseToEnglish.put("*****", "5");
        morseToEnglish.put("-****", "6");
        morseToEnglish.put("--***", "7");
        morseToEnglish.put("---**", "8");
        morseToEnglish.put("----*", "9");
        morseToEnglish.put("-----", "0");
        morseToEnglish.put("--**--", ",");
        morseToEnglish.put("*-*-*-", ".");
        morseToEnglish.put("**--**", "?");

        for (Map.Entry<String, String> entry : morseToEnglish.entrySet()) {
            englishToMorse.put(entry.getValue(), entry.getKey());
        }
    }

    public static String convertMorseToEnglish(String morseCode) {
        StringBuilder englishText = new StringBuilder();
        String[] words = morseCode.trim().split("\\s{3}");

        for (String word : words) {
            String[] letters = word.split("\\s");
            for (String letter : letters) {
                String character = morseToEnglish.getOrDefault(letter, "");
                if (!character.isEmpty()) {
                    englishText.append(character);
                } else {
                    englishText.append("?");
                }
            }
            englishText.append(" ");
        }

        return englishText.toString().trim();
    }

    public static String convertEnglishToMorse(String englishText) {
        StringBuilder morseCode = new StringBuilder();

        for (char c : englishText.toUpperCase().toCharArray()) {
            String morseCharacter = englishToMorse.getOrDefault(Character.toString(c), "");
            if (!morseCharacter.isEmpty()) {
                morseCode.append(morseCharacter).append(" ");
            } else {
                morseCode.append("? ");
            }
        }

        return morseCode.toString().trim();
    }
}
