/*Ejercicio 1 modificado para 3 dimensiones 
*/

public class Vector
{
    // atributos
    private double x; // double x, y
    private double y;
    private double z;


    // Constructor por omisión
    public Vector(){
        x = 0.0;
        y = 0.0;
        z = 0.0;
    }
    // Constructor por parametros
    public Vector(double valorX, double valorY,double valorZ){
        x = valorX;
        y = valorY;
        z = valorZ;
    }
    // metodos setter y getters
    public void setX(double valorX){
        x = valorX;
    }
    public double getX(){
        return x;
    }
    public void setY(double valorY){
        y = valorY;
    }
    public double getY(){
        return y;
    }
    public void setZ(double valorZ){
        z = valorZ;
    }
    public double getZ(){
        return z;
    }
}