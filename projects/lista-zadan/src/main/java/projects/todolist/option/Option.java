package projects.todolist.option;

import java.util.Scanner;
import java.util.Set;

public interface Option {

     void executeOption(String option);

    default void run(Object... args) {
        showWelcomeMessage();
        while (true) {
            showOptions();
            String option = getUserOption();
            if (validateOption(option)) {
                executeOption(option);
                if (checkIsExitOption(option)) {
                    break;
                }
            } else {
                executeInvalidOption(option);
            }
        }
        showExitMessage();
    }

    default void showExitMessage() {}

    default void executeInvalidOption(String userInput) { }

    default boolean checkIsExitOption(String userInput) { return true; }

    default boolean validateOption(String userInput) { return true; }

    default String getUserOption() { return " "; }

    default void showOptions() {}

    default void showWelcomeMessage() {}
}
