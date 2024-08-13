package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        //NECESITO HACER UN LISTADO DE LOS PAISES SURAMERICANO

        //PARA CADA PAIS NECESITO ALMACENAR EL NUMERO DE:
        /*1.MEDALLAS DE ORO
        * 2.MEDALLAS DE PLATA
        * 3.MEDALLAS DE BRONCE*/

        //SUMAR EL NUMERO DE MEDALLAS DE CADA PAIS
        //INFORMAR CUAL ES EL PAIS CON MAS MEDALLAS
        //INFORMAR CUAL ES EL PAIS CON MENOS MEDALLAS

        //TERMINAR SUMANDO EL TOTAL DE MEDALLAS DE TODOS LOS PAISES SURAMERICANOS

        /////////////////////////////////////////////////////////////////////////////////
        Scanner leer =new Scanner(System.in);

        ArrayList<String> paises = new ArrayList<>();

        ArrayList<Integer> medallasPorPais= new ArrayList<>();

        System.out.println("****OLIMPICOS 2024****");
        for (int i=0; i<3; i++){
            String pais;
            int sumatoriaMedallas=0;
            System.out.println("Ingrese un pais: ");
            pais=leer.nextLine();
            paises.add(pais);

            //PIDIENDO LOS DATOS DE CADA PAIS
            System.out.println("Digita el Numero de medallas de oro de " +pais+": ");
                int medallasDeOro=leer.nextInt();
            System.out.println("Digita el Numero de medallas de plata de "+pais+": ");
            int medallasDePlata= leer.nextInt();
            System.out.println("Digite el numero de medallas de bronce de "+pais+": ");
            int medallasDeBronce=leer.nextInt();
            sumatoriaMedallas=medallasDeOro+medallasDePlata+medallasDeBronce;
            System.out.println(pais+" obtuvo en total: "+sumatoriaMedallas+" Medallas en Paris 2024");

            leer.nextLine();

            medallasPorPais.add(sumatoriaMedallas);



        }



        //RECORRIENDO UN ARREGLO
        int paisMayor=medallasPorPais.get(0);

        for (Integer medalla:medallasPorPais){
            if (medalla>paisMayor){
                paisMayor=medalla;
            }

        }
        System.out.println("El pais con mas medallas obtuvo un total de: "+paisMayor);

        //PREGUNTAR CUAL ES EL CAJON (INDICE) DONDE SE GUARDO LA CANTIDAD DE MEDALLAS MAYOR

        int indiceGanador=medallasPorPais.indexOf(paisMayor);
        System.out.println("el indice es el "+indiceGanador);

        //Quiero obtener el valor que hay dentro de un cajon

        System.out.println("Asi pues, el pais ganador fue: "+paises.get(indiceGanador));


        //ahora con el pais que quedo de ultimo














    }
}