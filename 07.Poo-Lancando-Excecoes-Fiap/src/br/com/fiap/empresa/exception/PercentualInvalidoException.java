package br.com.fiap.empresa.exception;

public class PercentualInvalidoException extends Exception{

    //Metodos Contrutores

    public PercentualInvalidoException(){}

    //Esse contrutor recebe a mensagem de erro e manda essa mensagem para o pai
    public PercentualInvalidoException(String message){
        super (message); // super se referencia a classe pai
    }

}
