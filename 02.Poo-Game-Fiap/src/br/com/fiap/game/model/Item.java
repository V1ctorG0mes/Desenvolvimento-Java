package br.com.fiap.game.model;

public class Item {

    //Atributos (Variáveis Globais)
    private String nomeItem;
    private String descricaoItem;
    private int nivelPoderItem;


    //metodo construtor sem argumentos (padrão)
    public Item() {

    }

    //Getters e Setters


    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public int getNivelPoderItem() {
        return nivelPoderItem;
    }

    public void setNivelPoderItem(int nivelPoderItem) {
        this.nivelPoderItem = nivelPoderItem;
    }
}
