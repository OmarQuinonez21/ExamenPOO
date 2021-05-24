

package pruebas;


public class Division extends ClasePadre{
 @Override
    protected double cargar1(double primervalor) {
        return super.cargar1(primervalor); 
    }

    @Override
    protected double cargar2(double segundovalor) {
        return super.cargar2(segundovalor); 
    }

    @Override
    public double operar() {
        //se efectua la operacion correspondiente en cada clase
        resultado = valor1 / valor2;
        return super.operar(); //To change body of generated methods, choose Tools | Templates.
    }
}
