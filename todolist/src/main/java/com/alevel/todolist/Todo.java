package com.alevel.todolist;

import java.util.Objects;

public class Todo {
    private final Long id;
    private final String text;
    private final Boolean done;

    public Todo(String text) {
        this.id = null;
        this.text = text;
        this.done = false;
    }

    public Todo(long id, String text, boolean done) {
        this.id = id;
        this.text = text;
        this.done = done;
    }

    public long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public boolean isDone() {
        return done;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return id == todo.id &&
                done == todo.done &&
                Objects.equals(text, todo.text);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, text, done);
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", done=" + done +
                '}';
    }
}
