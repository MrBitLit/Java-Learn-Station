package GUIStuff.EncryptionProgram;

import java.util.ArrayList;

/**
 *
 * @author besic
 */
public class EncryptedTexts {

    private static ArrayList<String> alCaeserEncryptedTexts
            = new ArrayList<>();
    private static ArrayList<String> alVigenereEncryptedTexts
            = new ArrayList<>();

    public static int getVigenereListSize() {
        return alVigenereEncryptedTexts.size();
    }

    public static int getCaeserListSize() {
        return alCaeserEncryptedTexts.size();
    }

    public static Object[] vigenereListToArray() {
        return alVigenereEncryptedTexts.toArray();
    }

    public static Object[] caeserListToArray() {
        return alCaeserEncryptedTexts.toArray();
    }

    public static String getVigenereEncryptedText(int index) {
        if (index >= 0 && index < EncryptedTexts.getVigenereListSize()) {
            return alVigenereEncryptedTexts.get(index);
        }
        return null;
    }

    public static String getCaeserEncryptedText(int index) {
        if (index >= 0 && index < EncryptedTexts.getCaeserListSize()) {
            return alCaeserEncryptedTexts.get(index);
        }
        return null;
    }

    public static boolean addVigenereEncryptedText(String e) {
        return alVigenereEncryptedTexts.add(e);
    }

    public static boolean addCaeserEncryptedText(String e) {
        return alCaeserEncryptedTexts.add(e);
    }

    public static String removeVigenereEncryptedText(int index) {
        return alVigenereEncryptedTexts.remove(index);
    }

    public static String removeCaeserEncryptedText(int index) {
        return alCaeserEncryptedTexts.remove(index);
    }

    public static void clearVigenereList() {
        alVigenereEncryptedTexts.clear();
    }

    public static void clearCaeserList() {
        alCaeserEncryptedTexts.clear();
    }

    public static String vigenereListToString() {
        return "Vigenere: " + alVigenereEncryptedTexts.toString();
    }

    public static String caeserListToString() {
        return "Caeser: " + alCaeserEncryptedTexts.toString();
    }
}
