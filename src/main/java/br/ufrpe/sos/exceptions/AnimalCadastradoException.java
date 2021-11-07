package br.ufrpe.sos.exceptions;

public class AnimalCadastradoException extends Exception {

    public AnimalCadastradoException(){
        super("Esse animal já está cadastrado no nosso sistema");
    }
}
