package com.example.myapplication;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class Model {
    String name;
    String number;

    public Model(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public Model() {
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Character getProfileLetter(){
       return name.charAt(0);
    }
}
