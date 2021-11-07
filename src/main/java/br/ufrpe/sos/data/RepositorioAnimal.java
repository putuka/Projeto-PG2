package br.ufrpe.sos.data;

import br.ufrpe.sos.beans.animal.Animal;
import br.ufrpe.sos.exceptions.AnimalCadastradoException;
import br.ufrpe.sos.exceptions.AnimalNaoCadastradoException;
import br.ufrpe.sos.exceptions.UsuarioJaExisteException;

import java.util.Collections;
import java.util.List;

public class RepositorioAnimal {

    private IRepositorioAnimal repositorioAnimal;
    private List<Animal> animals;

    public void cadastrar(Animal animal) throws AnimalCadastradoException {
        if (!this.animals.contains(animal)){
            this.animals.add(animal);
        }else {
            throw new AnimalCadastradoException();
        }
    }

    public List<Animal> listar(){
        return Collections.unmodifiableList(this.animals);
    }

    public void remover(Animal animal) throws AnimalNaoCadastradoException {
        if (this.animals.contains(animal)){
            this.animals.remove(animal);
        }else {
            throw new AnimalNaoCadastradoException();
        }
    }

    public void atualizar(Animal animal) throws AnimalNaoCadastradoException {
        if (this.animals.contains(animal)){
            int index = this.animals.indexOf(animal);
            this.animals.set(index, animal);
        }else {
            throw new AnimalNaoCadastradoException();
        }
    }
}
