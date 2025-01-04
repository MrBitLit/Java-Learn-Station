package GUIStuff.EncryptionProgram;

import java.util.ArrayList;

/**
 *
 * @author besic
 */
public class DecryptedTexts {

    private static ArrayList<String> alCaeserDecryptedTexts 
            = new ArrayList<>();
    private static ArrayList<String> alVigenereDecryptedTexts 
            = new ArrayList<>();

    public static int getVigenereListSize() {
        return alVigenereDecryptedTexts.size();
    }

    public static int getCaeserListSize() {
        return alCaeserDecryptedTexts.size();
    }

    public static Object[] vigenereListToArray() {
        return alVigenereDecryptedTexts.toArray();
    }

    public static Object[] caeserListToArray() {
        return alCaeserDecryptedTexts.toArray();
    }

    public static String getVigenereDecryptedText(int index) {
        return alVigenereDecryptedTexts.get(index);
    }
    
    public static String getCaeserDecryptedText(int index) {
        return alCaeserDecryptedTexts.get(index);
    }

     public static boolean addVigenereDecryptedText(String e) {
        return alVigenereDecryptedTexts.add(e);
    }
    
    public static boolean addCaeserDecryptedText(String e) {
        return alCaeserDecryptedTexts.add(e);
    }

    public static String removeVigenereEncryptedText(int index) {
        return alVigenereDecryptedTexts.remove(index);
    }
    
    public static String removeCaeserEncryptedText(int index) {
        return alCaeserDecryptedTexts.remove(index);
    }

    public static void clearVigenereList() {
        alVigenereDecryptedTexts.clear();
    }
    
    public static void clearCaeserList() {
        alCaeserDecryptedTexts.clear();
    }

    public static String vigenereListToString() {
        return alVigenereDecryptedTexts.toString();
    }
    
    public static String caeserListToString() {
        return alCaeserDecryptedTexts.toString();
    }
}
