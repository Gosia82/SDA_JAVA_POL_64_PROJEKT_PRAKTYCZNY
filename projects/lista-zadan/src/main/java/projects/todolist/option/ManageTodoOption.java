package projects.todolist.option;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import projects.todolist.model.Task;

import java.util.ArrayList;
import java.util.List;

public class ManageTodoOption {

    private static final Logger logger = LoggerFactory.getLogger(ManageTodoOption.class);
    private List<Task> tasks = new ArrayList<Task>();

    public ManageTodoOption(List<Task> tasks) {
        this.tasks = tasks;
    }

    public ManageTodoOption() {

    }

    public static void main(String[] args) {

        System.out.println("Zarzadzanie listami zadan");
        ManageTodoOption option = new ManageTodoOption();
        option.run();
    }

    public void run(Object... args) {

        logger.info("Uruchomienie opcji Zarzadzanie listami zadan");
        addTask();
        showListOfTasks();
        deleteOfTasks();
        Back();

        logger.info("Zamykanie opcji Zarzadznie listami zadan...");

    }

    private void Back() {
        System.out.println("Wroc do poczatku menu");
    }

    private void deleteOfTasks() {
        tasks.remove(tasks);
    }

    private void showListOfTasks() {
        System.out.println(tasks);
    }

    private void addTask() {
        tasks.add(new Task());
    }
}



