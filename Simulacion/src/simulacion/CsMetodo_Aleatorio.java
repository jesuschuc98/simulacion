
package simulacion;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class CsMetodo_Aleatorio {
static double numero;
static double numero2;
    
    public ArrayList aleatorio(int iteraciones){
        
        
        ArrayList<Fila_Aleatorio>lista;
        
        int a,b,c,aux;  // Variables
        
        a=27; // Limite inferior de la distribuccion triangular
        b=219; // Limite superior de la distribuccion triangular
        c=85; // Moda de la distribuccion triangular
        int array[]= new int[iteraciones]; // Array
        int i=0; // contador
        
        lista= new ArrayList<Fila_Aleatorio>();
        
        for(int x=0; x<array.length; x++){
            
            Fila_Aleatorio fila = new Fila_Aleatorio();    
            
            numero = (double) (Math.random() *1.0) + .0; 
            System.out.println(" Aleatorio (R1):"+numero);
            numero2 = (double) (Math.random() *1.0) + .0; 
            System.out.println(" Aleatorio (R2):"+numero2);
            /* int n1 = (int)(random.nextDouble()*10); // Se genera  un numero desde el 0 al 1000
             int n2 = (int)(random.nextDouble()*10);
             double R1 = (double)n1/100;
             double R2 =(double)n2/100;*/
            
            if(numero<(b-a)/(c-a)){
                double datos=a+(b-a)*Math.sqrt(numero2);
                fila.setAleatorio(datos);
            }else{
                double datos2=c-(c-b)*Math.sqrt(1-numero2);
                fila.setAleatorio(datos2);
            }

            fila.setI(i);
            i++;
            
            lista.add(fila);
        }
        
        return lista;
    }
    
}
