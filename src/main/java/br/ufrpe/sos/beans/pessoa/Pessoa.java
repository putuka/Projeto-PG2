package br.ufrpe.sos.beans.pessoa;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public abstract class Pessoa {
    private String nome;
    private String telefone;
    private String cpf;
    private LocalDateTime dataNascimento;
    private Endereco endereco;

    public Pessoa(){

    }

    public Pessoa(String nome, String telefone, String cpf, LocalDateTime dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public boolean verificarMaioridade(LocalDateTime data){
        return ChronoUnit.YEARS.between(data, LocalDateTime.now()) >= 18;
    }

//    public void validarCpf(){
//        //TODO
//    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", endereco=" + endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;

        Pessoa pessoa = (Pessoa) o;

        if (getNome() != null ? !getNome().equals(pessoa.getNome()) : pessoa.getNome() != null) return false;
        if (getTelefone() != null ? !getTelefone().equals(pessoa.getTelefone()) : pessoa.getTelefone() != null)
            return false;
        if (getCpf() != null ? !getCpf().equals(pessoa.getCpf()) : pessoa.getCpf() != null) return false;
        if (getDataNascimento() != null ? !getDataNascimento().equals(pessoa.getDataNascimento()) : pessoa.getDataNascimento() != null)
            return false;
        return getEndereco() != null ? getEndereco().equals(pessoa.getEndereco()) : pessoa.getEndereco() == null;
    }

    @Override
    public int hashCode() {
        int result = getNome() != null ? getNome().hashCode() : 0;
        result = 31 * result + (getTelefone() != null ? getTelefone().hashCode() : 0);
        result = 31 * result + (getCpf() != null ? getCpf().hashCode() : 0);
        result = 31 * result + (getDataNascimento() != null ? getDataNascimento().hashCode() : 0);
        result = 31 * result + (getEndereco() != null ? getEndereco().hashCode() : 0);
        return result;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
