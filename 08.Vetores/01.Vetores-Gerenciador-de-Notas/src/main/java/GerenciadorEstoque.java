import java.util.Scanner;

public class GerenciadorEstoque {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Vetor com nomes de produtos no estoque
        // String[] produtosEstoque = {"Notebook", "Smartphone", "Tablet", "Fone de ouvido", "Carregador portátil"};
        String[] produtosEstoque = new String[5];

        for (int i = 0 ; i < produtosEstoque.length ; i++) {
            System.out.println("Digite o nome do produto " + (i+1));
            produtosEstoque[i] = sc.next() + sc.nextLine();
        }

        // Produto que desejamos verificar no estoque
        // String produtoProcurado = "Tablet";

        System.out.println("Digite o nome do produto procurado ");
        String produtoProcurado = sc.next() + sc.nextLine();

        //Exibindo estoque
        for (int i = 0 ; i < produtosEstoque.length ; i++) {
            System.out.println(produtosEstoque[i]);
        }

        // Verificando a disponibilidade do produto
        boolean produtoEncontrado = false;
        int i = 0;
        while (!produtoEncontrado && i < produtosEstoque.length){
            if(produtosEstoque[i].equals(produtoProcurado)) {
                produtoEncontrado = true;
            }
            i++;
        }

        // Imprimindo o resultado da busca
        if(produtoEncontrado) {
            System.out.println(produtoProcurado + " está disponível no estoque.");
        } else {
            System.out.println(produtoProcurado + " não foi encontrado no estoque.");
        }
    }
}