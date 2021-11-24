package br.ufrpe.sos.beans.pessoa;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private String nome;
    private String telefone;
    private String cpf;
    private String email;
    private LocalDate dataNascimento;
    private Endereco endereco;

    public Pessoa() {

    }

    public Pessoa(String nome, String telefone, String cpf,String email, LocalDate dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public boolean verificarMaioridade(LocalDateTime data) {
        return ChronoUnit.YEARS.between(data, LocalDateTime.now()) >= 18;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", endereco=" + endereco +
                ", email=" + email;
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

}
