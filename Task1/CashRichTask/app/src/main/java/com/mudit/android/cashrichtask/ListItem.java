package com.mudit.android.cashrichtask;

public class ListItem {

    private String name;
    private String fund;
    private String currentValue;

    public ListItem(){

    }

    public ListItem(String name,String fund,String currentValue){

        this.name=name;
        this.fund=fund;
        this.currentValue=currentValue;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFund() {
        return fund;
    }

    public void setFund(String fund) {
        this.fund = fund;
    }

    public String getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(String currentValue) {
        this.currentValue = currentValue;
    }

}
