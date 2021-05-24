
package pruebas;

public class RaizCuadrada extends ClasePadre {
     
    //Asignacion de un valor especifico 
     final double radical=2;
    
     //Uso de override
 @Override
    protected double cargar1(double primervalor) {
        
//Uso de super
        return super.cargar1(primervalor); 
    }


    @Override
    public double operar() {
     //Utilizamos la clase math para obtener la raiz cuadrada
        resultado = Math.sqrt(valor1);
        //se efectua la operacion correspondiente en cada clase
        return super.operar(); 
    }
}
