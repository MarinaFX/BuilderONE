package UI;

import Builders.ConcreteBuilder;
import GClasses.Pedido;

import java.util.Scanner;

public class Application {
    private static ConcreteBuilder builder = new ConcreteBuilder();

    private static void coletaPedido() {
        Scanner in = new Scanner(System.in);
        String escolhaHamburguer = "";
        String escolhaBatata = "";
        String escolhaBrinquedo = "";
        String escolhaBebida = "";

        System.out.println("Qual hamburguer deseja? ");
        System.out.println("1 - hamburguer");
        System.out.println("2 - cheeseburguer");
        escolhaHamburguer = in.nextLine();

        System.out.println("Qual o tamanho da batata? ");
        System.out.println("1 - Pequeno");
        System.out.println("2 - Médio");
        System.out.println("3 - Grande");
        escolhaBatata = in.nextLine();

        System.out.println("Qual o tipo de brinquedo? ");
        System.out.println("1 - Carrinho");
        System.out.println("2 - Boneca");
        escolhaBrinquedo = in.nextLine();

        System.out.println("Qual a bebida? ");
        System.out.println("1 - Coca-Cola");
        System.out.println("2 - Guaraná");
        escolhaBebida = in.nextLine();

        Application.atribuiSabores(escolhaHamburguer, escolhaBatata, escolhaBrinquedo, escolhaBebida);
    }

    private static void atribuiSabores(String hamburg, String batata, String tipoBrinquedo, String liquido) {

        String hamburguer = "";
        String tamanhoBatata = "";
        String brinquedo = "";
        String bebida = "";

        switch (hamburg) {
            case "1":
                hamburguer = "hamburger";
                break;
            case "2":
                hamburguer = "cheeseburger";
                break;
            default:
                throw new IllegalArgumentException("HAMBURGUER_NÃO_CADASTRADO");
        }

        switch (batata) {
            case "1":
                tamanhoBatata = "pequena";
                break;
            case "2":
                tamanhoBatata = "media";
                break;
            case "3":
                tamanhoBatata = "grande";
                break;
            default:
                throw new IllegalArgumentException("TAMANHO_DE_BATATA_NÃO_EXISTENTE");
        }

        switch (tipoBrinquedo) {
            case "1":
                brinquedo = "carrinho";
                break;
            case "2":
                brinquedo = "boneca";
                break;
            default:
                throw new IllegalArgumentException("BRINQUEDO_NÃO_CADASTRADO");
        }

        switch (liquido){
            case "1":
                bebida = "coca";
                break;
            case "2":
                bebida = "guarana";
                break;
                default:
                    throw new IllegalArgumentException("BEBIDA_NÃO_CADASTRADA");
        }

        Application.fazPedido(hamburguer, tamanhoBatata, brinquedo, bebida);
    }

    private static void fazPedido(String hamburg, String batata, String brinquedo, String liquido){
        builder.buildHamburger(hamburg);
        builder.buildBatata(batata);
        builder.buildBrinquedo(brinquedo);
        builder.buildBebida(liquido);
    }

    private static void imprimePedido(){
        Pedido pedido = builder.getPedido();

        System.out.println(pedido.toString());
    }

    public static void main(String[] args) {
        System.out.println("Bem vindo ao DjDonelds!! :D");

        try {
            Application.coletaPedido();
        } catch (IllegalArgumentException f){
            System.err.println(f.getMessage());
        }

        Application.imprimePedido();
    }
}
