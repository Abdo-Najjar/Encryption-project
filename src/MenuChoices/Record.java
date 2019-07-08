package MenuChoices;

import java.util.*;
import project.pkg3.Messages;

public class Record {

    public static List<String> recorder = new ArrayList<>();

    public void PrintRecords() {
        System.out.println(Messages.spliter);
        if (recorder.isEmpty()) {
            System.out.println("Record history is Empty");
            System.out.println(Messages.spliter);
            return;
        }
        recorder.forEach((t) -> {
            System.out.println(" - "+t);
        });
        System.out.println(Messages.spliter);
    }

}
