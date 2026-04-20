package org.example;

public abstract class FuncionarioEstado {

    public abstract String getEstado();

    public boolean ativo( Funcionario funcionario) {
        return false;
    }

    public boolean ferias(Funcionario funcionario) {
        return false;
    }

    public boolean licenca(Funcionario funcionario) {
        return false;
    }

    public boolean aposentar(Funcionario funcionario) {
        return false;
    }

    public boolean desligar(Funcionario funcionario) {
        return false;
    }

}
