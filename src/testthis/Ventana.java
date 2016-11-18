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
public class Ventana{

//Atributos
private float largo;
private float ancho;

//Constructores
public Ventana(){
}

public Ventana(float lar, float ancho){
largo= lar;
this.ancho=ancho;
}

public Ventana(float ancho){
this(5,ancho); 
//equivale a largo=5,this.ancho=ancho
//estamos llamando al anterior constructor
}

//public Ventana(float largo){
//this(largo,2);
//Este constructor da error pq tiene el
//mismo nombre y una variable float
//al igual que el anterior, por lo que
//tienen la misma firma y generan un
//conflicto. Para el compilador son iguales

//Acceso (gets,sets)
public float getAncho(){
return ancho;
}

public float getLargo(){
return largo;
}

public void setAncho(float ancho){
this.ancho=ancho;
}

public void setLargo(float lar){
largo=lar;
}

//Metodos
public Ventana incrementarLargo(){
largo++;
return this;
//Devuelve un objeto ventana con su largo
//incrementado en 1
}

public Ventana incrementarAncho(int valor){
ancho+=valor;
//es igual a ancho=ancho+valor
//no da conflicto de tipos pq añadimos un int
//a un float, al reves tendriamos que castear
//el float a int o fallaria
return this;
}

public String toString(){
    return "Ventana: largo="+largo+" ancho="+ancho;
}
//Cierre de la clase
}
