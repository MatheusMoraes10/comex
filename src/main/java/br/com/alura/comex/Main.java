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
//       produto1.imprimirDadosProduto();
//       produto2.imprimirDadosProduto();

//      Exercício 05 (Crie as classes Cliente e Endereco)
        Endereco endereco1 = new Endereco();
        endereco1.bairro = "Santana";
        endereco1.cidade = "São Paulo";
        endereco1.complemento = "Casa de esquina";
        endereco1.estado = "SP";
        endereco1.rua = "Braz Leme";
        endereco1.numero = 1000;

        Cliente cliente1 = new Cliente();
        cliente1.nome = "Angelo";
        cliente1.cpf = "78945612399";
        cliente1.email = "alura@alura.com";
        cliente1.profissao = "Programador";
        cliente1.telefone = "11954481236";
        cliente1.endereco = endereco1;

        System.out.println(cliente1.nome);
        System.out.println(cliente1.cpf);
        System.out.println(cliente1.email);
        System.out.println(cliente1.profissao);
        System.out.println(cliente1.telefone);
        System.out.println(cliente1.endereco.bairro);
        System.out.println(cliente1.endereco.cidade);
        System.out.println(cliente1.endereco.complemento);
        System.out.println(cliente1.endereco.estado);
        System.out.println(cliente1.endereco.rua);
        System.out.println(cliente1.endereco.numero);
    }
}