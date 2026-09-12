package br.com.usbsystem.view;

import br.com.usbsystem.model.Endereco;
import br.com.usbsystem.model.Gerente;

import java.util.Scanner;

public class ViewGerente {

    // Menu é chamado no do-while
    private static void exibirMenu() {
        System.out.println("Você deve selecionar uma operação:");
        System.out.println("1-Cadastrar/Alterar gerente");
        System.out.println("2-Exibir gerente");
        System.out.println("3-Sair");
        System.out.println("Digite o número da opção ");
    }

    // Bloco de código caso o usuário selecionar 1
    private static Gerente cadastrarGerente() {
        Gerente gerente = new Gerente(); //Instanciando objeto gerente
        Scanner sc = new Scanner(System.in); //Instanciando Scanner

        System.out.println("Informe nome do gerente: ");
        gerente.setNome(sc.nextLine());

        System.out.print("Informe o nome da rua," +
                " o número, o complemento, " +
                "o CEP, " +
                "a cidade e o estado," +
                " teclando enter ao final de cada um : ");
        gerente.setEndereco(new Endereco(sc.nextLine(),
                Integer.parseInt(sc.nextLine()),
                sc.nextLine(),
                sc.nextLine(),
                sc.nextLine(),
                sc.nextLine()));

        System.out.println("Informe o CPF do gerente: ");
        gerente.setCpf(sc.nextLine());
        System.out.println("Informe o salário fixo do gerente: ");
        gerente.setSalarioFixo(sc.nextDouble());
        System.out.println("Informe o número da sala do gerente: ");
        gerente.setSala(sc.nextInt());
        System.out.println("Informe o ramal do gerente: ");
        gerente.setRamal(sc.nextInt());
        System.out.println("Informe o faturamento semestral do gerente: ");
        gerente.setFaturamentoSemestral(sc.nextDouble());
        return gerente;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gerente gerente = null;
        int op;
        do {
            exibirMenu(); // Exibe o menu
            op = sc.nextInt();
            switch (op) {
                case 1:
                    gerente = cadastrarGerente();
                    break;
                case 2:
                    if (gerente != null)
                        System.out.println(gerente.getDetalhamento());
                    else
                        System.out.println("Nenhum gerente cadastrado");
                    break;
                case 3:
                    System.out.println("Finalizando o programa!");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (op != 3);

        sc.close();
    }
}