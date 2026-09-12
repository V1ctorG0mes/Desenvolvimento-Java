package br.com.usbsystem.model;

public class Vendedor extends Funcionario {
    //Atributos
    public double vendasSemestrais;

    //Metodos Construtores
    public Vendedor() {
        super();
    }

    public Vendedor(String nome, String cpf, Endereco endereco, double salarioFixo, double vendasSemestrais) {
        super(nome, cpf, endereco, salarioFixo);
        this.vendasSemestrais = vendasSemestrais;
    }

    //Getters and Setterss
    public double getVendasSemestrais() {
        return vendasSemestrais;
    }

    public void setVendasSemestrais(double vendasSemestrais) {
        this.vendasSemestrais = vendasSemestrais;
    }

    //Metodos Abstratos
    @Override
    public double getBonus() {
        return this.getVendasSemestrais() * 0.015;
    }

    @Override
    public String getDetalhamento() {
        return "Nome: " + this.getNome()
                + "\nEndereco: " + this.getEndereco().getEnderecoCompleto()
                + "\nSalario mensal: R$" + this.getSalarioFixo()
                + "\nVendas no semestre: R$" + this.getVendasSemestrais()
                + "\nBônus semestral: " + this.getBonus();
    }
}
