package aulas.oo.SingleReponsibityPrinciple.solution;
import aulas.oo.SingleReponsibityPrinciple.problem.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/*
* Classe OrdemDeCompra
* */
public class OrdemDeCompra {

    public List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public BigDecimal calcularTotal() {
        return produtos.stream()
                .map(Produto::getValor)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

}

/*
* Classe OrdemDeCompraRepository
* */
class OrdemDeCompraRepository {

    public List<OrderDeCompra> buscarOrdensDeCompra() {
        //retorna a lista de ordens de compra da base de dados
        return new ArrayList<>();
    }

    public void salvarOrdensCompra() {
        //salva lista de produtos na base de dados
    }

    public void alterarOrdemCompra(){
        //alterar base de dados
    }

}

/*
* Classe OrdemDeCompraMail
* */
class OrdemDeCompraMail {

    public void enviarEmail(String email) {
        //envia email da ordem de compra
    }

}

/*
* Classe OrdemDeCompraPrint
* */
class OrdemDeCompraPrint{

    public void imprimirOrdemDeCompra(){
        //imprime a ordem de compra
    }

}
