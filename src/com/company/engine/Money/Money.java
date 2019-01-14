package com.company.engine.Money;

public class Money {
    private int moneySilver;
    private int moneyGold;
    private int moneyCopper;
    public Money(){
        moneyGold = 0;
        moneySilver=0;
        moneyCopper = 0;
    }
    public Money(int Gold, int Silver, int Copper){
        moneyGold = Gold;
        moneySilver =Silver;
        moneyCopper=Copper;
    }
    public int getMoneyCopper() {
        return moneyCopper;
    }

    public void setMoneyCopper(int moneyCopper) {

        if (moneyCopper>99){

            this.moneyCopper=moneyCopper%100;
            setMoneySilver((moneyCopper-this.moneyCopper)/100);
        }else {
            this.moneyCopper = moneyCopper;
        }
    }

    public int getMoneyGold() {
        return moneyGold;
    }

    public void setMoneyGold(int moneyGold) {
        this.moneyGold = moneyGold;
    }

    public int getMoneySilver() {
        return moneySilver;
    }

    public void setMoneySilver(int moneySilver) {
        if (moneySilver>99){
            this.moneySilver=moneySilver%100;
            setMoneyGold((moneySilver-this.moneySilver)/100);
        }else {
            this.moneySilver = moneySilver;
        }
    }

   public void showMoney (){
        System.out.println(getMoneyGold()+" золотых "+getMoneySilver()+" себрянных "+getMoneyCopper()+" медных");
    }
    // меняет значения денег Если add true то плюсует.
   public void changeMoney(boolean add, int moneyGold, int moneySilver, int moneyCopper){
        int changeCopper = convertedToCopper(moneyGold, moneySilver, moneyCopper);
        if (add) setMoneyCopper(convertedToCopper()+changeCopper);
        else  setMoneyCopper(convertedToCopper()-changeCopper);
   }
   // переводит все деньги в копер
   public int convertedToCopper(){
        int Copper = getMoneyGold()*10000+getMoneySilver()*100+getMoneyCopper();
        return Copper;
    }
   // переводит все деньги в коппер (входящие значения)
   public int convertedToCopper(int moneyGold,int moneySilver, int moneyCopper) {
        int Copper = moneyGold*10000+moneySilver*100+moneyCopper;
        return Copper;
   }

   public void convertedCopperToBasic(int Copper){
        setMoneyCopper(Copper);
   }
}
