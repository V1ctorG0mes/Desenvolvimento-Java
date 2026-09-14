package br.com.fiap.empresa.model;

import br.com.fiap.empresa.exception.PercentualInvalidoException;

public class Funcionario {
    //Atributos
    private String nome;
    private double salario;

    //Metodo para aumentar o salário do funcionário
    public void aumentarSalario(int percentual) throws PercentualInvalidoException {
        if (percentual < 0)
            throw new PercentualInvalidoException("O valor percentual deve ser positivo"); //lançando uma exceção
        //se não entrar nesse if, simplesmente faz o aumento do salário
        salario += salario * percentual / 100;
    }

    //Metodos construtores
    public Funcionario() {
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;

    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
