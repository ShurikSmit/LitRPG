package com.company.engine.Money;

public class testMoney {
    public static void main(String[] args) {
        //Money money = new Money();
        Money money = new Money(1,91,99);
        money.sumMoney();
        money.changeMoney(true,1,2,999 );
        money.sumMoney();
        money.changeMoney(false,1,2,999 );
        money.sumMoney();
//        PlayerMoney playerMoney = new PlayerMoney();
//        playerMoney.sumMoney();
    }
}
