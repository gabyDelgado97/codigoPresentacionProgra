package TreeSet;
import java.util.*;
public class ConjuntoOrdenado {
    public static void main(String[] args) {
        String[] cadena1 = {"Libro","Mesa","mes","Papel","Papelera","armario","globo"};
        String[] cadena2 = {"Lupe","Maria","angela","Julian","Esperanza","Miguel","maite","marta"}; 
        
        TreeSet cor1, cor2;
        cor1 = new TreeSet();
        cor2 = new TreeSet(new Compara());
        for(int i=0; i<cadena1.length; i++){
            cor1.add(cadena1[i]);
        }
        for(int i=0; i<cadena2.length; i++){
            cor2.add(cadena2[i]);
        }
        System.out.println("Conjunto ordenado, sin comparador: "+cor1);
        System.out.println("Conjunto ordenado, con comparador: "+cor2);
        
        //eliminar un elemento
        if(cor1.remove("Mes")){
            System.out.println("Eliminado - Mes - de conjunto 1 "+cor1);
        }else{
            System.out.println("No se encuentra - Mes - de conjunto 1 "+cor1);
        }
        
        if(cor2.remove("MAITE")){
            System.out.println("Eliminar - MAITE - de conjunto 2"+cor2);
        }else{
            System.out.println("No se encuentra - MAITE - de conjunto 2"+cor2);
        }
        
        //Obtener un subconjunto y operaciones
        Set sc1;
        sc1 = cor1.subSet("Libro", "armario");
        System.out.println("Subconjunto: "+sc1);
        sc1.add("Marta");
        System.out.println("Subconjunto modificado: "+sc1);
    }
}
