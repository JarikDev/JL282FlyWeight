package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        FlyWeightGarage flyWeightGarage=new FlyWeightGarage();
        Mercedes mercedes=flyWeightGarage.getMercedes("Green");
        Mercedes mercedes2=flyWeightGarage.getMercedes("Green");
        System.out.println(mercedes.color);
        System.out.println(mercedes2.color);
    }
}

class Mercedes {
    String color;
}

class FlyWeightGarage {
    Map<String, Mercedes> map = new HashMap<>();

    Mercedes getMercedes(String color) {
        Mercedes mercedes = map.get(color);
        if (mercedes == null) {
            mercedes=new Mercedes();
            mercedes.color = color;
            map.put(color, mercedes);
        }
        return mercedes;
    }
}