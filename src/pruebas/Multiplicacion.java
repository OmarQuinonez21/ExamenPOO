

package pruebas;
//uso de extends
public class Multiplicacion extends ClasePadre {

    
//uso de override y super
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
        resultado = valor1 * valor2;
        return super.operar(); 
    }

    @Override
    public void mostrarresultado() {
        super.mostrarresultado(); 
    }


}
