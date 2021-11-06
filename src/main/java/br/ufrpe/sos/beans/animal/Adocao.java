package br.ufrpe.sos.beans.animal;

import br.ufrpe.sos.beans.pessoa.Pessoa;

import java.time.LocalDateTime;

public class Adocao {

    private Animal animal;
    private Pessoa pessoa;
    private LocalDateTime dataDeAdocao;
    private RelatorioDeAdocao relatorio;
}
