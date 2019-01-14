package com.company.engine.fastjson;
import com.alibaba.fastjson.JSON;
import com.company.engine.Money.Money;

public class JsonTest {
    public static void main(String[] args) {
        Money money = new Money(1,10,80);
        Money money1 = new Money(0,99,0);
        String jsonString = JSON.toJSONString(money);
        System.out.println(jsonString);

    }
}
