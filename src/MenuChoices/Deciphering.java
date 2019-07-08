package MenuChoices;

import EncAlgo.FacadeAlgo;
import project.pkg3.Main;
import static project.pkg3.Messages.*;

public class Deciphering {

    public void deCipheringPattern() {
        System.out.println(spliter);
        System.out.println(tMenu);
        System.out.print(enterService);
        switch (src.nextInt()) {
            case 1:
                decAtbash();
                break;
            case 2:
                decHex();
                break;
            case 3:
                decVigenere();
                break;
            case 0:
                returnToMenu();
                break;
            default:
                System.out.println("Invaild Input");
                deCipheringPattern();
                break;
        }
    }

    private void decAtbash() {
        System.out.println(spliter);
        System.out.print(ciphering);
        src.nextLine();
        String Pattern = src.nextLine();
        String hashCode = FacadeAlgo.getFacadeAlgo().decodeAtbsh(Pattern);
        String record = "\"" + Pattern + "\"" + " " + "Has been deciphering using Atbash to: " + hashCode;
        Record.recorder.add(record);
        System.out.println(record);
        System.out.println(spliter);
    }

    private void decHex() {
        System.out.println(spliter);
        System.out.print(ciphering);
        src.nextLine();
        String Pattern = src.nextLine();
        String hashCode = FacadeAlgo.getFacadeAlgo().decodeHex(Pattern);
        String record = "\"" + Pattern + "\"" + " " + "Has been deciphering using Hex to: " + hashCode;
        Record.recorder.add(record);
        System.out.println(record);
        System.out.println(spliter);
    }

    private void decVigenere() {
        System.out.println(spliter);
        System.out.print(ciphering);
        src.nextLine();
        String Pattern = src.nextLine();
        String hashCode = FacadeAlgo.getFacadeAlgo().decodeVigenere(Pattern);
        String record = "\"" + Pattern + "\"" + " " + "Has been ciphering using Vigenere to: " + hashCode;
        Record.recorder.add(record);
        System.out.println(record);
        System.out.println(spliter);
    }

    private void returnToMenu() {
        System.out.println(spliter);
        Main.main(args);
    }
}
