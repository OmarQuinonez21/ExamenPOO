

package pruebas;

import javax.swing.JOptionPane;
//esta es la clase padre
public class ClasePadre {
    //atributos
protected double valor1;
protected double valor2;
protected double resultado;
//iguala los atributos a los valores recibidos
protected double cargar1(double primervalor){
    this.valor1= primervalor;
    return valor1;
}
protected double cargar2(double segundovalor){
    this.valor2 = segundovalor;
    return valor2;
}
//retorna el resultado de la operacion
public double operar(){
   return resultado; 
}
//se muestra el resultado
public void mostrarresultado(){
    JOptionPane.showMessageDialog(null, "El resultado de la operacion es: " + String.valueOf(this.operar()));
}
}
