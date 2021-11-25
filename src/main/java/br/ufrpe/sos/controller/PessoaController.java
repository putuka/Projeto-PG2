package br.ufrpe.sos.controller;

import br.ufrpe.sos.beans.pessoa.Pessoa;
import br.ufrpe.sos.data.RepositorioPessoa;
import br.ufrpe.sos.exceptions.UsuarioJaExisteException;
import br.ufrpe.sos.exceptions.UsuarioNaoExisteException;

import java.util.List;

public class PessoaController {
    private final RepositorioPessoa repoPessoa;
    private static PessoaController instance;

    private PessoaController(){
        this.repoPessoa = new RepositorioPessoa();
    }

    public static PessoaController getInstance(){
        if (instance == null) {
            instance = new PessoaController();
        }
        return instance;
    }

    public void inserir(Pessoa pessoa) throws UsuarioJaExisteException {
        repoPessoa.cadastrar(pessoa);
    }
    public void remover(Pessoa pessoa) throws UsuarioNaoExisteException {
        repoPessoa.remover(pessoa);
    }
    public void editar(Pessoa pessoa) throws UsuarioNaoExisteException {
        repoPessoa.atualizar(pessoa);
    }
    public void listar(){
        repoPessoa.listar();
    }
}
