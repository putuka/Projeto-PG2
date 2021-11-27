package br.ufrpe.sos.controller;

import br.ufrpe.sos.beans.pessoa.Pessoa;
import br.ufrpe.sos.exceptions.UsuarioJaExisteException;

public class Facades {

    private static Facades instance;

    private AnimalController animalController;
    private PessoaController pessoaController;

    private Facades(){
        this.animalController = AnimalController.getInstance();
        this.pessoaController = PessoaController.getInstance();
    }

    public static Facades getInstance(){
        if (instance == null) {
            instance = new Facades();
        }
        return instance;
    }

    public void inserir(Pessoa pessoa) throws UsuarioJaExisteException {
         pessoaController.inserir(pessoa);
    }

    public boolean cpfExiste(String cpf){
        return pessoaController.cpfExiste(cpf);
    }

    public boolean emailExiste(String email){
        return pessoaController.emailExiste(email);
    }
}
