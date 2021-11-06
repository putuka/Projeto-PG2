package br.ufrpe.sos.data;

import java.util.Collections;
import java.util.List;

public class Repositorio<T> implements IRepositorio<T> {

    private List<T> listaObjetos;

    @Override
    public void cadastrar(T obj) throws Exception {
        if (!this.listaObjetos.contains(obj)){
            this.listaObjetos.add(obj);
        }else {
            throw new Exception("Já existe");
        }

    }

    @Override
    public List<T> listar() {
        return Collections.unmodifiableList(this.listaObjetos);
    }

    @Override
    public void remover(T obj) throws Exception {
        if (this.listaObjetos.contains(obj)){
            this.listaObjetos.remove(obj);
        }else {
            throw new Exception("Exceção informando que o objeto não existe");
        }
    }

    @Override
    public void atualizar(T newObj) throws Exception {
        if (this.listaObjetos.contains(newObj)){
            int index = this.listaObjetos.indexOf(newObj);
            this.listaObjetos.set(index, newObj);
        }else {
            throw new Exception("Exceção informando que o objeto não existe");
        }
    }
}
