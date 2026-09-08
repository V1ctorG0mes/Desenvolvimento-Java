package br.com.fiap.game.view;
import br.com.fiap.game.model.Item;
import java.util.Scanner;

public class ItemView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Item item = new Item(); //Criando o objeto item

        int op;

        do {

        System.out.println("Escolha uma opção: \n1 - Cadastrar item\n2 - Exibir item\n0 - Sair");
        op = sc.nextInt();


            switch (op){
                case 1:
                    System.out.println("Digite o nome do item: ");
                    String nomeItem = sc.next() + sc.nextLine();
                    System.out.println("Digite a descrição do item: ");
                    String descricaoItem = sc.next() + sc.nextLine();
                    System.out.println("Digite o nível de poder do item: ");
                    int nivelPoderItem = sc.nextInt();

                    item.setNomeItem(nomeItem);
                    item.setDescricaoItem(descricaoItem);
                    item.setNivelPoderItem(nivelPoderItem);

                    break;
                case 2:
                    System.out.println("Nome do item: " + item.getNomeItem() + "\nDescrição do item: " + item.getDescricaoItem() + "\nNivel de poder do item: " + item.getNivelPoderItem());
                    break;
                case 0:
                    System.out.println("Encerrando o programa!");
                    break;
                default:
                    System.out.println("Digite um número válido");
                }

        } while (op != 0);

        sc.close();
    }
}
