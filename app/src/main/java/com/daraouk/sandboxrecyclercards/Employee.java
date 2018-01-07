package com.daraouk.sandboxrecyclercards;

public class Employee {
    private String name;
    private String title;
    private String email;

    public Employee(String name, String title, String email) {
        this.name = name;
        this.title = title;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
