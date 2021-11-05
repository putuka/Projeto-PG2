package com.example.devanimais;

import sun.util.resources.LocaleData;

import java.time.LocalDateTime;
import java.util.Objects;

//DEFINININDO A CLASSE ANIMAL
public class Animal {

        //DEFININDO OS ATRITUTOS NECESSARIOS

    private String tipo;
    private String descricao;
    private LocalDateTime dataDeEntrada;
    private Boolean disponivel;
    private Boolean vacinado;
    private Saude saude;

        //GERANDO GETS AND SETTERS

    public String getTipo() {    return tipo;}

    public void setTipo(String tipo) {    this.tipo = tipo;}

    public String getDescricao() {     return descricao;}

    public void setDescricao(String descricao) {    this.descricao = descricao;}

    public LocalDateTime getDataDeEntrada() {   return dataDeEntrada;}

    public void setDataDeEntrada(LocalDateTime dataDeEntrada) {    this.dataDeEntrada = dataDeEntrada;}

    public Boolean getDisponivel() {     return disponivel;}

    public void setDisponivel(Boolean disponivel) {    this.disponivel = disponivel;}

    public Boolean getVacinado() {     return vacinado;}

    public void setVacinado(Boolean vacinado) {    this.vacinado = vacinado;}

    public Saude getSaude() {   return saude;}

    public void setSaude(Saude saude) {    this.saude = saude;}

        //CONSTRUCTOR DO ANIMAL

    public Animal() {
        this.tipo = tipo;
        this.descricao = descricao;
        this.dataDeEntrada = dataDeEntrada;
        this.disponivel = disponivel;
        this.vacinado = vacinado;
        this.saude = saude;
    }

        //TOSTRING DO ANIMAL

    @Override
    public String toString() {
        return "Animal{" +
                "tipo='" + tipo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataDeEntrada=" + dataDeEntrada +
                ", disponivel=" + disponivel +
                ", vacinado=" + vacinado +
                ", saude=" + saude +
                '}';
    }

        //VENDO SE TEM ANIMAL REPETIDO

    @Override
    public boolean equals (Object o){
        if(this == o) return true;
        if(!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        if (getTipo() !=null ?! getTipo().equals(animal.getTipo()) : animal.getTipo() != null) return false;
        if (getVacinado() != null ?! getVacinado().equals(animal.getVacinado()) : animal.getVacinado() != null);
        return getDescricao() != null ?! getDescricao().equals(animal.getDescricao()) : animal.getDescricao() != null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo, descricao, dataDeEntrada, disponivel, vacinado, saude);
    }
}
