package org.example.service.tasks;

public class LoginTask extends Task{
    public LoginTask(String text, Task next) {
        super(text, next);
    }

    @Override
    public String completeTask(String input) {
        return null;
    }
}
