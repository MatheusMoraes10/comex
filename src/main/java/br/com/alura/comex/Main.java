package br.com.alura.comex;

public class Main {

    public static void main(String[] args) {

        Produto produto1 = new Produto();

        produto1.nome = "Espelho";
        produto1.descricao = "Moldura cinza";
        produto1.precoUnitario = 89.90;
        produto1.quantidade = 10;

        System.out.println("nome :" + produto1.nome + "\nDescrição: " + produto1.descricao
                + "\nPreço: " + produto1.precoUnitario + "\nQuantidade: " + produto1.quantidade);

    }
}