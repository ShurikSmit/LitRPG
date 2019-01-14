package com.company.engine.Money;

public class TradeMoney extends Money {
    public TradeMoney(int MoneyGold,int MoneySilver, int MoneyCopper){
        setMoneyGold(MoneyGold);
        setMoneySilver(MoneySilver);
        setMoneyCopper(MoneyCopper);
    }
    public TradeMoney(int MoneyCopper){
        setMoneyCopper(MoneyCopper);
        setMoneySilver(0);
        setMoneyGold(0);
    }
    public TradeMoney(Money personMoney){
        this.setMoneyGold(personMoney.getMoneyGold());
        this.setMoneySilver(personMoney.getMoneySilver());
        this.setMoneyCopper(personMoney.getMoneyCopper());
        personMoney.setMoneyGold(0);
        personMoney.setMoneySilver(0);
        personMoney.setMoneyCopper(0);
    }
    public void giveMoney(Money personMoney){
        PlayerMoney playerMoney = new PlayerMoney();
//        System.out.println("den`gi player" );
//        playerMoney.sumMoney();
//        System.out.println("den`gi player give money" );
//        showMoney();
        int newPlayerMoney= playerMoney.convertedToCopper()-convertedToCopper();
        playerMoney.convertedCopperToBasic(newPlayerMoney);

        int newPersonMoney = personMoney.convertedToCopper()+convertedToCopper();
        personMoney.convertedCopperToBasic(newPersonMoney);
//        System.out.println("den`gi player" );
//        playerMoney.showMoney();
    }
    public void takeMoney(Money personMoney){
        PlayerMoney playerMoney =new PlayerMoney();
//        System.out.println("den`gi player" );
//        playerMoney.sumMoney();
//        System.out.println("den`gi player give money" );
//        showMoney();
        int newPlayerMoney= playerMoney.convertedToCopper()+convertedToCopper();
        playerMoney.convertedCopperToBasic(newPlayerMoney);

        int newPersonMoney = personMoney.convertedToCopper()-convertedToCopper();
        personMoney.convertedCopperToBasic(newPersonMoney);
//        System.out.println("den`gi player" );
//        playerMoney.sumMoney();
    }

    public void takeMoney(){
        PlayerMoney playerMoney =new PlayerMoney();
        int newPlayerMoney = playerMoney.convertedToCopper()+convertedToCopper();
        playerMoney.convertedCopperToBasic(newPlayerMoney);
    }
}
