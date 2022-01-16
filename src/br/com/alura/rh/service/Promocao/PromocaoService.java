package br.com.alura.rh.service.Promocao;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.CargoFuncionario;
import br.com.alura.rh.model.DadosFuncionario;

public class PromocaoService {
    
    public void promover(DadosFuncionario funcionario, Boolean metaBatida) {
        CargoFuncionario cargoAtual = funcionario.getCargo();
        if (CargoFuncionario.GERENTE == cargoAtual) {
            throw new ValidacaoException("Gerente não tem promoção");
        }
        if (metaBatida) {
            CargoFuncionario novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
        }
    }
}
