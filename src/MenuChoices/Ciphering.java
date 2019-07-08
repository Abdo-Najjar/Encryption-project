package MenuChoices;

import EncAlgo.FacadeAlgo;
import project.pkg3.Main;
import static project.pkg3.Messages.*;

public class Ciphering {

    public void cipheringPattern() {
        System.out.println(spliter);
        System.out.println(tMenu);
        System.out.print(enterService);
        switch (src.nextInt()) {
            case 1:
                cAtbash();
                break;
            case 2:
                cHex();
                break;
            case 3:
                cVigenere();
                break;
            case 0:
                returnToMenu();
                break;
            default:
                System.out.println("Invaild Input");
                cipheringPattern();
                break;

        }
    }

    private void cAtbash() {
        System.out.println(spliter);
        System.out.print(ciphering);
        src.nextLine();
        String Pattern = src.nextLine();
        String hashCode = FacadeAlgo.getFacadeAlgo().encodeAtbsh(Pattern);
        String record = "\"" + Pattern + "\"" + " " + "Has been ciphering using Atbash to: " + hashCode;
        Record.recorder.add(record);
        System.out.println(record);
        System.out.println(spliter);
    }

    private void cHex() {
        System.out.println(spliter);
        System.out.print(ciphering);
        src.nextLine();
        String Pattern = src.nextLine();
        String hashCode = FacadeAlgo.getFacadeAlgo().encodeHex(Pattern);
        String record = "\"" + Pattern + "\"" + " " + "Has been ciphering using Hex to: " + hashCode;
        Record.recorder.add(record);
        System.out.println(record);
        System.out.println(spliter);

    }

    private void cVigenere() {
        System.out.println(spliter);
        System.out.print(ciphering);
        src.nextLine();
        String Pattern = src.nextLine();
        String hashCode = FacadeAlgo.getFacadeAlgo().encodeVigenere(Pattern);
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
