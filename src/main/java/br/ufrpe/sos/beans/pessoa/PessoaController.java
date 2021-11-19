package br.ufrpe.sos.beans.pessoa;

import br.ufrpe.sos.data.RepositorioPessoa;
import br.ufrpe.sos.exceptions.UsuarioJaExisteException;
import br.ufrpe.sos.exceptions.UsuarioNaoExisteException;

import java.util.List;

public class PessoaController {
    private static RepositorioPessoa repoPessoa;

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
