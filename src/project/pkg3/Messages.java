package project.pkg3;

import java.util.Scanner;

public interface Messages {

    String menu = "Services Menu\n1 - Ciphering Text\n2 - Deciphering Text\n3 - Records\n0 - Exit";
    String spliter = "\n*******************************";
    String enterService = "Please enter the number of the service needed:  ";
    String ciphering = "Enter the text to be ciphering:  ";
    String deCiphering = "Enter the text to be deciphering:  ";
    String tMenu = "Techniques Menu\n1 - ATABASH\n2 - HEX\n3 - VIGENERE\n0 - Return to Main Menu";
    Scanner src = new Scanner(System.in);
    String key = "VIGENERECIPHER";
    int sizeOfIntInHalfBytes = 4;
    int numberOfBitsInAHalfByte = 4;
    int halfByte = 0x0F;
    char[] hexDigits = {
        '0', '1', '2', '3', '4', '5', '6', '7',
        '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
    };
    String args[] = {};

}
