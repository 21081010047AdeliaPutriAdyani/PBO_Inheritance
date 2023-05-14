package inheritance;

/**
 *
 * @author ADELIA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koleksi buku1 = new Buku("Java Programming", "Budi Raharjo","Pustaka Jaya", 2021);
        Koleksi majalah1 = new Majalah("National Geographic", "National Geographic Society", "John Doe", 2021);
        Koleksi skripsi1 = new Skripsi("21081010047", "Adelia Putri Adyani", "Implementasi Mesin Learning Menggunakan Algoritma", "UPN 'VETERAN' JAWA TIMUR", 2024);
        
        System.out.println(buku1.toString());
        System.out.println(majalah1.toString());
        System.out.println(skripsi1.toString());
    }
    
}
