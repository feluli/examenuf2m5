package examenuf2_m5;

/**
 * Classe Jam amb els metodes, constructor i getters.
 * @author Felipe Lucero Lira
 */
public class Jam {
    private String contents;
    private String date;
    private int capacity;
    private static int numTotalJars, noJam = 0;
    /**
     * Constructor de la clase Jam
     * @param contents contingut del pot
     * @param date data 
     * @param size mida del pot
     * @param numTotalJars cada cop que es crea una mermelada nova, es suma 1 al contador de mermelades.
     */

    Jam(String contents, String date, int size) {
        this.contents = contents;
        this.date = date;
        capacity = size;
        numTotalJars++;
    }

    /**
     * La capacitat la torna a posar a 0
     * @return la capacitat
     */
    public boolean empty() {
        return (capacity == 0);
    }

    /**
     * Imprimeix la informació de la mermelada
     */
    public void print() {
        System.out.println(contents + " " + date + " " + capacity + " fl. oz.");
        System.out.println("El número total de Jars creats des de l'inici dels temps són: " + Jam.getNumTotalJars());
        System.out.println("El número de Jars que s'han quedat sense melmelada des de l'inici dels temps: " + Jam.getNoJam());
    }

    /**
     * Amb un parametre entrat per teclat ens diu si hi ha mermelada o no en el pot.
     * @param fluidOz la quantitat de mermelada
     */
    public void spread(int fluidOz) {
        if (!empty()) {
            if (fluidOz < capacity) {
                System.out.println("Spreading " + fluidOz + " fluid ounces of " + contents);
                capacity = capacity - fluidOz;
            } else {
                System.out.println("Spreading " + capacity + " fluid ounces of " + contents);
                capacity = 0;
                noJam++;
            }
        } else {
            System.out.println("No jam in the Jar!");
        }
    }

    /**
     * Getter del nombre total de pots
     * @return numTotalJars el nombre total de pots
     */
    public static int getNumTotalJars() {
        return numTotalJars;
    }

    /**
     * Getter per comprobar si hi ha mermelada
     * @return si hi ha o no mermelada
     */
    public static int getNoJam() {
        return noJam;
    }
}
