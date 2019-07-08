package project.pkg3;

import MenuChoices.Record;
import MenuChoices.Ciphering;
import MenuChoices.Deciphering;
import static project.pkg3.Messages.*;

public class Main {

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println(Messages.menu);
                System.out.print(Messages.enterService);
                switch (src.nextInt()) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        new Ciphering().cipheringPattern();
                        break;
                    case 2:
                        new Deciphering().deCipheringPattern();
                        break;
                    case 3:
                        new Record().PrintRecords();
                        break;
                    default:
                        System.out.println("Invalid Input");
                        System.out.println(spliter);
                        break;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

}
