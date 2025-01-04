package GUIStuff.EncryptionProgram;

import GUIStuff.EncryptionProgram.Exceptions.EmptyEncryptionKeyException;
import GUIStuff.EncryptionProgram.Exceptions.ValidTextException;

public class Cryptor {

    /* public static String originalText = "Et tu, Brute? Venī, vīdī, 
        vīcī. Ālea iacta est. Cautī plūribus vicibus moriuntur quam mortēs; 
        Fortes gustāre morsūs numquam. Amīcī, Rōmānī, cīvēs, praebe mihi aurēs 
        vestrae; Vēnī sepelīre Caesarem, nōn laudāre eum. Faucēs, cāre Brūte, 
        nōn in astrīs nōstrīs sunt, sed in nōbīs ipsis, ut sint subservientes. 
        Cave Idūs Martiās."; */
    private static String originalText = "Héllo";
    protected static final String VIGENERE_KEY = "BACHELIER";

    public static String encryptCaesar(String clearText, int shift) throws
            ValidTextException {
        String encryptedText = "";

        if (clearText != null && !clearText.isEmpty()) {
            String filteredText = removeSpecialCharacters(
                    replaceAccentedLetters(clearText)).toUpperCase();

            for (int i = 0; i < filteredText.length(); i++) {
                char currentChar = filteredText.charAt(i);

                if (Character.isUpperCase(currentChar)) {
                    // Shift the character by 'shift' positions 
                    // within the uppercase alphabet
                    char encryptedChar = (char) ('A' + (currentChar - 'A'
                            + shift) % 26);
                    encryptedText += encryptedChar;
                } else {
                    // If the current character is not an uppercase letter,
                    // keep non-alphabetic characters unchanged
                    encryptedText += currentChar;
                }
            }
            return encryptedText;
        } else {
            throw new NumberFormatException();
        }
    }

    public static String decryptCaesar(String encryptedText, int shift) {
        String decryptedText = "";

        // Iterate through each character in the encrypted text
        for (int i = 0; i < encryptedText.length(); i++) {
            // Retrieve the current character at index i
            char currentChar = encryptedText.charAt(i);

            // Check if the current character is an uppercase letter
            if (Character.isUpperCase(currentChar)) {
                // Shift the character by '-shift (left side)' positions within 
                // the uppercase alphabet. 
                char decryptedChar = (char) ('A' + (currentChar - 'A'
                        - shift + 26) % 26);
                // Append the decrypted character to the result string
                decryptedText += decryptedChar;
            } else {
                // If the current character is not an uppercase letter,
                // keep non-alphabetic characters unchanged
                decryptedText += currentChar;
            }
        }

        // Return the final decrypted text
        return decryptedText;
    }

    public static String encryptVigenere(String clearText, String key) throws
            EmptyEncryptionKeyException {
        if (key != null && !key.isEmpty()) {
            String encryptedText = "";
            key = key.toUpperCase();

            // Remove special characters, replace accented letters, 
            // and convert to uppercase
            String filteredText = removeSpecialCharacters(
                    replaceAccentedLetters(clearText)).
                    toUpperCase();

            for (int i = 0; i < filteredText.length(); i++) {
                char currentChar = filteredText.charAt(i);

                if (Character.isUpperCase(currentChar)) {
                    int shift = key.charAt(i % key.length()) - 'A' + 1;
                    char encryptedChar = (char) ('A' + (currentChar - 'A'
                            + shift) % 26);
                    encryptedText += encryptedChar;
                } else {
                    encryptedText += currentChar;
                }
            }

            return encryptedText;
        } else {
            throw new EmptyEncryptionKeyException();
        }
    }

    public static String decryptVigenere(String encryptedText, String key) {
        String decryptedText = "";
        key = key.toUpperCase();

        for (int i = 0; i < encryptedText.length(); i++) {
            char currentChar = encryptedText.charAt(i);

            if (Character.isUpperCase(currentChar)) {
                int shift = key.charAt(i % key.length()) - 'A' + 1;
                // One letter of the key
                // System.out.println(key.charAt(i % key.length())); 
                // One letter of the key index shift position
                // NEED TO ADD + 1 and not - 1, so that the shifting 
                // works logically!
                // System.out.println(key.charAt(i % key.length()) - 'A' + 1);
                char decryptedChar = (char) ('A' + (currentChar - 'A' - shift
                        + 26) % 26);
                decryptedText += decryptedChar;
            } else {
                decryptedText += currentChar;
            }
        }

        return decryptedText;
    }

    public static String removeSpecialCharacters(String text) {
        // Replace/Remove every character except for a-z or A-Z and white space
        return text.replaceAll("[^a-zA-Z,.? ]", "");
    }

    public static String replaceAccentedCharacter(String text,
            char accentedChar, char replacement) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            
            if (currentChar == accentedChar) {
                result += replacement;
            } else {
                result += currentChar;
            }
        }
        return result;
    }

    /**
     * Replaces specific accented characters in a given string.
     *
     * @param text The input string in which accented characters will be
     * replaced.
     * @return The string with accented characters replaced.
     */
    public static String replaceAccentedLetters(String text) {
        // Replace specific accented characters
        String replacedText = text
                .replace('á', 'a')
                .replace('à', 'a')
                .replace('ā', 'a')
                .replace('ä', 'a')
                .replace('â', 'a')
                .replace('ç', 'c')
                .replace('è', 'e')
                .replace('é', 'e')
                .replace('ë', 'e')
                .replace('ê', 'e')
                .replace('ē', 'e')
                .replace('ê', 'e')
                .replace('î', 'i')
                .replace('ī', 'i')
                .replace('ï', 'i')
                .replace('ñ', 'n')
                .replace('ô', 'o')
                .replace('ö', 'o')
                .replace('ō', 'o')
                .replace('û', 'u')
                .replace('ü', 'u');

        return replacedText;
    }

    public static void main(String[] args) throws ValidTextException {
        try {
            int shift = 3;

//            System.out.println("\n=============================== FILTERED TEXT"
//                    + " ===========================================\n");
//            System.out.println("Original text: " + originalText);
//
//            String filteredText = removeSpecialCharacters(
//                    replaceAccentedLetters(originalText)).toUpperCase();
//
//            // Print original filtered text
//            System.out.println("Original Filtered Text: " + filteredText);
            System.out.println("\n================================== CAESAR"
                    + " ===========================================\n");

            // Encrypted Text (Caesar)
            String encryptedText = encryptCaesar(originalText, shift);
            System.out.println("Encrypted Text: " + encryptedText);

            // Decrypted Text (Caesar)
            String decryptedText = decryptCaesar(encryptCaesar(
                    originalText, shift), shift);
            System.out.println("Decrypted Text: " + decryptedText);

            System.out.println("\n================================== VIGENERE"
                    + " ===========================================\n");

            // Encrypted Text (Vigenere)
            System.out.println("Key: BACHELIER");
            String vigenereEncryptedText = encryptVigenere(originalText,
                    "Bachelier");
            System.out.println("Encrypted Text: " + vigenereEncryptedText);

            // Decrypted Text (Vigenere)
            String vigenereDecryptedText = decryptVigenere(
                    vigenereEncryptedText, "Bachelier");
            System.out.println("Decrypted Text: " + vigenereDecryptedText);

            // ==============================================================
            System.out.println("==========================================="
                    + "===================");

            // Encrypted Text (Vigenere)
            System.out.println("Key: SECRET");
            String vigenereEncryptedText2 = encryptVigenere("☠️⌫tEsT",
                    ""); // Key is empty here so the exception will be caught
            System.out.println("Encrypted Text: " + vigenereEncryptedText2);

            // Decrypted Text (Vigenere)
            String vigenereDecryptedText2 = decryptVigenere(
                    vigenereEncryptedText2, "SECRET");
            System.out.println("Decrypted Text: " + vigenereDecryptedText2);
        } catch (EmptyEncryptionKeyException e) {
            System.out.println(e);
        }
    }
}
