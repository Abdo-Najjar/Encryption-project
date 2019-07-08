package EncAlgo;

public class FacadeAlgo {

    private static FacadeAlgo facadeAlgo;
    private Atbash atbash;
    private Hex hex;
    private Vigenere vigenere;

    private FacadeAlgo() {
        if (atbash == null) {
            atbash = new Atbash();
        }
        if (hex == null) {
            hex = new Hex();
        }
        if (vigenere == null) {
            vigenere = new Vigenere();
        }
    }

    public String encodeAtbsh(String ciperText) {
        return atbash.encode(ciperText);
    }

    public String decodeAtbsh(String ciperText) {
        return atbash.decode(ciperText);
    }

    public String encodeHex(String ciperText) {
        return hex.encode(ciperText);
    }

    public String decodeHex(String ciperText) {
        return hex.decode(ciperText);
    }

    public String encodeVigenere(String text) {
        return vigenere.encode(text);
    }

    public String decodeVigenere(String text) {
        return vigenere.decode(text);
    }

    public static FacadeAlgo getFacadeAlgo() {
        if (facadeAlgo == null) {
            facadeAlgo = new FacadeAlgo();
        }
        return facadeAlgo;
    }
}
