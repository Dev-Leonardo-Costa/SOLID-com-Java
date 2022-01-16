package br.com.alura.rh.service;

import java.math.BigDecimal;

import br.com.alura.rh.model.DadosFuncionario;

public interface ValidacaoReajuste {

    void validar(DadosFuncionario funcionario, BigDecimal aumento );
}
