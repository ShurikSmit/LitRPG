package com.company.engine.Inventory;
import com.company.engine.Money.*;

public class Item {
    private String name;
    private String type;
    private String rank;
    //мб нужно паблик, но вроде нельзя
    public Money price = new Money();
    // тут должна быть картинка шмотки

    public String getName(){ return name; }
    public String getType(){return type;}
    public String getRank(){return rank;}
    public void setRank(String rank){
        this.rank = rank;
    }
    public int getPrice(){
        return price.convertedToCopper();
    }

    Item(String name, String type, String rank, int price)
    {
        this.name = name;
        this.type = type;
        this.rank = rank;
        this.price.convertedCopperToBasic(price);
    }
}
