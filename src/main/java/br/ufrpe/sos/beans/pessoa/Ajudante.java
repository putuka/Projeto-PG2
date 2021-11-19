package br.ufrpe.sos.beans.pessoa;

import java.util.Objects;

public class Ajudante {
    private Pessoa pessoa;
    private TipoServico tipoServico;
    private double valor;



    public TipoServico getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ajudante ajudante = (Ajudante) o;
        return Double.compare(ajudante.valor, valor) == 0 && Objects.equals(pessoa, ajudante.pessoa) && tipoServico == ajudante.tipoServico;
    }

    @Override
    public String toString() {
        return "Ajudante{" +
                "pessoa=" + pessoa +
                ", tipoServico=" + tipoServico +
                ", valor=" + valor +
                '}';
    }
}
