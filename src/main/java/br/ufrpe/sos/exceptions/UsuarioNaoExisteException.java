package br.ufrpe.sos.exceptions;

public class UsuarioNaoExisteException extends Exception {

    public UsuarioNaoExisteException(){
        super("Usuário não existe");
    }
}
