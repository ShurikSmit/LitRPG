package com.company.engine;

public class crtCharTest {
    public static void main(String[] args) throws Exception {
        CreateCharacter createCharacter = new CreateCharacter();

        createCharacter.changeStats(1, "CharSTR");
        System.out.println(createCharacter.getCharSTR());
        createCharacter.CreateCharFile();
    }
}
