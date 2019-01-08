package com.company.engine;

public class СreateCharacter {
    private static int CharSTR = 0;
    private static int CharAGIL = 0;
    private static int CharINT = 0;
    private static String CharName = "Рикардо Миллос";
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
        CharINT+=newCharINT;
    }
    public int getCharINT(){
        return CharINT;
    }


}
