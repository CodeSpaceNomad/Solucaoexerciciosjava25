package com.bcopstein;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaCorrente cc = null;
        int numero = 1;
        ContaCorrente outra = new ContaCorrente(numero++, "Zezinho");
        while (true) {
            try {
                System.out.println("Digite o nome do correntista: ");
                String nome = sc.nextLine();
                cc = new ContaCorrente(numero, nome);
                cc.deposita(5000);
                cc.saca(300);
                cc.transfere(750, outra);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println("Tente novamente!\n");
            }
            sc.close();
        }
        System.out.println(cc.toString());
        System.out.println(outra.toString());
    }
}
