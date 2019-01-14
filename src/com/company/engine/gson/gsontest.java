package com.company.engine.gson;

import com.company.engine.Money.Money;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class gsontest {
    public static void main(String[] args) {
        Money money1 = new Money(0,99,0);
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        System.out.println(gson.toJson(money1));
    }
}
