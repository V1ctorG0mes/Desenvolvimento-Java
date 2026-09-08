package br.com.fiap.game.model;

public class PersonagemMagico {

    //Atributos (Variáveis Globais)
    private String nome;
    private int nivelEnergia;
    private String poderMagico;

    //Agora habilidade é um dos seus atributos, podemos colocar no metodo construtor
    private HabilidadeEspecial habilidade; //recebe o objeto criado no main


    //metodo construtor
    public PersonagemMagico(String nome, int nivelEnergia, String poderMagico) {
        this.nome = nome;
        this.nivelEnergia = nivelEnergia;
        this.poderMagico = poderMagico;
    }

    //metodo construtor que so exige o nome do personagem
    public PersonagemMagico(String nome) {
        this.nome = nome;
    }

    //metodo construtor sem argumentos (padrão)
    public PersonagemMagico() {
    }


    //metodos

    //criando metodo atacar
    public void atacar(String ataque) {
        if (nivelEnergia >= habilidade.getCustoEnergia()) {
            System.out.println(nome + " realizou um ataque: " + ataque + "!");
            nivelEnergia -= habilidade.getCustoEnergia();
        } else {
            System.out.println(nome + " está sem energia para atacar.");
        }
    }

    //criando metodo para aumentar energia
    public int aumentarEnergia(int energia) {
        nivelEnergia = nivelEnergia + energia;
        return nivelEnergia;
    }

    //metodo para ativacao da habilidade
    public void ativarHabilidade() {
        if (!habilidade.isHabilitada()) {
            System.out.println("Habilidade especial não está habilitada");
        } else if (nivelEnergia >= habilidade.getCustoEnergia()) {
            System.out.println("Ativando a habilidade: " + habilidade.getNome());
            nivelEnergia -= habilidade.getCustoEnergia();
        } else {
            System.out.println(nome + " está sem energia para a habilidade");

        }
    }

    //getters e setters

    public String getNome() {
        return nome;
    }

    //os sets estão no padrao set builder
    public PersonagemMagico setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public PersonagemMagico setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
        return this;
    }

    public String getPoderMagico() {
        return poderMagico;
    }

    public PersonagemMagico setPoderMagico(String poderMagico) {
        this.poderMagico = poderMagico;
        return this;
    }

    public HabilidadeEspecial getHabilidade() {
        return habilidade;
    }

    public PersonagemMagico setHabilidade(HabilidadeEspecial habilidade) {
        this.habilidade = habilidade;
        return this;
    }
}