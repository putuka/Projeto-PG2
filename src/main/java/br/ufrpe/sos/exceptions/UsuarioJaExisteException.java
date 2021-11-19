package br.ufrpe.sos.exceptions;

public class UsuarioJaExisteException extends Exception {

    public UsuarioJaExisteException() {
        super("Usuário já existe no nosso sistema");
    }
}
