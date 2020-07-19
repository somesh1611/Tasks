package com.example.tasks;

import java.util.ArrayList;
import java.util.List;

public class Content {
    private String Title;
    private String Body;
    private ArrayList<String> Admins = new ArrayList<String>();

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getBody() {
        return Body;
    }

    public void setBody(String body) {
        Body = body;
    }

    public List<String> getAdmins() {
        return Admins;
    }

    public void setAdmins(ArrayList<String> admins) {
        Admins = admins;
    }

    public void addAdmin(String admin){
        this.Admins.add(admin);
    }

    public Content(String title, String body, String... admins) {
        Title = title;
        Body = body;
        for (String admin : admins) {
            addAdmin(admin);
        }
    }
}
