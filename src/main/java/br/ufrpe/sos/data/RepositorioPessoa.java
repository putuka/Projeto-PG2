package br.ufrpe.sos.data;

import br.ufrpe.sos.beans.pessoa.Pessoa;
import br.ufrpe.sos.exceptions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class RepositorioPessoa implements IRepositorioPessoa {

    private List<Pessoa> pessoas;
    private String filename;

    public RepositorioPessoa(String filename){
        this.filename = filename;
        this.pessoas = new ArrayList<>();

        Object listaPessoa = RepositorioFileUtil.lerDoArquivo(this.filename);
        if (listaPessoa instanceof List<?>){
            this.pessoas = (List<Pessoa>) listaPessoa;
        }
    }

    public void cadastrar(Pessoa pessoa) throws UsuarioJaExisteException {
        //TODO verificar se o usuário é maior de idade
        if (!this.pessoas.contains(pessoa)) {
            this.pessoas.add(pessoa);
        } else {
            throw new UsuarioJaExisteException();
        }

        RepositorioFileUtil.salvarArquivo(pessoas, this.filename);
    }

    public List<Pessoa> listar() {
        return Collections.unmodifiableList(this.pessoas);
    }

    public boolean buscarPorCpf(String cpf){
        for(Pessoa p : pessoas){
            if (Objects.equals(p.getCpf(), cpf)){
                return true;
            }
        }
        return false;
    }

    public boolean buscarPorEmail(String email){
        for(Pessoa p : pessoas){
            if (Objects.equals(p.getEmail(), email)){
                return true;
            }
        }
        return false;
    }

    public void remover(Pessoa pessoa) throws UsuarioNaoExisteException {
        if (this.pessoas.contains(pessoa)) {
            this.pessoas.remove(pessoa);
        } else {
            throw new UsuarioNaoExisteException();
        }
        RepositorioFileUtil.salvarArquivo(pessoas, this.filename);
    }

    public void atualizar(Pessoa pessoa) throws UsuarioNaoExisteException {
        if (this.pessoas.contains(pessoa)) {
            int index = this.pessoas.indexOf(pessoa);
            this.pessoas.set(index, pessoa);
        } else {
            throw new UsuarioNaoExisteException();
        }
        RepositorioFileUtil.salvarArquivo(pessoas, this.filename);
    }

}
