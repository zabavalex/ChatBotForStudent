package org.example.service.tasks;

public class PasswordTask extends Task{
    public PasswordTask(String text, Task next) {
        super(text, next);
    }

    @Override
    public String completeTask(String input) {
        return null;
    }
}
