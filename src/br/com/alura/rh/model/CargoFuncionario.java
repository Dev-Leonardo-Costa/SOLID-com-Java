package br.com.alura.rh.model;

public enum CargoFuncionario {
    
    SSISTENTE {
        @Override
        public CargoFuncionario getProximoCargo() {
            return ANALISTA;
        }
    },
	ANALISTA {
        @Override
        public CargoFuncionario getProximoCargo() {
            return ESPECIALISTA;
        }
    },
	ESPECIALISTA {
        @Override
        public CargoFuncionario getProximoCargo() {
            return GERENTE;
        }
    },
	GERENTE {
        @Override
        public CargoFuncionario getProximoCargo() {
            return GERENTE;
        }
    };

    public abstract CargoFuncionario getProximoCargo();

}
