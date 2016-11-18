/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testthis;

/**
 *
 * @author otorradomiguez
 */
public class TestThis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ventana v1=new Ventana(1,2);
        //Mas correctamente deberia ser Ventana v1=new Ventana(1f,2f);
        //pq el constructor pide floats, pero como int se de menor categoria
        //hace la conversion automaticamente. Si fuesen doubles en lugar
        //de ints si daria error pq no puede convertir double a float directamente
        System.out.println(v1.toString());
        
        System.out.println(v1);
        //al imprimir v1, como hay un metodo toString() en la clase lo llama de
        //forma automatica. si no esta definido en la clase y llamamos
        //al metodo predefinido toString() imprime el identificador del objeto
        //testthis.Ventana@6bc7c054
        v1=v1.incrementarLargo();
        System.out.println(v1);
        System.out.println(v1.incrementarLargo());
        //podemos llamar al metodo desde el propio sout
        System.out.println(v1.incrementarAncho(5));
        System.out.println(v1.incrementarAncho((int)5.3));
        //En esta hay un caste pq tenemos que devolver un float y no hace la
        //conversion float->int de forma automatica, igual que en la siguiente
        //linea tenemos que indicar que el 2.5 es un float con la "f" sino lo
        //considera un double
        Ventana v2=new Ventana(2.5f);
        System.out.println(v2);
    }
    
}
