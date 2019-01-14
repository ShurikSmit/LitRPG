package com.company.engine.Money;

public class testMoney {
    public static void main(String[] args) {
        //Money money = new Money();

        Money money = new Money(1,91,99);
        System.out.println("den`gi торговца" );
        money.showMoney();
//        money.changeMoney(true,1,2,999 );
//        money.showMoney();
//        money.changeMoney(false,1,2,999 );
//        money.showMoney();
        PlayerMoney playerMoney = new PlayerMoney();


       TradeMoney tradeMoney = new TradeMoney(2, 5, 1);
        System.out.println("Сумма сделки" );
        tradeMoney.showMoney();
        System.out.println("Даю деньгу");
       tradeMoney.giveMoney(money);
        System.out.println("Забираю деньгу");
        tradeMoney.takeMoney(money);
       System.out.println("den`gi money" );
       money.showMoney();

    }
}
