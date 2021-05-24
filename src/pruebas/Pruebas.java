
package pruebas;

import javax.swing.JOptionPane;


public class Pruebas {

   
    public static void main(String[] args) {
        int x;
        //se crea una instancia del Frame
        Menu ventana = new Menu();
        //mediante un numero evaluamos si usar JOption o JFrame
       x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrse 1 para usar JOptionPane y 2 Para JFrame"));
       switch(x){
           case 1:
               String respuesta = JOptionPane.showInputDialog(null, "Ingrese: Multiplicar, Sumar, Restar, Dividir o Raiz");
               respuesta.toLowerCase();
               
              switch(respuesta){ 
                  case "multiplicar":
        //Se crea una instancia de la clase Multiplicacion, clase hija de ClasePadre
    Multiplicacion multi = new Multiplicacion();
        /*Mediante JOptionPane se le dan valores a los atributos Valor1 y Valor 2
        esto mediante los metodos cargar1 y cargar2*/
    multi.cargar1(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer valor")));
    multi.cargar2(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo valor")));
    //La instancia manda a llamar el metodo mostrarresultado, el cual se apoya del metodo operar
    multi.mostrarresultado();
    break;
                  case "raiz":
        //Se crea una instancia de la clase Multiplicacion, clase hija de ClasePadre
    RaizCuadrada sqrt = new RaizCuadrada();
        /*Mediante JOptionPane se le dan valores a los atributos Valor1 y Valor 2
        esto mediante los metodos cargar1 y cargar2*/
    sqrt.cargar1(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor a obtener su raiz con radical " + sqrt.radical)));
    //La instancia manda a llamar el metodo mostrarresultado, el cual se apoya del metodo operar
    sqrt.mostrarresultado();
    break;
              case"sumar":
                  Suma  s = new Suma();
                  s.cargar1(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer valor")));
                   s.cargar2(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo valor")));
                   s.mostrarresultado();
                  break;
    case"restar":
        
        Resta r = new Resta();
        r.cargar1(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer valor")));
                   r.cargar2(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo valor")));
                   r.mostrarresultado();
    break;
    case"dividir":
        Division d = new Division();
        d.cargar1(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer valor")));
                   d.cargar2(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo valor")));
                   d.mostrarresultado();
        break;
    default:
         JOptionPane.showMessageDialog(null, "No se ingreso la palabra indicada; gracias");
         break;
           }
              break;
              //tambien se puede hacer lo mismo por Jframe
           case 2: 
               ventana.setVisible(true);
               break;
           default:
               JOptionPane.showMessageDialog(null, "No se ingreso algun 1 o 2; gracias");
               break;
               
       }
    
    
    }
    
}
