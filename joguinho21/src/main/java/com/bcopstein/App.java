package com.bcopstein;

public class App {
    public static void main(String[] args) {
      Baralho baralho = new Baralho();

      while (!baralho.vazio()){
        Carta c = baralho.pegaDeCima();
        System.out.println(c.toString());
      }
    }
}
