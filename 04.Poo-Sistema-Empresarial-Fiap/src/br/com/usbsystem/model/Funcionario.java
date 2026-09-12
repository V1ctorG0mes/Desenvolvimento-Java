package br.com.usbsystem.model;

public abstract class Funcionario {
    //Atributos
    private String nome;
    private String cpf;
    private Endereco endereco; // Atributo de referência
    private double salarioFixo;

    //Metodo construtor
    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, Endereco endereco, double salarioFixo) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.salarioFixo = salarioFixo;
    }

    //Getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    //Metodos abstratos
    public abstract double getBonus();

    public abstract String getDetalhamento();

}
