package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.util.List;

import br.com.alura.rh.model.DadosFuncionario;

public class ReajusteService {

    private List<ValidacaoReajusteService> validacoes;
    public ReajusteService(List<ValidacaoReajusteService> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajustarSalario(DadosFuncionario funcionario, BigDecimal aumento) {
        this.validacoes.forEach(v -> v.validar(funcionario, aumento));
       
        BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
        funcionario.atualizarSalario(salarioReajustado);
	}
}
