package org.generics.adso.java.raw;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //tipo raw
        //define cada elemento
        //como de tipo Object
        List<String> nombres = new ArrayList<String>();
        nombres.add("Juan");
        nombres.add("Pablo");
        nombres.add("Pedro");

        //Casting: Convertir un Object a un tipo especifico
        String nom = nombres.get(0);

        for (Object o : nombres) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
            System.out.println(o);
        }
    }
}