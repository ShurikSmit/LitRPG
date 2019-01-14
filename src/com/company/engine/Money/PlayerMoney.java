package com.company.engine.Money;

public class PlayerMoney extends Money{
    PlayerMoney(){
        //тут нужно подтянуть значение голды игрока из файла
        setMoneyCopper(10);
        setMoneySilver(9);
        setMoneyGold(1);
    }
}
