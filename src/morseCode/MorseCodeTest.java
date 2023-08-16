package morseCode;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MorseCodeTest {

    @Test
    public void testMorseToEnglishConversion() {
        String morseCode = "**** * *-** *-** --- --**-- *-*-*-";
        String expected = "HELLO,.";
        String actual = MorseCodeConverter.convertMorseToEnglish(morseCode);
        assertEquals(expected, actual);
    }

    @Test
    public void testEnglishToMorseConversion() {
        String englishText = "SOS";
        String expected = "*** --- ***";
        String actual = MorseCodeConverter.convertEnglishToMorse(englishText);
        assertEquals(expected, actual);
    }

    @Test
    public void testMorseToEnglishConversion2() {
        String morseCode = "- * *** -";
        String expected = "TEST";
        String actual = MorseCodeConverter.convertMorseToEnglish(morseCode);
        assertEquals(expected, actual);
    }

}
