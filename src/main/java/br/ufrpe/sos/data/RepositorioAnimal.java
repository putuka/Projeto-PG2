package br.ufrpe.sos.data;

import br.ufrpe.sos.beans.animal.Animal;
import br.ufrpe.sos.beans.pessoa.Pessoa;

import java.util.List;

public class RepositorioAnimal {

    private IRepositorio<Animal> repositorioAnimal;
    private List<Animal> animals;

    public void cadastrar(Animal animal) throws Exception {
        repositorioAnimal.cadastrar(animal);
    }

    public List<Animal> listar(){
        return repositorioAnimal.listar();
    }

    public void remover(Animal animal) throws Exception {
        repositorioAnimal.remover(animal);
    }

    public void atualizar(Animal animal) throws Exception {
        repositorioAnimal.atualizar(animal);
    }
}
