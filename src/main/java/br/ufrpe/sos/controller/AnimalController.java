package br.ufrpe.sos.controller;

import br.ufrpe.sos.beans.animal.Animal;
import br.ufrpe.sos.data.RepositorioAnimal;
import br.ufrpe.sos.exceptions.AnimalCadastradoException;
import br.ufrpe.sos.exceptions.AnimalNaoCadastradoException;

import java.util.List;

public class AnimalController {

    private RepositorioAnimal repositorioAnimal;

    public void cadastrarAnimal(Animal animal) throws AnimalCadastradoException {
        repositorioAnimal.cadastrar(animal);
    }

    public void removerAnimal(Animal animal) throws AnimalNaoCadastradoException {
        repositorioAnimal.remover(animal);
    }

    public void editarAnimal(Animal animal) throws AnimalNaoCadastradoException {
        repositorioAnimal.atualizar(animal);
    }

    public List<Animal> listarAnimal(){
        return repositorioAnimal.listar();
    }
}
