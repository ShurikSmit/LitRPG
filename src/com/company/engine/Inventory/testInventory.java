package com.company.engine.Inventory;

public class testInventory {
    public static void main(String[] args) {
        Item palka = new Item ("Palka", "weapon", "rare", 1);
        Item trava = new Item ("Travka", "Food", "Common", 100);
        Inventory inv = new Inventory(5, "GG");
        inv.addItem(palka);
        inv.addItem(palka);
        inv.addItem(trava);
        System.out.println("Инв перса в начале");
        for(String name:inv.getItemsList()){
            System.out.println(name);
        }
        System.out.println("Инв барыги в начале");

        Inventory invT = new Inventory(5, "trader");
        invT.addItem(palka);
        invT.addItem(trava);
        invT.addItem(palka);
        for(String name:invT.getItemsList()){
            System.out.println(name);
        }
        System.out.println("Инв перса после покупки");
        TradeItems trade = new TradeItems(inv, invT);
        trade.chooseSell(inv.getItem(0));
        trade.chooseSell(inv.getItem(1));
        trade.chooseBuy(invT.getItem(1));
        trade.verification(true);
        trade.trade();
        for(String name:inv.getItemsList()){
            System.out.println(name);
        }
        System.out.println("Инв торгаша после продажи");
        for(String name:invT.getItemsList()){
            System.out.println(name);
        }
//        System.out.println("name: "+palka.getName()+" type: "+palka.getType()+" rank: "+palka.getRank());
    }
}
