package com.example.personal_daybook.model;

public class Task {
    private String text;
    private Boolean done;

    public Task(String text){
        this.text = text;
        this.done = false;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public Boolean getDone() {
        return done;
    }
    public void setDone(Boolean done) {
        this.done = done;
    }

}
