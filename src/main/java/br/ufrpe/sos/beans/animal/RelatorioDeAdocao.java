package br.ufrpe.sos.beans.animal;

import java.util.ArrayList;

public class RelatorioDeAdocao {

    private ArrayList<RelatorioDeAdocao> relatorioDeAdocaos;

    public RelatorioDeAdocao(ArrayList<RelatorioDeAdocao>relatorioDeAdocaos){
        this.relatorioDeAdocaos = relatorioDeAdocaos;
    }

    public String gerarRelatorio(){
        toString();
        return  toString();
    }
}