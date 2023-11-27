package br.com.raijheckinny;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tarefa {
    public static void main(String args []){
       // imprimirListaString();
        imprimirListaStringPorGenero();
    }

    private static void imprimirListaStringPorGenero() {
        List<String> lista = new ArrayList<String>();
        List<String> listaMasculino = new ArrayList<String>();
        List<String> listaFeminino = new ArrayList<String>();

        lista.add("Lucas - M");
        lista.add("Julia - F");
        lista.add("Vitor - M");
        lista.add("Maria - F");
        lista.add("Carol - F");
        lista.add("Pedro - M");

        //Corta os Array em Nome em uma parte e genero em outra parte
        for (String nomeGenero : lista ){
             String[] partes = nomeGenero.split(" - ");

             if(partes[1].equals("M")){
                 listaMasculino.add(partes[0]);
             } else if (partes[1].equals("F")) {
                 listaFeminino.add(partes[0]);
             }
        }

        System.out.println(listaMasculino);
        System.out.println(listaFeminino);


    }

    private static void imprimirListaString() {
        List<String> lista = new ArrayList<String>();
        lista.add("Pedro");
        lista.add("Lucas");
        lista.add("Vitor");
        lista.add("Maria");
        lista.add("Julia");
        lista.add("Carol");

        Collections.sort(lista);
        System.out.println(lista);
    }

}
