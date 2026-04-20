package org.example;

public class Funcionario {

    private FuncionarioEstado estado;

    public Funcionario() {
        this.estado = FuncionarioEstadoAtivo.getInstance();
    }

    public void setEstado(FuncionarioEstado estado) {
        this.estado = estado;
    }

    public FuncionarioEstado getEstado() {
        return estado;
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public boolean ativo() {
        return estado.ativo(this);
    }

    public boolean ferias() {
        return estado.ferias(this);
    }

    public boolean licenca() {
        return estado.licenca(this);
    }

    public boolean aposentar() {
        return estado.aposentar(this);
    }

    public boolean desligar() {
        return estado.desligar(this);
    }

}
