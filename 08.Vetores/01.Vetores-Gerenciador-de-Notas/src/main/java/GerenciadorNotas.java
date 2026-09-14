import java.util.Scanner;

public class GerenciadorNotas {

        public static void main(String[] args) {
            // Notas do aluno, cada elemento representa uma disciplina
            // double[] produtosEstoque = {9, 7.8, 8.5, 7.2, 10};
            double[] notasAluno = new double[5]; // Criando Vetor

            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < notasAluno.length; i++){
                System.out.println("Digite a nota " + (i+1));
                notasAluno[i] = sc.nextInt();
            }

            // Calculando a média das notas
            double somaNotas = 0;
            for (int i = 0; i < notasAluno.length ; i++){
                somaNotas += notasAluno[i];
            }
            double media = somaNotas / notasAluno.length;

            // Imprimindo a média e determinando a situação do aluno
            System.out.println("Média do aluno: " + media);
            if(media >= 7.0) {
                System.out.println("Aluno aprovado!");
            } else {
                System.out.println("Aluno reprovado.");
            }
        }
    }
