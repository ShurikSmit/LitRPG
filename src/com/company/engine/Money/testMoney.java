package com.company.engine.Money;

public class testMoney {
    public static void main(String[] args) {
        //Money money = new Money();
        Money money = new Money(1,91,99);
        System.out.println("den`gi money" );
        money.showMoney();
//        money.changeMoney(true,1,2,999 );
//        money.showMoney();
//        money.changeMoney(false,1,2,999 );
//        money.showMoney();
        PlayerMoney playerMoney = new PlayerMoney();


       TradeMoney tradeMoney = new TradeMoney(0, 5, 1);
       tradeMoney.takeMoney(money);

       System.out.println("den`gi money" );
       money.showMoney();

    }
}
