package examenuf2_m5;

/**
 * Classe Pantry amb els metodes i constructor.
 * @author Felipe Lucero Lira
 */
public class Pantry {

    private Jam jar1;
    private Jam jar2;
    private Jam jar3;
    private Jam selected;
/**
 * Constructor de la despensa on es guarden els pots de mermelada
 * @see Jam.java
 * @param jar1
 * @param jar2
 * @param jar3 
 */
    Pantry(Jam jar1, Jam jar2, Jam jar3) {
        this.jar1 = jar1;
        this.jar2 = jar2;
        this.jar3 = jar3;
        selected = null;
    }

    /**
     * Metode que imprimeix els pots amb la seva informació
     * @see Jam.java
     */
    public void print() {
        System.out.print("1: ");
        jar1.print();
        System.out.print("2: ");
        jar2.print();
        System.out.print("3: ");
        jar3.print();
    }

    /**
     * Metode per seleccionar un pot de la despensa
     * @param jarNumber el pot que estem agafant
     */
    public void select(int jarNumber) {
        if (jarNumber == 1) {
            selected = jar1;
        } else if (jarNumber == 2) {
            selected = jar2;
        } else {
            selected = jar3;
        }
    }

    /**
     * Metode per omplir els pots amb mermelada
     * @see Jam.java
     * @param oz variable amb la quantitat de mermelada
     */
    public void spread(int oz) {
        selected.spread(oz);
    }
}
