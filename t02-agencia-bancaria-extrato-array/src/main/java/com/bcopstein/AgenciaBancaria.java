package com.bcopstein;

public class AgenciaBancaria {
    private static final int MAXCONTAS = 100;
    private int numero;
    private String nome;
    private ContaCorrente[] contas;
    private int proxLivre;

    public AgenciaBancaria(int numero, String nome) {
        if (numero <= 0) {
            throw new IllegalArgumentException("Número da agência deve ser positivo.");
        }
        if (nome == null || nome.length() < 2) {
            throw new IllegalArgumentException("Nome da agência deve ter pelo menos dois caracteres.");
        }
        this.numero = numero;
        this.nome = nome;
        this.contas = new ContaCorrente[MAXCONTAS];
        this.proxLivre = 0;
    }

    public void cadastrarConta(ContaCorrente conta) {
        if (proxLivre >= MAXCONTAS) {
            throw new IllegalStateException("Limite máximo de contas atingido.");
        }
        for (int c = 0; c<proxLivre; c++) {
            if (contas[c].getNumero() == conta.getNumero()) {
                throw new IllegalArgumentException("Já existe uma conta com esse número.");
            }
        }
        contas[proxLivre] = conta;
        proxLivre++;
    }

    public ContaCorrente recuperarConta(int numeroConta) {
        for (int i=0;i<proxLivre;i++) {
            if (contas[i].getNumero() == numeroConta) {
                return contas[i];
            }
        }
        return null;
    }

    public void encerrarConta(int numeroConta) {
        ContaCorrente conta = recuperarConta(numeroConta);
        if (conta == null) {
            throw new IllegalArgumentException("Conta não encontrada.");
        }
        if (!conta.isAtiva()) {
            throw new IllegalStateException("Conta já está encerrada.");
        }
        conta.fecha();
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }
}