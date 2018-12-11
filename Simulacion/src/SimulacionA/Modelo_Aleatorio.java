
package SimulacionA;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Modelo_Aleatorio extends AbstractTableModel{

    private String[] columnas = {"Iteraciones","Vaiables Aleatorias"};
    private ArrayList<Fila_Aleatorio> lista;
    
    public Modelo_Aleatorio(ArrayList<Fila_Aleatorio>lista){
        this.lista=lista;
    }
    
    public Modelo_Aleatorio(){
        
    }
    
    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return lista.size();
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return columnas.length;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        
        switch(columna){
            case 0:
                return this.lista.get(fila).getI();
            case 1:
                return this.lista.get(fila).getAleatorio();
            default:
                return null;
        }
    }
   
    @Override
    public String getColumnName(int i) {
        return this.columnas[i];
    }
}
