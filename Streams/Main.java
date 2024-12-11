package Streams;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        
        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Luis", "5546363728", 24, "Monterrey", "CL11", 1000.0));
        personas.add(new Persona("Mario", "9946363728", 29, "Merida", "CL12", 900.0));
        personas.add(new Persona("Pedro", "5546363728", 40, "Monterrey", "CL9", 2000.0));
        personas.add(new Persona("Maria", "9946363728", 22, "Monterrey", "CL8", 3000.0));
        personas.add(new Persona("Andrea", "5546363728", 31, "Merida", "CL12", 900.0));
        personas.add(new Persona("Hector", "9946363728", 31, "Ciudad de Mexico", "CL12", 900.0));

        //Empleados de mty
        List<Persona> lista1 = personas.stream()
            .filter(p ->p.getCiudad().equals("Monterrey"))
            .collect(Collectors.toList());
        System.out.println(lista1);
        System.out.println("------------------------------------------------------");


        //Nombres empleados
        List<String> lista2 = personas.stream()
            .map(Persona::getNombre)
            .collect(Collectors.toList());
        System.out.println(lista2);
        System.out.println("------------------------------------------------------");


        //Empleados con telefono iniciando en 99
        List<Persona> lista3 = personas.stream()
            .filter(p -> p.getTelefono().startsWith("99"))
            .collect(Collectors.toList());
        System.out.println(lista3);
        System.out.println("------------------------------------------------------");


        //Formato
        List<String> lista4 = personas.stream()
            .map(p -> p.getNombre().toUpperCase() + " - " + p.getNivel())
            .collect(Collectors.toList());
        System.out.println(lista4);
        System.out.println("------------------------------------------------------");


        //Por orden ascendente de nivel
        List<String> lista5 = personas.stream()
            .sorted(Comparator.comparing(persona -> Integer.parseInt(persona.getNivel().substring(2))))
            .map(p -> p.getNombre().toUpperCase() + " " + p.getNivel())
            .collect(Collectors.toList());
        System.out.println(lista5);
        System.out.println("------------------------------------------------------");


        //Menores de 30 anos
        List<Persona> lista6 = personas.stream()
            .filter(p -> p.getEdad() < 30)
            .collect(Collectors.toList());
        System.out.println(lista6);
        System.out.println("------------------------------------------------------");


        //Ciudades sin duplicados
        Set<String> lista7 = personas.stream()
            .map(p -> p.getCiudad())
            .collect(Collectors.toSet());
        System.out.println(lista7);
        System.out.println("------------------------------------------------------");


        double sumaSueldos = personas.stream()
            .mapToDouble(Persona::getSueldo)
            .sum();
            System.out.println(sumaSueldos);
            System.out.println("------------------------------------------------------");

    }

}
