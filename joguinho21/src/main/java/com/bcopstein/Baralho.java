package com.bcopstein;

public class Baralho {
    private static final int TAM_BARALHO = 52;
    private Carta[] cartas;
    private int cartaDeCima;
    public Baralho(){
        cartaDeCima = 0;
        cartas = new Carta[TAM_BARALHO];
        int pos = 0;
        for (Naipe n:Naipe.values()){
            for(Valor v:Valor.values()){
            Carta carta = new Carta(v,n);
            cartas[pos++] = carta;
            }
        }
       
        
        
    }

     public boolean vazio(){
            return cartaDeCima >= TAM_BARALHO;
        }

    public Carta pegaDeCima(){
        if (cartaDeCima == TAM_BARALHO)
        throw new IllegalStateException("Baralho vazio");
        Carta c = cartas [cartaDeCima];
        cartaDeCima++;
        return c;
    }
   // public void embaralho(){
        //te fode
    //}
}
