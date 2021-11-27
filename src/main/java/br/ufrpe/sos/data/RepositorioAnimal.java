package br.ufrpe.sos.data;

import br.ufrpe.sos.beans.animal.Animal;
import br.ufrpe.sos.exceptions.AnimalCadastradoException;
import br.ufrpe.sos.exceptions.AnimalNaoCadastradoException;
import br.ufrpe.sos.exceptions.UsuarioJaExisteException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RepositorioAnimal implements IRepositorioAnimal {

    private List<Animal> animais;
    private String filename;

    public RepositorioAnimal(String filename){
        this.filename = filename;
        this.animais = new ArrayList<>();

        Object listaAnimal = RepositorioFileUtil.lerDoArquivo(this.filename);
        if (listaAnimal instanceof List<?>){
            this.animais = (List<Animal>) listaAnimal;
        }
    }

    public void cadastrar(Animal animal) throws AnimalCadastradoException {
        if (!this.animais.contains(animal)) {
            this.animais.add(animal);
        } else {
            throw new AnimalCadastradoException();
        }

        RepositorioFileUtil.salvarArquivo(animais, this.filename);
    }

    public List<Animal> listar() {
        return Collections.unmodifiableList(this.animais);
    }

    public void remover(Animal animal) throws AnimalNaoCadastradoException {
        if (this.animais.contains(animal)) {
            this.animais.remove(animal);
        } else {
            throw new AnimalNaoCadastradoException();
        }
        RepositorioFileUtil.salvarArquivo(animais, this.filename);
    }

    public void atualizar(Animal animal) throws AnimalNaoCadastradoException {
        if (this.animais.contains(animal)) {
            int index = this.animais.indexOf(animal);
            this.animais.set(index, animal);
        } else {
            throw new AnimalNaoCadastradoException();
        }
        RepositorioFileUtil.salvarArquivo(animais, this.filename);
    }
}
