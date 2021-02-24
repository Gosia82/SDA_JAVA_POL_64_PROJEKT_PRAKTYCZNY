package projects.goodthoughts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import projects.goodthoughts.model.Quote;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.Set;

public class GoodThoughtsApp {

    private static final Logger logger = LoggerFactory.getLogger(GoodThoughtsApp.class);

    public static void main(String[] args) {

        System.out.println("Witaj");
        logger.info("Uruchamianie aplikacji...");
        Quote quote1 = new Quote("Life is beautiful", "Zycie jest piekne","Leonidas","Komedia", LocalDateTime.now());
        Quote quote2 = new Quote ("Life is brytal", "Zycie jest brutalne","Killer","Lifestles",LocalDateTime.now().minusMinutes(3));

        logger.debug("Test cytatu 1:" + quote1);
        logger.debug("Test cytatu 2: {}", quote2);
        // druga wersja {} tożsama z pierwszą
        logger.debug(String.format("Oba cytaty, 1: %s,2: %s ", quote1,quote2));

        GoodThoughtsApp app = new GoodThoughtsApp();
        app.run();
    }
    
    public void run(Object... args){
        logger.info("Rozpoczecie pracy z aplikacją");
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
        logger.info("Zakończono pracę z aplikacją");
    }

    private void showGoodbyeMessage() {
        System.out.println("Bye, bye");
    }

    private void showInvalidOptionMessage(String userInput) {
        System.out.println("Wybrales nieprawidlowa opcje");
    }

    private boolean checkIsExitOption(String userInput) {
        return "0".equals(userInput);
    }

    private void executeOption(String option) {

    }

    private boolean validateOption(String userInput) {
        Set <String> validOption = Set.of("0", "1","2","3");
        return validOption.contains(userInput);
    }

    private String getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Twoj wybor: ");
        String userInput = sc.nextLine();
        return userInput.trim();
    }

    private void showMenu() {
        System.out.println("Wybierz opcje z listy ponizej: ");
        System.out.println("\t1. Pobierz domyslny cytat");
        System.out.println("\t2. Dodaj wlasny cytat");
        System.out.println("\t3. Wyswietl zapisane cytaty");
        System.out.println("\t0. Zakoncz");
    }

    private void showWelcomeMessage() {
        System.out.println("Witaj w aplikacji(" + LocalDateTime.now() + ")");
    }
}
