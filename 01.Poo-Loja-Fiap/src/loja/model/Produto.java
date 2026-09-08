package loja.model;

public class Produto {

    //Atributos da classe Produto:
    private String nome;
    private double preco;
    private int quantidade;


    //metodos

    //metodo construtor sem argumentos (padrão)
    public Produto() {
    }

    //metodo para exibir informacoes do produto cadastrado
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + "\nPreço: R$" + preco + "\nQuantidade: " + quantidade);

    }

    //metodo para cuidar do estoque e nao deixa-lo negativo ao fazer uma compra
    public boolean comprar(int qtdComprada) {
        if (qtdComprada > quantidade) {
            return false; // Não tem estoque suficiente, recusa a compra
        }
        // Se passou do if, é porque tem estoque. Subtrai e aprova.
        quantidade = quantidade - qtdComprada;
        return true;
    }

    //metodo para checar se o usuario digitou uma quantidade positiva de novos produtos no estoque
    public boolean adicionarEstoque(int quantidadeAdicional) {
        if (quantidadeAdicional < 0) {
            return false;
        }
        quantidade = quantidade + quantidadeAdicional;
        return true;

    }

    public void aplicarDesconto(double desconto) {
        if (desconto == 10) {
            preco = preco - (preco * 0.1);
        }
        else if (desconto == 20) {
            preco = preco - (preco * 0.2);
        }
        else if (desconto == 30){
            preco = preco - (preco * 0.3);
        }
    }


    //getter and setter

    public String getNome() {
        return nome;
    }

    public Produto setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public double getPreco() {
        return preco;
    }

    public Produto setPreco(double preco) {
        this.preco = preco;
        return this;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Produto setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        return this;
    }
}