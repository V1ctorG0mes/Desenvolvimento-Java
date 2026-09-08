package br.com.fiap.game.view;

import br.com.fiap.game.model.HabilidadeEspecial;
import br.com.fiap.game.model.PersonagemMagico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //sc é o nome da variavel criada para ler as informações digitadas pelo usuário.

        PersonagemMagico personagem = new PersonagemMagico(); //Criando o objeto personagem
        int op;

        do {
            System.out.println("Escolha uma opção: \n1-Cadastrar Personagem \n2-Exibir Personagem  \n3-atacar " +
                    "\n4-aumentar energia \n5-Ativar Habilidade \n6-Habilitar habilidade \n0-Sair");

            //Enquanto não digitar um número inteiro não sai desse laço
            while (!sc.hasNextInt()) {
                System.out.println("Por favor, digite um número inteiro válido:");
                sc.next(); // Descarta a entrada inválida (de String) para liberar o buffer
            }

            op = sc.nextInt(); //Metodo pedindo para o usuário digitar um número


            switch (op) {
                case 1:
                    // Lê as informações
                    System.out.println("Digite o nome do personagem:");
                    String nome = sc.next() + sc.nextLine(); //sc.next() lê um texto (sc.nextInt() leria um inteiro), nextLine() le a linha toda
                    System.out.println("Digite o poder do personagem:");
                    String poder = sc.next() + sc.nextLine();
                    System.out.println("Digite o nível de energia");
                    int energia = sc.nextInt();

                    // Atribuindo as informações digitadas ao objeto com o metodo set builder
                    personagem.setNome(nome).setPoderMagico(poder).setNivelEnergia(energia);

                    // ------------------------------------------------------------------ //

                    System.out.println("Digite o nome da habilidade especial:");
                    String nomeHabilidade = sc.next() + sc.nextLine();
                    System.out.println("Digite o custo de energia para usar a habilidade especial:");
                    int custoEnergia = sc.nextInt();
                    System.out.println("A habilidade está ativada? (true/false):");
                    boolean ativada = sc.nextBoolean();

                    //Criando o objeto habilidadeEspecial, o new HabilidadeEspecial chama o construtor na classe HabilidadeEspecial
                    HabilidadeEspecial habilidadeEspecial = new HabilidadeEspecial(nomeHabilidade, custoEnergia, ativada);
                    //Atribuindo o objeto habilidade especial ao personagem
                    personagem.setHabilidade(habilidadeEspecial);
                    break;
                case 2:
                    System.out.println("Nome: " + personagem.getNome() + " Poder: " + personagem.getPoderMagico() + " Energia: " + personagem.getNivelEnergia());

                    //Acessa um atributo do objeto personagem (habilidade) que também é um objeto e possui seus atributos
                    //Ou seja, é um objeto acessando um atributo que é um objeto com atributos
                    //Personagem (Objeto) -> habilidade (Atributo e Objeto) -> nome (Atributo da habilidade)
                    System.out.println("Habilidade: " + personagem.getHabilidade().getNome() + " Custo energia: " + personagem.getHabilidade().getCustoEnergia() + " Habilitada: " + personagem.getHabilidade().isHabilitada());
                    break;
                case 3:
                    System.out.println("Digite o nome do ataque:");
                    String ataque = sc.next() + sc.nextLine();
                    personagem.atacar(ataque);
                    break;
                case 4:
                    System.out.println("Digite a quantidade de energia a ser amentada:");
                    int upenergia = sc.nextInt();
                    personagem.aumentarEnergia(upenergia);
                case 5:
                    personagem.ativarHabilidade();
                    break;
                case 6:
                    personagem.getHabilidade().habilitarHabilidade();
                    break;
                case 0:
                    System.out.println("Finalizando o programa");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (op != 0);

        sc.close();

    }
}
