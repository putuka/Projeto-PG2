package br.ufrpe.sos.data;

import br.ufrpe.sos.beans.animal.Animal;
import br.ufrpe.sos.beans.pessoa.Pessoa;
import br.ufrpe.sos.exceptions.AnimalCadastradoException;
import br.ufrpe.sos.exceptions.AnimalNaoCadastradoException;
import br.ufrpe.sos.exceptions.UsuarioJaExisteException;

import java.util.List;

public interface IRepositorioAnimal {

    void cadastrar(Animal animal) throws AnimalCadastradoException;

    List<Animal> listar();

    void remover(Animal animal) throws AnimalNaoCadastradoException;

    void atualizar(Animal animal) throws AnimalNaoCadastradoException;
}
