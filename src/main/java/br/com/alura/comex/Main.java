package br.com.alura.comex;

public class Main {

    public static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.nome = "Espelho";
        produto1.descricao = "Moldura cinza";
        produto1.precoUnitario = 89.90;
        produto1.quantidade = 10;

        Produto produto2 = new Produto();
        produto2.nome = "Espiriteira";
        produto2.descricao = "Combustível utilizado: Alcool";
        produto2.precoUnitario = 250.99;
        produto2.quantidade = 35;

        /*Exercício 2 (Crie Classe do produto)
        System.out.println("nome :" + produto1.nome + "\nDescrição: " + produto1.descricao
                + "\nPreço: " + produto1.precoUnitario + "\nQuantidade: " + produto1.quantidade);
        */

        /* Exercicio 3 (Comparando dois produtos)
        System.out.println("Produto 1 é igual produto 2 ? " + (produto1 == produto2));
        System.out.println("Nome produto 1 é igual ao Nome produto 2? " + (produto1.nome == produto2.nome) +
                "\nDescrição produto 1 é igual ao Descrição produto 2? " + (produto1.descricao == produto2.descricao));
        */

        //Exercício 04 (Crie um comportamento de impressão dos dados de um produto)
        produto1.imprimirDadosProduto();
        produto2.imprimirDadosProduto();
    }
}