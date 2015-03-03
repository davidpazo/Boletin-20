package Boletin20;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JOptionPane;

/**
 * ** @author dpazolopez ***
 */
public class Alumno extends Colexio {

    static int numRegistro = 5500;

    Map<String, Colexio> Alumno = new TreeMap<>();

    public Alumno() {
    }

    public void add() {
        int op;
        do {
            String nr = String.valueOf(numRegistro);
            String nom = JOptionPane.showInputDialog("Nombre: ");
            int n = Integer.parseInt(JOptionPane.showInputDialog("Nota: "));
            Alumno.put(nr, new Colexio(nom, n));
            op = JOptionPane.showConfirmDialog(null, "¿otro alumno?");
        } while (op == 0);
    }

    public void delete() {
        int p;
        do {
            String r = JOptionPane.showInputDialog("Introducir Registro");
            Alumno.remove(r);
            p = JOptionPane.showConfirmDialog(null, "Dar de baja otro alumno?");
        } while (p == 0);
    }

    public void locate() {
        int conf;
        do {
            String r = JOptionPane.showInputDialog("Introducir Registro");
            boolean x = Alumno.containsKey(r);
            if (x) {
                JOptionPane.showMessageDialog(null, Alumno.get(r));
            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno con registro: " + r);
            }
            conf = JOptionPane.showConfirmDialog(null, "Consultar otro alumno?");
        } while (conf == 0);
    }

    public void listado() {
        String s = "";

        /*for (String r : Alumno.keySet()) {
         s += r + "\nNombre: " + Alumno.get(r).getNome() + Alumno.get(r).getNota() + "\n<----------->\n";
         System.out.println(Alumno.get(r));
         }*/
        Iterator it = Alumno.keySet().iterator();
        while (it.hasNext()) {
            String clave = (String) it.next();
            Colexio aux = Alumno.get(clave);
            s += clave + aux + "\n<--->\n";
        }
        JOptionPane.showMessageDialog(null, s);

    }

    public int menu() {
        int op = JOptionPane.showOptionDialog(
                null, "Selecciona una opción", "Menú", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{
                    "Dar alta Alumno",
                    "Dar baja Alumno",
                    "Buscar Alumno",
                    "Visualizar listado Alumnos",
                    "Salir"},
                "Exit");
        return op + 1;
    }
}
