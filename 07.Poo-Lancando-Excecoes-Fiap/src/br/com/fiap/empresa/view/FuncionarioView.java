package br.com.fiap.empresa.view;

import br.com.fiap.empresa.exception.PercentualInvalidoException;
import br.com.fiap.empresa.model.Funcionario;

import java.util.Scanner;

public class FuncionarioView {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Instanciando Scanner
        Funcionario fun = new Funcionario("Thiago", 1000); //Instanciando funcionário

        try {
            System.out.println("Qual o percentual para o aumento do salário?");
            int p = sc.nextInt();
            fun.aumentarSalario(p); //pode lançar uma exceção porque o metodo não pode ser < 0
            System.out.println("Novo salário: " + fun.getSalario());
        } catch (PercentualInvalidoException e) {
            System.err.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
