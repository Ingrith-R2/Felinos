import Felinos.*;
import java.util.Objects;
import java.util.Scanner;

public class Main_Principal {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int op;
        guepardo felino1 = new guepardo("Guepardo","Acinonyx jubatus","Bosques secos, matorrales, pastizales y desiertos",
                " distintivas son la presencia de una cabeza pequeña que tiene dos líneas negras que van desde los ojos hasta el hocico.",
                72);
        jaguar felino2 = new jaguar("Jaguar","Panthera onca","America, selvas de Guatemala",
                "Es uno de los grandes felinos considerados en peligro de extinción, debido principalmente, a las amenazas que sufren de caza furtiva, y a la disminución poblacional de sus presas más habituales, " +
                        "entre las que se incluyen los ciervos y los monos.",37);
        leopardo felino3 = new leopardo("Leopardo","Panthera pardus","Africa, sobrevien en Asia y Oriente Medio",
                "Presentan a veces un pelaje completamente negro, recibiendo en estos casos el nombre común de pantera negra",
                "La caza y actividad principalmente nocturnos, caracterizados por su sigilo y rapidez de ataque como principales estrategias de caza");
        lince felino4 = new lince("Lince","Lynx ","Bosque mediterraneo","animales muy escurridizos y difíciles de ver, con una gran agilidad y hábitos de caza principalmente nocturnos",
                "Mediano",4);
        tigre felino5 = new tigre("Tigre","Panthera tigris","oriente, en países como la India, Bangladesh, Indonesia y Siberia",
                "hermoso pelaje negro y anaranjado, además de sus largos bigotes blancos",6);

        System.out.println("------- Bienvenido al Menu de Felinos --------");
        do{
            System.out.println("ELiga el Felino");
            System.out.println("1. Guepardo");
            System.out.println("2. Jaguar");
            System.out.println("3. Leopardo");
            System.out.println("4. Lince");
            System.out.println("5. Tigre");
            System.out.print("Ingrese su opcion: ");
            op = entrada.nextInt();

            switch (op){
                case 1:
                    System.out.println("-----Guepardo-----");
                    felino1.imprimirDatos();
                    felino1.imprimirD();

                    break;
                case 2:
                    System.out.println("-----Jaguar-----");
                    felino2.imprimirDatos();
                    felino2.imprimirD();

                    break;
                case 3:
                    System.out.println("-----Leopardo-----");
                    felino3.imprimirDatos();
                    felino3.imprimirD();

                    break;
                case 4:
                    System.out.println("-----Lince-----");
                    felino4.imprimirDatos();
                    felino4.imprimirD();

                    break;
                case 5:
                    System.out.println("-----Tigre-----");
                    felino5.imprimirDatos();
                    felino5.imprimirD();

                    break;

            }
            System.out.println("");
            System.out.println("**************************************************");
            System.out.println("Desea continuar con el programa?");
            System.out.print("Selecione 1 para SI y 2 para NO: ");
            op = entrada.nextInt();
        }while (op==1);
        System.out.println("GRacias por usar el Programa");
    }
}
