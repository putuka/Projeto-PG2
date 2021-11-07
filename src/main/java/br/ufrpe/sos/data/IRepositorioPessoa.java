package br.ufrpe.sos.data;

import br.ufrpe.sos.beans.pessoa.Pessoa;
import br.ufrpe.sos.exceptions.*;

import java.util.List;

public interface IRepositorioPessoa {

     void cadastrar(Pessoa pessoa) throws UsuarioJaExisteException;

     List<Pessoa> listar();

     void remover(Pessoa pessoa) throws UsuarioNaoExisteException;

     void atualizar(Pessoa pessoa) throws UsuarioNaoExisteException;
}
