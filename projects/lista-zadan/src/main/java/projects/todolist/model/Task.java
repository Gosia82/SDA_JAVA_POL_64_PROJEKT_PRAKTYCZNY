package projects.todolist.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

public class Task {

    private String name;// nazwa zadania
    private LocalDateTime createdOn;// data utworzenia zadania
    private LocalDateTime expectedCompletedOn;// oczekiwana data zakończenia
    private LocalDateTime comlpetedOn;//faktyczna data zakończenia


    public Task() {
    }

    public Task(String name, LocalDateTime createdOn, LocalDateTime expectedCompletedOn, LocalDateTime comlpetedOn) {
        this.name = name;
        this.createdOn = createdOn;
        this.expectedCompletedOn = expectedCompletedOn;
        this.comlpetedOn = comlpetedOn;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public LocalDateTime getCreatedOn() { return createdOn; }

    public void setCreatedOn(LocalDateTime createdOn) { this.createdOn = createdOn; }

    public LocalDateTime getExpectedCompletedOn() { return expectedCompletedOn; }

    public void setExpectedCompletedOn(LocalDateTime expectedCompletedOn) { this.expectedCompletedOn = expectedCompletedOn; }

    public LocalDateTime getComlpetedOn() { return comlpetedOn; }

    public void setComlpetedOn(LocalDateTime comlpetedOn) { this.comlpetedOn = comlpetedOn; }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", createdOn=" + createdOn +
                ", expectedCompletedOn=" + expectedCompletedOn +
                ", comlpetedOn=" + comlpetedOn +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        if (name != null ? !name.equals(task.name) : task.name != null) return false;
        return createdOn != null ? createdOn.equals(task.createdOn) : task.createdOn == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        return result;
    }


}
