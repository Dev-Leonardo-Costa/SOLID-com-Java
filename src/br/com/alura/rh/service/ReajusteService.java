package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.DadosFuncionario;

public class ReajusteService {
   
    public void reajustarSalario(DadosFuncionario funcinario, BigDecimal aumento) {
		BigDecimal salarioAtual =  funcinario.getSalario();
        BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
		if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
		}
        BigDecimal salarioReajustado = salarioAtual.add(aumento);
        funcinario.atualizarSalario(salarioReajustado);
	}
}
