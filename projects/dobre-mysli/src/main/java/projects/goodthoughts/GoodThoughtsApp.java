package projects.goodthoughts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import projects.goodthoughts.model.Quote;

import java.time.LocalDateTime;

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
    }
}
