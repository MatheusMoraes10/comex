package br.com.alura.comex;

public class Main {

    public static void main(String[] args) {

        Produto produto1 = new Produto("Espelho");
        produto1.setDescricao("Moldura cinza");
        produto1.setPrecoUnitario(89.90);
        produto1.setQuantidade(10);

        Produto produto2 = new Produto("Espiriteira");
        produto2.setDescricao("Combustível utilizado: Alcool");
        produto2.setPrecoUnitario(250.99);
        produto2.setQuantidade(35);

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
//        Endereco endereco1 = new Endereco();
//        endereco1.bairro = "Santana";
//        endereco1.cidade = "São Paulo";
//        endereco1.complemento = "Casa de esquina";
//        endereco1.estado = "SP";
//        endereco1.rua = "Braz Leme";
//        endereco1.numero = 1000;
//
//        Cliente cliente1 = new Cliente();
//        cliente1.nome = "Angelo";
//        cliente1.cpf = "78945612399";
//        cliente1.email = "alura@alura.com";
//        cliente1.profissao = "Programador";
//        cliente1.telefone = "11954481236";
//        cliente1.endereco = endereco1;
//
//        System.out.println(cliente1.nome);
//        System.out.println(cliente1.cpf);
//        System.out.println(cliente1.email);
//        System.out.println(cliente1.profissao);
//        System.out.println(cliente1.telefone);
//        System.out.println(cliente1.endereco.bairro);
//        System.out.println(cliente1.endereco.cidade);
//        System.out.println(cliente1.endereco.complemento);
//        System.out.println(cliente1.endereco.estado);
//        System.out.println(cliente1.endereco.rua);
//        System.out.println(cliente1.endereco.numero);

//        Exercício 06 (Restringir visibilidade das propriedades do Produto)
//        System.out.println("nome :" + produto1.getNome() + "\nDescrição: " + produto1.getDescricao()
//                + "\nPreço: " + produto1.getPrecoUnitario() + "\nQuantidade: " + produto1.getQuantidade());

//        Exercício 7) Crie uma instância de Produto obrigando o usuário a fornecer um nome
//        Produto produto3 = new Produto("Celular");
//        System.out.println(produto3.getNome());

//        Exercício 8) Forneça várias opções de criação da classe Cliente.
        Endereco endereco1 = new Endereco();
        endereco1.bairro = "Santana";
        endereco1.cidade = "São Paulo";
        endereco1.complemento = "Casa de esquina";
        endereco1.estado = "SP";
        endereco1.rua = "Braz Leme";
        endereco1.numero = 1000;
//      Criação obrigando com todos os atributos
        Cliente cliente1 = new Cliente("José", "531578963548595", "alura@alura.com", "Jornalista", "66453321455", endereco1);
//        Criação obrigando com nome e cpf
        Cliente cliente2 = new Cliente("Josefino", "77855622165");
//        Criação obrigando com nome, cpf e email
        Cliente cliente3 = new Cliente("Jusberto", "663564866521", "jusberto@email.com");
    }
}