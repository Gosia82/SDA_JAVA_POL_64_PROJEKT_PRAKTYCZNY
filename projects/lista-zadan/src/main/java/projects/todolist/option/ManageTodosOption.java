package projects.todolist.option;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;
import java.util.Set;

public class ManageTodosOption implements Option {

    private static final Logger log = LoggerFactory.getLogger(ManageTodosOption.class);

    @Override
    public void executeOption(String option) {
        switch (option) {
            case "1":
            case "2":
            case "3":
                break;
        }
    }
    public void showWelcomeMessage() {
        System.out.println("\nZarzadzanie listami zdan");
    }

    public void showOptions() {
        System.out.println("\nMenu:");
        System.out.println("\t1. Dodaj liste zadan");
        System.out.println("\t2. Pokaz liste zadan");
        System.out.println("\t3. Usun liste zadan");
        System.out.println("\t0. Wroc");
    }

    public String getUserOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nTwór wybór: ");
        return scanner.nextLine();
    }

    public  boolean validateOption(String option) {
        return Set.of("1", "2", "3", "0").contains(option);
    }



    public  boolean checkIsExitOption(String option) {
        return "0".equals(option);
    }

    public  void executeInvalidOption(String option) {
        System.out.println("\nNiestety '" + option + "' jest niepoprawnym wyborem");
    }

    public  void showExitMessage() {
        System.out.println("\nDo zobaczenia!");
    }
}

