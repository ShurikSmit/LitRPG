package com.company.engine.Money;

public class TradeMoney extends Money {
    TradeMoney(int MoneyGold,int MoneySilver, int MoneyCopper){
        setMoneyGold(MoneyGold);
        setMoneySilver(MoneySilver);
        setMoneyCopper(MoneyCopper);
    }
    TradeMoney(int MoneyCopper){
        setMoneyCopper(MoneyCopper);
        setMoneySilver(0);
        setMoneyGold(0);
    }
    public void giveMoney(Money personMoney){
        PlayerMoney playerMoney = new PlayerMoney();
//        System.out.println("den`gi player" );
//        playerMoney.sumMoney();
//        System.out.println("den`gi player give money" );
//        sumMoney();
        int newPlayerMoney= playerMoney.convertedToCopper()-convertedToCopper();
        playerMoney.convertedCopperToBasic(newPlayerMoney);

        int newPersonMoney = personMoney.convertedToCopper()+convertedToCopper();
        personMoney.convertedCopperToBasic(newPersonMoney);
//        System.out.println("den`gi player" );
//        playerMoney.sumMoney();
    }
    public void takeMoney(Money personMoney){
        PlayerMoney playerMoney =new PlayerMoney();
//        System.out.println("den`gi player" );
//        playerMoney.sumMoney();
//        System.out.println("den`gi player give money" );
//        sumMoney();
        int newPlayerMoney= playerMoney.convertedToCopper()+convertedToCopper();
        playerMoney.convertedCopperToBasic(newPlayerMoney);

        int newPersonMoney = personMoney.convertedToCopper()-convertedToCopper();
        personMoney.convertedCopperToBasic(newPersonMoney);
//        System.out.println("den`gi player" );
//        playerMoney.sumMoney();
    }
}
