package br.ufrpe.sos.data;

import java.util.List;

public interface IRepositorio<T> {

    public void cadastrar(T obj) throws Exception;

    public List<T> listar();

    public void remover(T obj) throws Exception;

    public void atualizar(T newObj) throws Exception;
}
