package com.example.mylogin.entity;

public class Contactor {
    String title;
    String subtitle;
    String content;

    public Contactor(String title, String subtitle, String texttitle) {
        this.title = title;
        this.subtitle = subtitle;
        this.content = texttitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String texttitle) {
        this.content = texttitle;
    }

}
