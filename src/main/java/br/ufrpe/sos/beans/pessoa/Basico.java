package br.ufrpe.sos.beans.pessoa;

import java.time.LocalDateTime;

public class Basico extends Pessoa {
    private boolean anonimo;

    public Basico(boolean anonimo) {
        super();
        this.anonimo = anonimo;
    }
    public Basico(boolean anonimo, String nome, String telefone, String cpf, LocalDateTime data, Endereco endereco) {
        super(nome, telefone, cpf, data, endereco);
        this.anonimo = anonimo;
    }

    @Override
    public String toString() {
        if (isAnonimo()){
            return "anonimo=" + anonimo + '}';
        }
       else return "Basico{" + super.toString() +
                ",anonimo=" + anonimo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Basico)) return false;
        if (!super.equals(o)) return false;

        Basico basico = (Basico) o;

        return isAnonimo() == basico.isAnonimo();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (isAnonimo() ? 1 : 0);
        return result;
    }

    public boolean isAptoParaAdocao(){
        if (!this.isAnonimo()){
            return true;
        }
        return false;
    }

    public boolean isAnonimo() {
        return anonimo;
    }

    public void setAnonimo(boolean anonimo) {
        this.anonimo = anonimo;
    }
}
