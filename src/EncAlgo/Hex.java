package EncAlgo;

import static project.pkg3.Messages.*;

public class Hex {

    protected final String decode(String ciperText) {
        String[] arr = ciperText.split(" ");
        String text = "";
        for (int i = 0; i < arr.length; i++) {
            text += Character.toString((char) hexToDec(arr[i]));
        }
        return text;
    }

    protected final String encode(String ciperText) {
        String ascis = "";
        for (int asci : ciperText.toCharArray()) {

            ascis += decToHex(asci) + " ";
        }
        return ascis;
    }

    private String decToHex(int dec) {
        StringBuilder hexBuilder = new StringBuilder(sizeOfIntInHalfBytes);
        hexBuilder.setLength(sizeOfIntInHalfBytes);
        for (int i = sizeOfIntInHalfBytes - 1; i >= 0; --i) {
            int j = dec & halfByte;
            hexBuilder.setCharAt(i, hexDigits[j]);
            dec >>= numberOfBitsInAHalfByte;
        }
        return hexBuilder.toString();
    }

    private int hexToDec(String display) {
        return Integer.parseInt(display.trim(), 16);
    }

 
}
