package cadastroaluno.model;

public class Aluno {

    //Atributos
    private int rm;
    private String nome;
    private Endereco endereco;


    //Metodos construtores
    public Aluno(int rm, String nome, Endereco endereco) {
        this.rm = rm;
        this.nome = nome;
        this.endereco = endereco;
    }

    public Aluno() {
    }

    // Getters e Setters
    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}