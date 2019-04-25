package Builders;

import GClasses.Pedido;

public class ConcreteBuilder implements AbstractBuilder {
    Pedido pedido = new Pedido();

    @Override
    public void buildHamburger(String sabor) {
        if (sabor.equalsIgnoreCase("hamburger")) {
            pedido.adicionarDentroDaCaixa("Hamburger");
        }

        if (sabor.equalsIgnoreCase("cheeseburger")) {
            pedido.adicionarDentroDaCaixa("Cheeseburger");
        }
    }

    @Override
    public void buildBatata(String tamanho) {
        if (tamanho.equalsIgnoreCase("grande")) {
            pedido.adicionarDentroDaCaixa("Batata Grande");
        }
        else {
            if (tamanho.equalsIgnoreCase("media")) {
                pedido.adicionarDentroDaCaixa("Batata Média");
            }
            else {
                if (tamanho.equalsIgnoreCase("pequena")) {
                    pedido.adicionarDentroDaCaixa("Batata Pequena");
                }
            }
        }
    }

    @Override
    public void buildBrinquedo(String tipo) {
        if (tipo.equalsIgnoreCase("carrinho")) {
            pedido.adicionarDentroDaCaixa("Hot Wheels");
        }

        if (tipo.equalsIgnoreCase("boneca")) {
            pedido.adicionarDentroDaCaixa("Boneca");
        }
    }

    @Override
    public void buildBebida(String sabor) {
        if (sabor.equalsIgnoreCase("coca")){
            pedido.adicionarForaDaCaixa("Coca-Cola");
        }

        if (sabor.equalsIgnoreCase("guarana")){
            pedido.adicionarForaDaCaixa("Guaraná");
        }
    }

    public Pedido getPedido(){
        return this.pedido;
    }
}
