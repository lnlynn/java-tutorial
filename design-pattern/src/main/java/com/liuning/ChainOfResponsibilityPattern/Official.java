package com.liuning.ChainOfResponsibilityPattern;

public abstract class Official {

    protected String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    protected abstract void serve(Emperor emperor);
}
