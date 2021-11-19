package br.ufrpe.sos.beans.animal;

import br.ufrpe.sos.beans.pessoa.Pessoa;

import java.time.LocalDate;

public class Doacao {

    private Animal animal;
    private Pessoa pessoa;
    private LocalDate dataAdocao;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public LocalDate getDataAdocao() {
        return dataAdocao;
    }

    public void setDataAdocao(LocalDate dataAdocao) {
        this.dataAdocao = dataAdocao;
    }

    @Override
    public String toString() {
        return "Doacao{" +
                "animal=" + animal +
                ", pessoa=" + pessoa +
                ", dataAdocao=" + dataAdocao +
                '}';
    }
}
