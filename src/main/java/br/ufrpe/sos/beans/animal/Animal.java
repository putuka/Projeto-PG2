package br.ufrpe.sos.beans.animal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

//DEFINININDO A CLASSE ANIMAL
public class Animal {

    //DEFININDO OS ATRITUTOS NECESSARIOS

    private String raca;
    private String descricao;
    private LocalDateTime dataDeEntrada;
    private String vacina;
    private String estadoSaude;
    private String nome;


    //CONSTRUCTOR DO ANIMAL

    public Animal(String raca, String nome, String descricao, LocalDateTime dataDeEntrada, String vacina, String estadoSaude) {
        this.raca = raca;
        this.nome = nome;
        this.descricao = descricao;
        this.dataDeEntrada = dataDeEntrada;
        this.vacina = vacina;
        this.estadoSaude = estadoSaude;

    }
    // TODO campo de nome e idade
    //GERANDO GETS AND SETTERS


    public String getTipo() {
        return raca;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setTipo(String tipo) {
        this.raca = tipo;
    }

    public String getEstadoSaude() {
        return estadoSaude;
    }

    public void setEstadoSaude(String estadoSaude) {
        this.estadoSaude = estadoSaude;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataDeEntrada() {
        return dataDeEntrada;
    }

    public void setDataDeEntrada(LocalDateTime dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }

    public String getVacina() {
        return vacina;
    }

    public void setVacina(String vacina) {
        this.vacina = vacina;
    }

    //TOSTRING DO ANIMAL

    @Override
    public String toString() {
        return "Animal{" +
                "raca='" + raca + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data de entrada=" + dataDeEntrada +
                ", vacinado=" + vacina +
                ", estado de saude=" + estadoSaude +
                '}';
    }

    //VENDO SE TEM ANIMAL REPETIDO

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        if (getTipo() != null ? !getTipo().equals(animal.getTipo()) : animal.getTipo() != null) return false;
        if (getVacina() != null ? !getVacina().equals(animal.getVacina()) : animal.getVacina() != null) return false;
        return getDescricao() != null ? !getDescricao().equals(animal.getDescricao()) : animal.getDescricao() != null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(raca, descricao, dataDeEntrada, vacina);
    }
}
