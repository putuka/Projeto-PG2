package br.ufrpe.sos.exceptions;

public class AnimalNaoCadastradoException extends Exception{

    public AnimalNaoCadastradoException(){
        super("Animal não está cadastrado");
    }
}
