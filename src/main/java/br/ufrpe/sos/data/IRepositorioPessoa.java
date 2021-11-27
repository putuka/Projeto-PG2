package br.ufrpe.sos.data;

import br.ufrpe.sos.beans.pessoa.Pessoa;
import br.ufrpe.sos.exceptions.*;

import java.util.List;

public interface IRepositorioPessoa {

    void cadastrar(Pessoa pessoa) throws UsuarioJaExisteException;

    List<Pessoa> listar();

    boolean buscarPorCpf(String cpf);

    boolean buscarPorEmail(String email);

    void remover(Pessoa pessoa) throws UsuarioNaoExisteException;

    void atualizar(Pessoa pessoa) throws UsuarioNaoExisteException;
}
