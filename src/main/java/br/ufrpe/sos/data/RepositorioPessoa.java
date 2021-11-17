package br.ufrpe.sos.data;

import br.ufrpe.sos.beans.pessoa.Pessoa;
import br.ufrpe.sos.exceptions.*;

import java.util.Collections;
import java.util.List;

public class RepositorioPessoa {

    private IRepositorioPessoa repositorioPessoa;
    private List<Pessoa> pessoas;

    public void cadastrar(Pessoa pessoa) throws UsuarioJaExisteException {
        if (!this.pessoas.contains(pessoa)) {
            this.pessoas.add(pessoa);
        } else {
            throw new UsuarioJaExisteException();
        }
    }

    public List<Pessoa> listar() {
        return Collections.unmodifiableList(this.pessoas);
    }

    public void remover(Pessoa pessoa) throws UsuarioNaoExisteException {
        if (this.pessoas.contains(pessoa)) {
            this.pessoas.remove(pessoa);
        } else {
            throw new UsuarioNaoExisteException();
        }
    }

    public void atualizar(Pessoa pessoa) throws UsuarioNaoExisteException {
        if (this.pessoas.contains(pessoa)) {
            int index = this.pessoas.indexOf(pessoa);
            this.pessoas.set(index, pessoa);
        } else {
            throw new UsuarioNaoExisteException();
        }
    }

}
