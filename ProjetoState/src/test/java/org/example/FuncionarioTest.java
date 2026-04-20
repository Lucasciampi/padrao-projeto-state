package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    Funcionario funcionario;

    @BeforeEach
    void setUp() {
        funcionario = new Funcionario();
    }

    // Funcionario ativo

    @Test
    public void naoDeveAtivarFuncionarioAtivo() {
        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        assertFalse(funcionario.ativo());
    }

    @Test
    public void deveEntrarDeFeriasFuncionarioAtivo() {
        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        assertTrue(funcionario.ferias());
        assertEquals(FuncionarioEstadoFerias.getInstance(), funcionario.getEstado());
    }

    @Test
    public void deveEntrarDeLicencaFuncionarioAtivo() {
        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        assertTrue(funcionario.licenca());
        assertEquals(FuncionarioEstadoLicenca.getInstance(), funcionario.getEstado());
    }

    @Test
    public void deveAposentarFuncionarioAtivo() {
        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        assertTrue(funcionario.aposentar());
        assertEquals(FuncionarioEstadoAposentado.getInstance(), funcionario.getEstado());
    }

    @Test
    public void deveDesligarFuncionarioAtivo() {
        funcionario.setEstado(FuncionarioEstadoAtivo.getInstance());
        assertTrue(funcionario.desligar());
        assertEquals(FuncionarioEstadoDesligado.getInstance(), funcionario.getEstado());
    }

    // Funcionario de férias

    @Test
    public void deveAtivarFuncionarioDeFerias() {
        funcionario.setEstado(FuncionarioEstadoFerias.getInstance());
        assertTrue(funcionario.ativo());
        assertEquals(FuncionarioEstadoAtivo.getInstance(), funcionario.getEstado());
    }

    @Test
    public void naoDeveTirarFeriasFuncionarioFerias() {
        funcionario.setEstado(FuncionarioEstadoFerias.getInstance());
        assertFalse(funcionario.ferias());
    }

    @Test
    public void naoDeveEntrarDeLicencaFuncionarioFerias() {
        funcionario.setEstado(FuncionarioEstadoFerias.getInstance());
        assertFalse(funcionario.licenca());
    }

    @Test
    public void naoDeveAposentarFuncionarioFerias() {
        funcionario.setEstado(FuncionarioEstadoFerias.getInstance());
        assertFalse(funcionario.aposentar());
    }

    @Test
    public void naoDeveDesligarFuncionarioFerias() {
        funcionario.setEstado(FuncionarioEstadoFerias.getInstance());
        assertFalse(funcionario.desligar());
    }

    // Funcionario de licença médica

    @Test
    public void deveAtivarFuncionarioDeLicenca() {
        funcionario.setEstado(FuncionarioEstadoLicenca.getInstance());
        assertTrue(funcionario.ativo());
        assertEquals(FuncionarioEstadoAtivo.getInstance(), funcionario.getEstado());
    }

    @Test
    public void naoDeveTirarFeriasFuncionarioLicenca() {
        funcionario.setEstado(FuncionarioEstadoLicenca.getInstance());
        assertFalse(funcionario.ferias());
    }

    @Test
    public void naoDeveEntrarDeLicencaFuncionarioLicenca() {
        funcionario.setEstado(FuncionarioEstadoLicenca.getInstance());
        assertFalse(funcionario.licenca());
    }

    @Test
    public void naoDeveAposentarFuncionarioLicenca() {
        funcionario.setEstado(FuncionarioEstadoLicenca.getInstance());
        assertFalse(funcionario.aposentar());
    }

    @Test
    public void naoDeveDesligarFuncionarioLicenca() {
        funcionario.setEstado(FuncionarioEstadoLicenca.getInstance());
        assertFalse(funcionario.desligar());
    }

    // Funcionario aposentado

    @Test
    public void naoDeveAtivarFuncionarioAposentado() {
        funcionario.setEstado(FuncionarioEstadoAposentado.getInstance());
        assertFalse(funcionario.ativo());
    }

    @Test
    public void naoDeveTirarFeriasFuncionarioAposentado() {
        funcionario.setEstado(FuncionarioEstadoAposentado.getInstance());
        assertFalse(funcionario.ferias());
    }

    @Test
    public void naoDeveEntrarDeLicencaFuncionarioAposentado() {
        funcionario.setEstado(FuncionarioEstadoAposentado.getInstance());
        assertFalse(funcionario.licenca());
    }

    @Test
    public void naoDeveAposentarFuncionarioAposentado() {
        funcionario.setEstado(FuncionarioEstadoAposentado.getInstance());
        assertFalse(funcionario.aposentar());
    }

    @Test
    public void naoDeveDesligarFuncionarioAposentado() {
        funcionario.setEstado(FuncionarioEstadoAposentado.getInstance());
        assertFalse(funcionario.desligar());
    }

    // Funcionario desligado

    @Test
    public void naoDeveAtivarFuncionarioDesligado() {
        funcionario.setEstado(FuncionarioEstadoDesligado.getInstance());
        assertFalse(funcionario.ativo());
    }

    @Test
    public void naoDeveTirarFeriasFuncionarioDesligado() {
        funcionario.setEstado(FuncionarioEstadoDesligado.getInstance());
        assertFalse(funcionario.ferias());
    }

    @Test
    public void naoDeveEntrarDeLicencaFuncionarioDesligado() {
        funcionario.setEstado(FuncionarioEstadoDesligado.getInstance());
        assertFalse(funcionario.licenca());
    }

    @Test
    public void naoDeveAposentarFuncionarioDesligado() {
        funcionario.setEstado(FuncionarioEstadoDesligado.getInstance());
        assertFalse(funcionario.aposentar());
    }

    @Test
    public void naoDeveDesligarFuncionarioDesligado() {
        funcionario.setEstado(FuncionarioEstadoDesligado.getInstance());
        assertFalse(funcionario.desligar());
    }

}