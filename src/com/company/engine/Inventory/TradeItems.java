package com.company.engine.Inventory;

import com.company.engine.Money.*;
import java.util.ArrayList;

public class TradeItems {
    //значение сумм интовое, что бы не создавать лишние объекты Money
    private int buyPrice;
    private int sellPrice;
    private boolean verification = false;
    private TradeMoney tradeMoney;
    private Inventory playerInv;
    private ArrayList<Item> sellItems = new ArrayList<>();
    private Inventory traderInv;
    private ArrayList<Item> buyItems = new ArrayList<>();

    //ссылки на объкты Inventory персов
    TradeItems(Inventory playerInv, Inventory traderInv){
        this.playerInv = playerInv;
        this.traderInv = traderInv;
    }
    //создание списков покупки/продажи
    public void chooseSell(Item item){
        sellItems.add(item);
        sellPrice += item.getPrice();
    }
    public void chooseBuy(Item item){
        buyItems.add(item);
        buyPrice += item.getPrice();
    }
    public void verification(boolean player){
        if(player)
            verification = true;
    }
    public void trade(){
        //нужно условие на проверку денег
        if(verification)
        {
            for (Item item: buyItems){
                traderInv.removeItem(item);
                playerInv.addItem(item);
            }
            for (Item item: sellItems) {
                playerInv.removeItem(item);
                item.price.convertedToCopper();
//                уменьшение стоимости проданой шмотки в 2 раза
//                item.price.setMoneyCopper(item.getPrice()/2);
                item.price.convertedCopperToBasic(item.getPrice() / 2);
                traderInv.addItem(item);
            }
            // тут должнен быть обмен денег, но я не смог норм прикрутить класс TradeMoney
            System.out.println(sellPrice+" | "+buyPrice);
        }
        else System.out.println("neydacha");
    }
}
