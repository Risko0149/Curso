package ejerEjemplosGuia10.main;

import ejerEjemplosGuia10.entidad.Persona;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> numerosA = new ArrayList(); //Lista de tipo Integer

        Persona persona1=new Persona("Ariel",29,35689123);
        Persona persona2=new Persona("Gustavo",57,17511342);
        Persona persona3=new Persona("Luis",55,22578964);
        Persona persona4=new Persona("Norma",52,25367985);
        Persona persona5=new Persona("Macarena",29,34433440);


        numerosA.add(persona1); //Agregamos el numero 20 a la lista, en la posición 0
        numerosA.add(persona2);
        numerosA.add(persona3);
        numerosA.add(persona4);
        numerosA.add(persona5);


    //CONJUNTOS:

        HashSet<Persona> numerosB = new HashSet();

        numerosB.add(persona1); //Agregamos el numero 20 a la lista, en la posición 0
        numerosB.add(persona2);
        numerosB.add(persona3);
        numerosB.add(persona4);
        numerosB.add(persona5);

    //MAPAS:

        HashMap<Integer, Persona> alumnos = new HashMap();


        alumnos.put(persona1.getDni(),persona1); //Agregamos la llave y el valor
        alumnos.put(persona2.getDni(),persona2);
        alumnos.put(persona3.getDni(),persona3);
        alumnos.put(persona4.getDni(),persona4);
        alumnos.put(persona5.getDni(),persona5);

        mostrarListas(numerosA,numerosB,alumnos);

        numerosA.remove(3);

        //Remover por Iterador.
        Iterator<Persona> it = numerosB.iterator();
        while (it.hasNext()){
            if(it.next()==persona1){
                it.remove();
            }
        }

        alumnos.remove(22578964);
        mostrarListas(numerosA,numerosB,alumnos);
    }
    public static void mostrarListas(ArrayList<Persona> numerosA, HashSet<Persona> numerosB, HashMap<Integer, Persona> alumnos){
        System.out.println("***********************************************************************************");
        System.out.println("ArrayList: ");
        for(Persona persona:numerosA){
            System.out.println(persona.toString());
        }
        System.out.println("***********************************************************************************");
        System.out.println("Conjuntos:");
        for(Persona persona:numerosB){
            System.out.println(persona.toString());
        }
        System.out.println("***********************************************************************************");
        /**
         *  for (Map.Entry<Integer, String> entry : estudiantes.entrySet()) {
         *
         *   System.out.println("Documento=" + entry.getKey() + ", Nombre=" + entry.getValue());
         *
         *   }
         */
        System.out.println("Mapas:");
        for(Map.Entry<Integer,Persona> valores: alumnos.entrySet()){
            System.out.println("Documento=" + valores.getKey() + ", Nombre=" + valores.getValue());
        }
        System.out.println("-------------- for normal----------------");
        for (Persona persona: alumnos.values()){
            System.out.println(persona);
        }
        System.out.println("-------------------Mostrar por iterador-------------");
        Iterator iterator=numerosA.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()+"\n");
        }
    }
}
