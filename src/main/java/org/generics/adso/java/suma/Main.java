package org.generics.adso.java.suma;

public class Main {

    private static <T extends Number> Double sumar(T a, T b) {
        Double resultado = a.doubleValue() + b.doubleValue();
        return resultado;

    }

    public static void main(String[] args) {
        //invocar el método sumar
        System.out.println(sumar(1, 2));
        System.out.println(sumar(1.6f, 2.83456712367854f));
        System.out.println(sumar(1.72d, 2.8354d));
    }
}
