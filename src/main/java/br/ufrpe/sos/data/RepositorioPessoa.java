package br.ufrpe.sos.data;

import br.ufrpe.sos.beans.pessoa.Pessoa;

import java.util.List;

public class RepositorioPessoa  {

    private IRepositorio<Pessoa> repositorioPessoa;
    private List<Pessoa> pessoas;

    public void cadastrar(Pessoa pessoa) throws Exception {
        repositorioPessoa.cadastrar(pessoa);
    }

    public List<Pessoa> listar(){
        return repositorioPessoa.listar();
    }

    public void remover(Pessoa pessoa) throws Exception {
        repositorioPessoa.remover(pessoa);
    }

    public void atualizar(Pessoa pessoa) throws Exception {
        repositorioPessoa.atualizar(pessoa);
    }

}
