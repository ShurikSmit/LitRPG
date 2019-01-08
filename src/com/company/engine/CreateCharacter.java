package com.company.engine;
import com.company.engine.jasypt.Cript;

import java.io.*;
import java.lang.*;
public class CreateCharacter {
    private static int CharSTR = 0;
    private static int CharAGIL = 0;
    private static int CharINT = 0;
    private static String CharName = "Рикардо Милос";
    public void setCharSTR(int newCharSTR){
        CharSTR+=newCharSTR;
    }
    public int getCharSTR(){
        return CharSTR;
    }
    public void setCharAGIL(int newCharAGIL){
        CharAGIL+=newCharAGIL;
    }
    public int getCharAGIL(){
        return CharAGIL;
    }
    public void setCharINT(int newCharINT){
        CharINT+= newCharINT;
    }
    public int getCharINT(){
        return CharINT;
    }
    public void setCharName(String newCharName){
        CharName = newCharName;
    }
    public String getCharName(){
        return CharName;
    }

    public void CreateCharFile () throws IOException {
        FileWriter fr = new FileWriter("CharFile.txt");
        String text = "";
        text+= "NAME:"+getCharName()+"\n";
        text+= "AGIL:"+getCharAGIL()+"\n";
        text+= "INT:"+getCharINT()+"\n";
        text+= "STR:"+getCharSTR()+"\n";
        Cript cript = new Cript();
        text = cript.StartCript(text);
        fr.write(text);
        fr.close();
    }
    //Смена статов на вход идёт
    //type если 1 стат плюсуется, 0 отнимается
    //String CharSTR, CharAGIL, CharINT
    public void changeStats(int type, String StatsName){
        int number;
        if (type == 0){
            number=-1;
        }else{
            number=1;
        }
        switch (StatsName){
            case "CharSTR": setCharSTR(number);
                 break;
            case "CharAGIL":setCharAGIL(number);
                break;
            case "CharINT":setCharINT(number);
                break;
        }
    }
}
