package aulas.oo.OpenClosedPrinciple.problem;

import aulas.oo.OpenClosedPrinciple.solution.DescontoLivroAcao;

public class ControladorDeDesconto {
    public void adicionaDescontoLivroInfantil(DescontoLivroInfantil descontoLivroInfantil){
        descontoLivroInfantil.valorDescontoLivroInfantil();
    }

    public void adicionaDescontoLivroAutoAjuda(DescontoLivroAutoAjuda descontoLivroAutoAjuda){
        descontoLivroAutoAjuda.valorDescontoLivroAutoAjuda();
    }

    public void adicionaDescontoLivroAcao(DescontoLivroAcao descontoLivroAcao){
        descontoLivroAcao.descontoLivroAcao();
    }
}
