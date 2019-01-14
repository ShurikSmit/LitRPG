package com.company.engine.Inventory;
import java.util.ArrayList;

public class Inventory {
    private String owner;
    private int size;
    private ArrayList<Item> items = new ArrayList<>(size);
    public void changeSize(int numb){
        if(numb >= 0)
        this.size += numb;
    }
    // добавить вещь в инвентарь
    public void addItem(Item item){
        if(size != 0 && size > items.size())
            this.items.add(item);
        else
            System.out.println("Ne hvataet mesta v inventare");
    }
    // удалить вещь
    public void removeItem(int index){
        this.items.remove(index);
    }
    public void removeItem(Item item){
        this.items.remove(item);
    }
    //получить объект вещи
    public Item getItem(int index){
        return items.get(index);
    }
    // получить список шмоток и их картинки(картинок нету)
    // возвращаемый список можна заменить на список Item, если будут картинки
    // нужен для отображения шмоток
    public ArrayList<String> getItemsList(){
        ArrayList<String> names = new ArrayList<>(items.size());
        for (Item item:items) {
            names.add(item.getName());
        }
        return names;
    }

    Inventory(int size, String owner){
        this.size = size;
        this.owner = owner;
    }
}
