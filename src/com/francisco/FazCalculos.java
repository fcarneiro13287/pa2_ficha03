package com.francisco;

public class FazCalculos {
    public static void main(String[] args) {
        Calculadora texas = new Calculadora();

        System.out.println("Sum="+texas.soma(2.5,2.7,4.5));
        System.out.println("Subtração="+texas.subtracao(2.5,2.7,4.5));
        System.out.println("Multiplicação="+texas.multiplicacao(2.5,2.7,4.5));
        System.out.println("Divisão="+texas.divisao(2.5,2.7,4.5));
    }
}
