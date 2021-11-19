package br.ufrpe.sos.beans.animal;

import br.ufrpe.sos.beans.pessoa.Pessoa;

import java.time.LocalDateTime;

public class Adocao {

    private Animal animal;
    private Pessoa pessoa;
    private LocalDateTime dataDeAdocao;
    private RelatorioDeAdocao relatorio;

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

    public LocalDateTime getDataDeAdocao() {
        return dataDeAdocao;
    }

    public void setDataDeAdocao(LocalDateTime dataDeAdocao) {
        this.dataDeAdocao = dataDeAdocao;
    }

    public RelatorioDeAdocao getRelatorio() {
        return relatorio;
    }

    public void setRelatorio(RelatorioDeAdocao relatorio) {
        this.relatorio = relatorio;
    }

    @Override
    public String toString() {
        return "Adocao{" +
                "animal=" + animal +
                ", pessoa=" + pessoa +
                ", dataDeAdocao=" + dataDeAdocao +
                ", relatorio=" + relatorio +
                '}';
    }
}
