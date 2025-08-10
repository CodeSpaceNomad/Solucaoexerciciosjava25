package com.bcopstein;

public class App {
    public static void main(String[] args) {
        boolean dataes = true;
        int diasema = 1;

        if (diasema < 1 || diasema > 7) {
            throw new IllegalArgumentException("Número inválido, digite um número de 1 até 7");
        }
        if (dataes == false){ 

        switch (diasema) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda-feira");
            case 3 -> System.out.println("Terça-feira");
            case 4 -> System.out.println("Quarta-feira");
            case 5 -> System.out.println("Quinta-feira");
            case 6 -> System.out.println("Sexta-feira");
            case 7 -> System.out.println("Sábado");
        }
        } else {
            switch (diasema) {
            case 1 -> System.out.println("Dia do senhor");
            case 2 -> System.out.println("Segunda-feira");
            case 3 -> System.out.println("Terça-feira");
            case 4 -> System.out.println("Quarta-feira");
            case 5 -> System.out.println("Quinta-feira");
            case 6 -> System.out.println("Sexta-feira");
            case 7 -> System.out.println("Dia de descanso");
        }           
        }
    }
}
