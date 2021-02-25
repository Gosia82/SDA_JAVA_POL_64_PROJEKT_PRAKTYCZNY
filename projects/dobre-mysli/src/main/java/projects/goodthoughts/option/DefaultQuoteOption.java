package projects.goodthoughts.option;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import projects.goodthoughts.model.Quote;
import projects.goodthoughts.service.QuoteService;

import java.time.LocalDateTime;

public class DefaultQuoteOption {

    private static final Logger logger = LoggerFactory.getLogger(DefaultQuoteOption.class);


    private final QuoteService quoteService = new QuoteService();

    public static void main(String[] args) {
        DefaultQuoteOption option = new DefaultQuoteOption();
        option.run();
    }

    public void run(Object... arg){

        logger.info("Uruchamianie opcji DefaultQuoteOption...");

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

        logger.info("Zamykanie opcji DefaultQuoteOption...");

    }

    private void showGoodbyeMessage() {
        //nothing
    }

    private void showInvalidOptionMessage(String userInput) {
        //nothing
    }

    private boolean checkIsExitOption(String userInput) {
        return true;
    }

    private void executeOption(String userInput) {
    Quote defaultQuote = quoteService.getDefaultQuote();
    logger.debug("Pobrany cytat: {}", defaultQuote);
        System.out.printf("\tCytat na dziś: \"%s\" (%s)%n", defaultQuote.getContent(), defaultQuote.getAuthor());
    }

    private boolean validateOption(String userInput) {
        return true;
    }

    private String getUserInput() {
       return " ";
    }

    private void showMenu() {

        //nothing
    }

    private void showWelcomeMessage() {
        System.out.println("Pobieram cytat dla Ciebie");
    }
}



