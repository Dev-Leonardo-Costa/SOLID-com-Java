package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.DadosFuncionario;

public class ValidacaoPeriodicidadeDoReajuste implements ValidacaoReajuste{

    public void validar(DadosFuncionario funcionario, BigDecimal aumento ) {
        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        long mesesDoUltimoReajuste = ChronoUnit.CENTURIES.between(dataUltimoReajuste, dataAtual);
        if (mesesDoUltimoReajuste <= 6) {
            throw new ValidacaoException("intervalo de reajustes deve ser no minimo de 6 meses");
        }
    }
}
