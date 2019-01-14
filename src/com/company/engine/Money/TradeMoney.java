package com.company.engine.Money;
//класс для обмена деньгами между кошельком игрока и кошельком трейдера
// при создании класса можно указать сразу сумму
// или экземпляр класса money (например подбор награды с убитого монстра)
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
    public boolean checkMoney(Money personMoney){
        PlayerMoney playerMoneyCheck = new PlayerMoney();
        if (playerMoneyCheck.convertedToCopper()>convertedToCopper() || personMoney.convertedToCopper()>convertedToCopper())
            return true;
        else
            return false;
    }
    public void giveMoney(Money personMoney){
        if(checkMoney(personMoney)) {
            PlayerMoney playerMoney = new PlayerMoney();
        System.out.println("den`gi player do zdelki" );
        playerMoney.showMoney();
//        System.out.println("den`gi player give money" );
//        showMoney();
            int newPlayerMoney = playerMoney.convertedToCopper() - convertedToCopper();
            playerMoney.convertedCopperToBasic(newPlayerMoney);

            int newPersonMoney = personMoney.convertedToCopper() + convertedToCopper();
            personMoney.convertedCopperToBasic(newPersonMoney);
        System.out.println("den`gi player posle zdelki" );
        playerMoney.showMoney();
        }
    }
    public void takeMoney(Money personMoney){
        if(checkMoney(personMoney)) {
            PlayerMoney playerMoney = new PlayerMoney();
        System.out.println("den`gi player do zdelki" );
        playerMoney.showMoney();
//        System.out.println("den`gi player give money" );
//        showMoney();
            int newPlayerMoney = playerMoney.convertedToCopper() + convertedToCopper();
            playerMoney.convertedCopperToBasic(newPlayerMoney);

            int newPersonMoney = personMoney.convertedToCopper() - convertedToCopper();
            personMoney.convertedCopperToBasic(newPersonMoney);
        System.out.println("den`gi player posle zdelki" );
        playerMoney.showMoney();
        }
    }

    public void takeMoney(){
        PlayerMoney playerMoney =new PlayerMoney();
        int newPlayerMoney = playerMoney.convertedToCopper()+convertedToCopper();
        playerMoney.convertedCopperToBasic(newPlayerMoney);
    }
}
