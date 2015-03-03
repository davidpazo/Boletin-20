package Boletin20;
/**
 *
 * @author dpazolopez
 */
public class Boletin20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno b = new Alumno();
        int op;
        do {
            op = b.menu();
            switch (op) {
                case 1:
                    b.add();
                    break;
                case 2:
                    b.delete();
                    break;
                case 3:
                    b.locate();
                    break;
                case 4:
                    b.listado();
                    break;
                case 5:
                    if (op == 7 && op == 0) {
                        System.exit(0);
                    }
            }
        } while (op != 5 && op != 0);
    }
}