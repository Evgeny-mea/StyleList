package com.mea.stylelist;

public class State {private String name; // название
    private String capital;              // столица
    private int flagResource;            // ресурс флага

    public State(String name, String capital, int flag){

        this.name=name;
        this.capital=capital;
        this.flagResource=flag;
    }
//------------------- Взять и положить ИМЯ ---------------------------------------------------------
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
//------------------- Взять и положить СТОЛИЦУ------------------------------------------------------
    public String getCapital() {
        return this.capital;
    }
    public void setCapital(String capital) {
        this.capital = capital;
    }
//-------------------- Взять и положить ИЗО флага---------------------------------------------------
    public int getFlagResource() {
        return this.flagResource;
    }
    public void setFlagResource(int flagResource) {
        this.flagResource = flagResource;
    }
}

