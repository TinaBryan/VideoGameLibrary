package com.company;

public class Game {

    // create the model for the game
    // Add variables
    private String title;
    private String dueDate;

    // Create the constructor
    public Game(String title) {
        this.title = title;
        dueDate = " ";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}
