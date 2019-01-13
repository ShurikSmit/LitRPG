package com.company.engine.Money;

public class Money {
    private int moneySilver;
    private int moneyGold;
    private int moneyCopper;
    Money(){
        moneyGold = 0;
        moneySilver=0;
        moneyCopper = 0;
    }
    Money(int Gold, int Silver, int Copper){
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
            setMoneySilver((moneyCopper-moneyCopper%100)/100+getMoneySilver());
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
            setMoneyGold(((moneySilver-moneySilver%100)/100)+getMoneyGold());
        }else {
            this.moneySilver = moneySilver;
        }
    }

   public void sumMoney (){
        System.out.println(getMoneyGold()+" золотых "+getMoneySilver()+" себрянных "+getMoneyCopper()+" медных");
    }
   public void changeMoney(boolean add, int moneyGold, int moneySilver, int moneyCopper){
        if (add){
            moneyCopper+=getMoneyCopper();
            setMoneyCopper(moneyCopper);
        }else {

        }
   }
}
