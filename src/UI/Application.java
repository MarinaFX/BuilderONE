package UI;

import java.util.Scanner;

public class Application {

    private static void coletaPedido(){
        Scanner in = new Scanner(System.in);
        String escolhaHamburguer = "";
        String escolhaBatata = "";
        String escolhaBrinquedo = "";
        String escolhaBebida = "";

        System.out.println("Qual hamburguer deseja? ");
        System.out.println("1 - hamburguer");
        System.out.println("2- cheeseburguer");
        escolhaHamburguer = in.nextLine();

        System.out.println("Qual o tamanho da batata? ");
        System.out.println("1 - Pequeno");
        System.out.println("2- Médio");
        System.out.println("3 - Grande");
        escolhaBatata = in.nextLine();

        System.out.println("Qual o tipo de brinquedo? ");
        System.out.println("1 - Carrinho");
        System.out.println("2- Boneca");
        escolhaBrinquedo = in.nextLine();

        System.out.println("Qual a bebida? ");
        System.out.println("1 - Coca-Cola");
        System.out.println("2- Guaraná");
        escolhaBebida = in.nextLine();

    }

    private static void atribuiSabores(String hamburg, String batata, String brinquedo, String liquido){
        String hamburguer = "";
        String tamanhoBatata = "";
        String tipoBrinquedo = "";
        String bebida = "";

        switch (hamburg){
            case "1":
            case "2":
        }



    }

    public static void main(String[] args) {
        System.out.println("Bem vindo ao McDonelds!! :D");

    }
}
