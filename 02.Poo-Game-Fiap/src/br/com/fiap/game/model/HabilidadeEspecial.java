package br.com.fiap.game.model;

public class HabilidadeEspecial {
    //Atributos (Variáveis Globais)
    private String nome;
    private int custoEnergia;
    private boolean habilitada;

    //Metodo construtor que obriga ao usuario digitar e obriga a ser nessa ordem
    public HabilidadeEspecial(String nome, int custoEnergia, boolean habilitada) {
        this.nome = nome;
        this.custoEnergia = custoEnergia;
        this.habilitada = habilitada;
    }

    // metodo
    public void habilitarHabilidade(){
        habilitada = true;
        System.out.println("Habilidade habilitada");
    }

    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCustoEnergia() {
        return custoEnergia;
    }

    public void setCustoEnergia(int custoEnergia) {
        this.custoEnergia = custoEnergia;
    }

    public boolean isHabilitada() {
        return habilitada;
    }

    public void setHabilitada(boolean habilitada) {
        this.habilitada = habilitada;
    }
}
