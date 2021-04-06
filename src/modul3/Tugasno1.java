package modul3;
import java.util.Scanner;
public class Tugasno1 {
    public static void main(String[] args) {
        String cari;
        boolean ketemu = false;
        String Data[] = {"Galileo","Archimedes","Alkhawarizmi","Aljabar","Haris","Tesla"};
        
        System.out.print("Data = ");
        for (int H = 0; H < Data.length; H++) {
            System.out.print(Data[H]+ " ");  
        }
        
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("cari nama = ");
        cari = scan.nextLine();
        System.out.println();  
        for (int H = 0; H < Data.length; H++) {
            if (cari.equalsIgnoreCase(Data[H])){ 
                System.out.println("Data "+ cari+" berada di indeks ke= "+H);
                ketemu = true;
                break; 
            }
        }if (ketemu ==false){
            System.out.println("Data tidak ditersedia");
        }
    }
}
