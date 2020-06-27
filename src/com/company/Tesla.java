package com.company;

public class Tesla extends Car {
    int watt;

    public int getWatt() {
        return watt;
    }

    public void setWatt(int value) {
        if (value > 0)
            watt = value;
        else
            System.out.println("Мощьность отрицательная");
    }

    public Tesla(String Name, int Speed, String Color, int watt) {
        super(Name, Speed, Color);
        setWatt(watt);
    }

    @Override
    public String toString() {
        return "Name:" + name + " Speed:" + getSpeed() + " Color:" + color + " Мощьность:" + watt;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == this.getClass()) {
            obj = (Tesla) obj;
            if (((Tesla) obj).getSpeed() == this.getSpeed() && ((Tesla) obj).getWatt()==this.getWatt() && ((Tesla) obj).name == this.name && ((Tesla) obj).color == this.color) {
                return true;
            }
        }
        return  false;
    }
}

