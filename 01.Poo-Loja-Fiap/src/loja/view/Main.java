package loja.view;
import loja.model.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto(); //Criando o objeto produto

        int op;

        do {
            System.out.println("\nEscolha uma opção: \n1-Cadastrar Produto \n2-Exibir dados do produto \n3-Comprar \n4-Adicionar ao estoque " +
                    "\n5-Aplicar desconto \n0-Sair");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Você escolheu cadastrar o produto!");

                    System.out.println("Digite o nome do produto: ");
                    String nome = sc.next() + sc.nextLine();
                    System.out.println("Digite o preço do produto R$: ");
                    double preco = sc.nextDouble();
                    System.out.println("Digite a quantidade do produto: ");
                    int quantidade = sc.nextInt();

                    produto.setNome(nome).setPreco(preco).setQuantidade(quantidade);

                    break;
                case 2:
                    if (produto.getNome() == null || produto.getNome().isEmpty()) { //null caso não haja nenhum dado e .isEmpty caso tenha sido cadastrado com um nome em branco
                        System.out.println("O produto ainda não foi cadastrado!");
                    } else {
                        produto.exibirInformacoes();
                    }
                    break;
                case 3:
                    if (produto.getNome() == null || produto.getNome().isEmpty()) {
                        System.out.println("Cadastre o produto antes de comprar!");
                    } else {
                        System.out.println("Você escolheu comprar o produto!");
                        System.out.println("Digite a quantidade que deseja comprar de: " + produto.getNome());
                        int qtdComprada = sc.nextInt();

                        // Tenta realizar a compra e guarda a resposta (true ou false)
                        boolean compraAprovada = produto.comprar(qtdComprada);

                        if (compraAprovada) {
                            System.out.println("Compra realizada! Quantidade que sobrou: " + produto.getQuantidade());
                        } else {
                            System.out.println("Não temos essa quantidade! \nEstoque atual: " + produto.getQuantidade());
                        }
                    }
                    break;
                case 4:
                    if (produto.getNome() == null || produto.getNome().isEmpty()) {
                        System.out.println("Cadastre o produto antes de adicionar mais quantidades!");
                    } else {
                        System.out.println("Digite a quantidade a ser adicionada:");
                        int novaQtd = sc.nextInt();

                        // Tenta realizar a compra e guarda a resposta (true ou false)
                        boolean adcQtd = produto.adicionarEstoque(novaQtd);

                        if (adcQtd) {
                            System.out.println("Nova quantidade em estoque: " + produto.getQuantidade());
                        }
                        else {
                            System.out.println("O número não pode ser negativo!");
                        }
                        break;
                    }
                case 5:
                    System.out.println("Digite a porcentagem de desconto: 10, 20 ou 30");
                    double desconto = sc.nextDouble();

                    if (desconto != 10 && desconto != 20 && desconto != 30){
                        System.out.println("Digite um valor válido!");
                    }
                    else {
                        produto.aplicarDesconto(desconto);

                        System.out.println("Com o desconto de " + desconto + "% o novo valor é: R$" + produto.getPreco());
                    }
                    break;
                case 0:
                    System.out.println("Finalizando o programa");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (op != 0);
    }
}