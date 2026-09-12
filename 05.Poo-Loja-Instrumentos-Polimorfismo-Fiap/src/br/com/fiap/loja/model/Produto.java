package br.com.fiap.loja.model;

public abstract class Produto {
    //Atributos
    public String nome;
    public String marca;


    //Metodos construtores
    public Produto() {
    }


    public Produto(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
    }


    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public Produto setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getMarca() {
        return marca;
    }

    public Produto setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    //Metodo de entrega
    public String getFormaEntrega() {
        return "Entregamos esse produto";
    }

    @Override //sobrescrita
    public String toString() { //esse metodo constrói uma string com o produto
        final StringBuilder sb = new StringBuilder("Produto{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", marca='").append(marca).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
