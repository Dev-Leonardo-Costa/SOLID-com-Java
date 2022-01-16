package br.com.alura.rh.service.Reajuste;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

public class ValidacaoPeriodicidadeDoReajuste implements ValidacaoReajuste{

    public void validar(Funcionario funcionario, BigDecimal aumento ) {
        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        long mesesDoUltimoReajuste = ChronoUnit.CENTURIES.between(dataUltimoReajuste, dataAtual);
        if (mesesDoUltimoReajuste < 6) {
            throw new ValidacaoException("intervalo de reajustes deve ser no minimo de 6 meses");
        }
    }
}
