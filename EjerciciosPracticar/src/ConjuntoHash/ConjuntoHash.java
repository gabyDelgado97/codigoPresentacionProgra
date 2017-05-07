package ConjuntoHash;
import java.util.*;
public class ConjuntoHash {
    
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        Scanner entrada= new Scanner(System.in);
        HashSet conjunto1 = new HashSet();
        HashSet conjunto2 = new HashSet();
        ConjuntoHash a = new ConjuntoHash();
        int opc;
        do{
            System.out.println("MENU OPERACIONES BASICAS CONJUNTOS CON HASHSET");
            System.out.println("1) Generar nuevos conjuntos");
            System.out.println("2) Metodo union entre conjuntos");
            System.out.println("3) Metodo diferencia entre conjuntos");
            System.out.println("4) Metodo interseccion entre conjuntos");
            System.out.println("5) Mostrar conjuntos");
            System.out.println("6) Salir");
            opc=entrada.nextInt();
            switch(opc){
                    case 1: 
                        conjunto1 = a.crearConjunto();
                        System.out.println("El conjunto 1 es: "+conjunto1);
                        conjunto2 = a.crearConjunto();
                        System.out.println("El conjunto 2 es: "+conjunto2);
                        break;
                    case 2:
                        HashSet union;
                        union = (HashSet)conjunto2.clone();   //crea una copia del conjunto 2 y hace un casting para convertirlo en hashset ya que el metodo clone devuelve un Object
                        union.addAll(conjunto1);
                        System.out.println("La union del conjunto 1 y 2 es: ");
                        a.iteraConjunto(union);
                        break;
                    case 3:
                        HashSet diferencia;
                        diferencia = (HashSet)conjunto2.clone();
                        diferencia.removeAll(conjunto1);   //elimina los elementos elementos del conjunto 2 que se repiten en el conjunto 1
                        System.out.println("La diferencia: elementos del conjunto 2 que no se repiten en el conjunto 1 es: ");
                        a.iteraConjunto(diferencia);
                        break;
                    case 4:
                        HashSet insercion;
                        insercion = (HashSet)conjunto2.clone();
                        insercion.retainAll(conjunto1);    //elimina los elementos del conjunto 2 que no esten en el conjunto 1
                        System.out.println("La interseccion del conjunto 1 y 2 es: ");
                        a.iteraConjunto(insercion);
                        break;
                    case 5: 
                        System.out.println("El conjunto 1 es: "+conjunto1);
                        System.out.println("El conjunto 2 es: "+conjunto2);
                        break;
                    case 6:
                        break;
            }
        }while(opc!=6);
    }
    
    public void iteraConjunto(Set conjunto){
        Iterator ic = conjunto.iterator();  //crear un iterator
        Integer q;
        while(ic.hasNext()){   //devuelve true si queda elementos no visitados
            q = (Integer) ic.next();    //devuelve el primer elemento, hace un casting porque el metodo next devuelve un Object
            System.out.print(q+" ");
        }
        System.out.println();
    }
    
    public HashSet crearConjunto(){
        HashSet q = new HashSet();
        int n = (int)(Math.random()*7 +3);
        for(int i=0; i<n; i++){
            boolean s;
            Integer e = (int) (Math.random() * 17 + 3);
            q.add(e);   //anade al conjunto q
        }
        return q;   
    }
}
