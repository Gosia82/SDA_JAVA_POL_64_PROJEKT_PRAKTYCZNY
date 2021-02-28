package projects.todolist;

import jdk.internal.jimage.ImageStrings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import projects.todolist.model.Task;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class TodoListApp {
    private static final Logger logger = LoggerFactory.getLogger(TodoListApp.class);

    public static void main(String[] args) {

        System.out.println("Witaj w liście zadań");
        logger.info("Uruchomienie aplikacji");
        Task task1 = new Task("Sprzątanie",LocalDateTime.of(2021,3,3,12,25,00), (LocalDateTime.of(2021,3,3,12,25,00).plusMinutes(60)), LocalDateTime.now());
        Task task2 = new Task("Nauka",LocalDateTime.of(2021,3,3,14,00,00), (LocalDateTime.of(2021,3,3,14,00,00).plusMinutes(60)), LocalDateTime.now());
        List<Task> taksks = new ArrayList<>();
        logger.debug("Zadanie na dziś 1: {}", task1);
        logger.debug("Zadanie na dziś 2: {}", task2);

        logger.debug(String.format("Oba zadania, 1: %s,2: %s ", task1,task2));


        TodoListApp listApp = new TodoListApp();
        listApp.run();

    }

        public void run(Object... args){
            logger.info("Rozpoczecie pracy z aplikacja");
            showWelcomeMessage();
            while(true){
                showMenu();
                String userInput = getUserInput();
                boolean isValidOption = validateOption(userInput);
                if(isValidOption){
                    //String option = userInput;
                    executeOption(userInput);
                    boolean isExitOption = checkIsExitOption(userInput);
                    if(isExitOption){
                        break;
                    }
                }else{
                    showInvalidOptionMessage(userInput);
                }
            }
            showGoodbyeMessage();

            logger.info("Zamykanie opcji Zarzadznie listami zadan...");

        }

    private void showGoodbyeMessage() {
        System.out.println("Zawsze do usług Twoj organizator");
    }

    private void showInvalidOptionMessage(String userInput) {
        //nothing
    }

    private boolean checkIsExitOption(String userInput) {
        return true;
    }

    private void executeOption(String userInput) {
        logger.debug("Wykonywana opcja: {}", userInput);
        switch (userInput) {
            case "0":
                Back();
            case "1":
               addTask();
            case "2":
                showListOfTasks();
            case "3":
                deleteOfTasks();
                break;
        }
    }
    private void deleteOfTasks() {
        List<Task> tasks = new ArrayList<Task>();
        tasks.remove(tasks);
    }

    private void showListOfTasks() {
        List<Task> tasks = new ArrayList<Task>();
        System.out.println(tasks);
    }

    private void Back() {
        System.out.println("Wroc do poczatku menu");
    }

    private void addTask() {
        List<Task> tasks = new ArrayList<Task>();
        tasks.add(new Task());
    }
    private boolean validateOption(String userInput) {
        Set<String> validOption = Set.of("0", "1","2","3");
        return validOption.contains(userInput);
    }

    private String getUserInput() { Scanner sc = new Scanner(System.in);
        System.out.print("Twoj wybor: ");
        String userInput = sc.nextLine();
        return userInput.trim();
    }

    private void showMenu() {
        System.out.println("\t1. Dodaj liste zadan");
        System.out.println("\t2. Pokaz listy zadan");
        System.out.println("\t3. Usun liste zadan");
        System.out.println("\t0. Wroc");
    }

    private void showWelcomeMessage() {
        System.out.println("To ja, Twoj osobisty kalendarz - Witaj! Co chcesz zrobic, wybierz opcję:");}
        }






