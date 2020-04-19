package fungsi_print;
import java.util.*;
public class Fungsi_Print {

    public static String tugas, nama;
    
    public static void main(String[] args) {
        //inisialisasi input
        int n = 3, i = 1;
        do{
            Scanner sc = new Scanner(System.in);
            cetak("Tugas ke-"+i+" : ");
            tugas = sc.nextLine();
            if(tugas.equalsIgnoreCase("selesai")){
                cetak("Lanjut Gan!\n");
                i++;
            }
            else {
                cetak("Yo tetep Lanjut Gan!\n");
                i++;  
            }
        }while (i<=n);
        cetak("Praktikum DKP Menunggu cok!!!");
    }
    
    static void cetak(String nama){
        System.out.print(nama);
    }
    
    
}
