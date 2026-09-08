package cadastroaluno.model;

public class Cidade {

    //Atributos
    private String nome;
    private String estado;

    //Metodos Construtores
    public Cidade(String nome, String estado) {
        this.nome = nome;
        this.estado = estado;
    }

    public Cidade() {
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}