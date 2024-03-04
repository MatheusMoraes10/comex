package br.com.alura.comex;

public class Produto {
    String nome;
    String descricao;
    double precoUnitario;
    int quantidade;

    public void imprimirDadosProduto () {

        System.out.println(">> Dados do produto" + "\n:: Nome: " + this.nome + "\n:: Descrição: "
                + this.descricao + "\n:: Preço: " + this.precoUnitario + "\n:: Quantidade: " + this.quantidade);
    }

}
