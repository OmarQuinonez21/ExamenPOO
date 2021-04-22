/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplogithub;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Formatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String cabecera = "\n\tPronostico de clima: \n";
      cabecera+="\n\tdia\t\tmañana\tnoche\tcondiciones\n";
      cabecera+="\t----\t\t-----\t-------\t--------\n";
      String pronostico="\tDomingo\t25c\t\t33c\t\tSoleado\n";
      pronostico+="\tLunes\t18c\t\t19c\t\tNublado\n";
       pronostico+="\tMartes\t40c\t\t29c\t\tcaluroso\n";
        System.out.println(cabecera+pronostico);
    }
    
}
