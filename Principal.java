/*Ejemplo de operaciones entre vectores la clase Principal*/
public class Principal
{
    //atributos
    private Vector vectorA;
    private Vector vectorB;

    public Vector multiplicacionEscalar(Vector vect, double escalar){
        Vector nuevoVector = new Vector();
        nuevoVector.setX(vect.getX()*escalar); // vect.setX(vect.getX()*escalar)
        nuevoVector.setY(vect.getY()*escalar);// vect.setY(vect.getY()*escalar)
        nuevoVector.setZ(vect.getZ()*escalar);
        return nuevoVector;
    }
    public Vector suma(Vector a, Vector b){
        Vector nuevoVector = new Vector(a.getX()+b.getX(), a.getY()+b.getY(), a.getZ()+b.getZ());
        return nuevoVector;
    }
    public Vector resta(Vector a,Vector b){
        Vector nuevoVector = new Vector(a.getX()-b.getX(), a.getY()-b.getY(), a.getZ()-b.getZ());
        return nuevoVector;
    }
    public Double ProductoPunto(Vector a, Vector b,double resultado){
        resultado = (a.getX()*b.getX()) + (a.getY()*b.getY()) + (a.getZ()*b.getZ());
        return resultado;
    }
   public Vector multiplicacion(Vector a, Vector b){
       double i,j,k;
       i=(a.getY()*b.getZ()) - (b.getY()*a.getZ());
       j= -(a.getX()*b.getZ()) - (b.getX()*a.getZ());
       k= (a.getX()*b.getY()) - (b.getX()*a.getY());
       Vector nuevoVector = new Vector(i,j,k);
       return nuevoVector;
   }
 

  
    public static void main(String args[]){
        Vector a = new Vector(3, 5, 2); // constructor por parametros
        Vector b = new Vector(8,4,1); // constructor por omision
        Double resultado=0.0;
     
        Principal p = new Principal(); // aunque no se defina el constructor por omision existe

        Vector c = p.multiplicacionEscalar(a, 2.5);
        System.out.println("nuevo vector x:"+ c.getX() + "   y:" + c.getY() + "   z:" + c.getZ());

        Vector suma = p.suma(a,b);
        System.out.println("nuevo vector suma:"+ suma.getX() + "   y:"
        + suma.getY() + "   z:" + suma.getZ()); 

        Vector resta = p.resta(a,b);
        System.out.println("nuevo vector resta:"+ resta.getX() + "   y:"
        + resta.getY() + "   z:" + resta.getZ());   

        Double P = p.ProductoPunto(a,b,resultado);
        System.out.println("Producto Punto: "+ resultado);

        Vector multiplicacion = p.multiplicacion(a,b);
        System.out.println("Producto cruz: "+ multiplicacion.getX() + "  y:"+ multiplicacion.getY()+ "   z:"
        +multiplicacion.getZ());
        }
}
