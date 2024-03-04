package br.com.alura.comex;

public class Produto {
    private String nome;
    private String descricao;
    private double precoUnitario;
    private int quantidade;

    public Produto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void imprimirDadosProduto () {

        System.out.println(">> Dados do produto" + "\n:: Nome: " + this.nome + "\n:: Descrição: "
                + this.descricao + "\n:: Preço: " + this.precoUnitario + "\n:: Quantidade: " + this.quantidade);
    }

}
