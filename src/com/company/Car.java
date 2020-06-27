package com.company;
public class Car {
    String name;
    private int speed;
    String color;

    public Car(String Name,int Speed,String Color){
        name = Name;
        SetSpeed(Speed);
        color = Color;
    }
    public int getSpeed(){ // Сеттер
        return speed;

    }
    public void SetSpeed(int value) {
        if (value > 0)
            speed = value;

    }
        @Override
        public String toString(){
            return "Name:"+name+" Speed:"+speed+" Color:"+color;
        }
    }

