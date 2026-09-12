package br.com.usbsystem.model;

public class Gerente extends Funcionario {
    //Atributos
    public int sala;
    public int ramal;
    public double faturamentoSemestral;


    //Metodos construtores
    public Gerente() {
        super();
    }

    public Gerente(String nome, String cpf, Endereco endereco, double salarioFixo, int sala, int ramal, double faturamentoSemestral) {
        super(nome, cpf, endereco, salarioFixo);
        this.sala = sala;
        this.ramal = ramal;
        this.faturamentoSemestral = faturamentoSemestral;
    }


    //Getters and Setters
    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

    public double getFaturamentoSemestral() {
        return faturamentoSemestral;
    }

    public void setFaturamentoSemestral(double faturamentoSemestral) {
        this.faturamentoSemestral = faturamentoSemestral;
    }


    //Metodos abstratos
    @Override
    public double getBonus() {
        return this.getFaturamentoSemestral() * 0.05;
    }

    @Override
    public String getDetalhamento() {
        return "Nome: " + this.getNome()
                + "\nSala: " + this.getSala()
                + "\nRamal: " + this.getRamal()
                + "\nEndereco: " + this.getEndereco().getEnderecoCompleto()
                + "\nSalario mensal: R$" + this.getSalarioFixo()
                + "\nFaturamento Semestral: R$" + this.getFaturamentoSemestral()
                + "\nBônus semestral: " + this.getBonus();
    }


}
