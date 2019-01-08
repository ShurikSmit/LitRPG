package com.company.engine;

import com.company.engine.jasypt.Cript;

import java.io.FileReader;
import java.util.Scanner;

public class crtCharTest {
    public static void main(String[] args) throws Exception {
        CreateCharacter createCharacter = new CreateCharacter();
        createCharacter.changeStats(1, "CharSTR");
        System.out.println(createCharacter.getCharSTR());
        createCharacter.CreateCharFile();
        FileReader fr = new FileReader("CharFile.txt");
        Scanner sc = new Scanner(fr);

        int i=0;
        String s= "";
        while (sc.hasNextLine()){
            s+=sc.nextLine();
            System.out.println(s);
        }
        fr.close();
        Cript cript = new Cript();
        cript.startDisCript(s);
        System.out.println(cript.startDisCript(s));

    }
}
