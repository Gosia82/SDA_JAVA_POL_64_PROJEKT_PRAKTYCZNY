package projects.todolist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import projects.todolist.option.TodoListOption;

public class TodoListApp {
    private static final Logger logger = LoggerFactory.getLogger(TodoListApp.class);

    public static void main(String[] args) {

//        System.out.println("Witaj w liście zadań");
//        logger.info("Uruchomienie aplikacji");
//        Task task1 = new Task("Sprzątanie", LocalDateTime.of(2021, 3, 3, 12, 25, 00), (LocalDateTime.of(2021, 3, 3, 12, 25, 00).plusMinutes(60)), LocalDateTime.now());
//        Task task2 = new Task("Nauka", LocalDateTime.of(2021, 3, 3, 14, 00, 00), (LocalDateTime.of(2021, 3, 3, 14, 00, 00).plusMinutes(60)), LocalDateTime.now());
//        List<Task> tasks = new ArrayList<>();
//
//
//        logger.debug("Zadanie na dziś 1: {}", task1);
//        logger.debug("Zadanie na dziś 2: {}", task2);
//
//        logger.debug(String.format("Oba zadania, 1: %s,2: %s ", task1, task2));


        TodoListOption todoListOption = new TodoListOption();
        todoListOption.run();

    }
}

