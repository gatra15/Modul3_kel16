package modul3_kelompok16;
import java.util.*;

public class Sistem_ATM_Sederhana {
    
    //deklarasi varibel secara public
    public static Scanner sc = new Scanner(System.in);
    public static double uang, saldo = 50000;
    public static int setor, bank;
    public static String transaksi, rekening, struk;
    
    public static void main(String[] args) {
        boolean benar = true;

        //Fungsi jalannya ATM
        cetakln("Selamat datang!");
        do {
            cetakln("Silahkan masukkan pin anda : ");
            int pin = sc.nextInt();

        //kondisi
            if (pin == 2112053 || pin == 2112008){
                pilihan();
            }
            else {
                cetakln("Pin Salah!");
                benar = false;
            }
        }while(benar == false);
        
        do {
        cetakln("\nApakah anda ingin melakukan transaksi lain?[Ya/Tidak]");
        transaksi = sc.next();
        
            if (transaksi.equalsIgnoreCase("ya")){
                pilihan();
            }
            else if(transaksi.equalsIgnoreCase("tidak")){
                cetak_struk();
            }
            else {
                cetakln("[Maaf masukkan salah]");
            }
        }while(transaksi.equalsIgnoreCase("ya"));
    }
    
    //fungsi
    static void pilihan(){
        cetakln("\n1. Setor Tunai\n2. Tarik Tunai");
        cetakln("[Masukkan pilihan Anda]");
        int pilih = sc.nextInt();
            switch (pilih){
                case 1 :
                    cetakln("\n[Masukkan uang anda]");
                    uang = sc.nextDouble();
                    cetakln("Uang yang anda Masukkan adalah = "+uang);
                    transfer();
                break;
                case 2 :
                    cetakln("Masukkan nominal : ");
                    uang = sc.nextDouble();
                //kodisi
                    if (uang <= saldo){
                        saldo = saldo - uang;
                        cetakln("[Ambil uang anda]");
                    }
                    else{
                        cetakln("Saldo anda tidak mencukupi untuk tarik tunai");
                    }
                break;
                default :
                cetakln("[Masukkan anda salah!]");
            }
        
    }
    
    static void transfer(){
        cetakln("\nTransfer ke mana uang anda : ");
        cetakln("1. Rekening sendiri\n2. Rekening lain");
        cetakln("[Masukkan pilihan Anda]");
        setor = sc.nextInt();
        if (setor == 1){
            saldo = saldo + uang;
        }
        else if (setor == 2){
            cetakln("\nPilih Bank : ");
            cetakln("1. BRI\t4. BTN");
            cetakln("2. BCA\t5. Bank Jateng");
            cetakln("3. BNI");
            cetakln("[Masukkan pilhan]");
            bank = sc.nextInt();
            switch (bank) {
                case 1 : 
                    cetakln("\nMasukkan no rekening : ");
                    rekening = sc.next();
                    cetakln("Transaksi Berhasil\nRincian transaksi : ");
                    cetakln("Bank\t: BRI\nNo Rek.\t: "+rekening);
                    cetakln("Jumlah yang ditransfer\t : "+uang);
                break;
                case 2 : 
                    cetakln("\nMasukkan no rekening : ");
                    rekening = sc.next();
                    cetakln("Transaksi Berhasil\nRincian transaksi : ");
                    cetakln("Bank\t: BCA\nNo Rek.\t: "+rekening);
                    cetakln("Jumlah yang ditransfer\t : "+uang);
                break;
                case 3 : 
                    cetakln("\nMasukkan no rekening : ");
                    rekening = sc.next();
                    cetakln("Transaksi Berhasil\nRincian transaksi : ");
                    cetakln("Bank\t: BNI\nNo Rek.\t: "+rekening);
                    cetakln("Jumlah yang ditransfer\t : "+uang);
                break;
                case 4 : 
                    cetakln("\nMasukkan no rekening : ");
                    rekening = sc.next();
                    cetakln("Transaksi Berhasil\nRincian transaksi : ");
                    cetakln("Bank\t: BTN\nNo Rek.\t: "+rekening);
                    cetakln("Jumlah yang ditransfer\t : "+uang);
                break;
                case 5 : 
                    cetakln("\nMasukkan no rekening : ");
                    rekening = sc.next();
                    cetakln("Transaksi Berhasil\nRincian transaksi : ");
                    cetakln("Bank\t: Bank Jateng\nNo Rek.\t: "+rekening);
                    cetakln("Jumlah yang ditransfer\t : "+uang);
                break;
                default :
                    cetakln("[Masukkan Anda salah!]");
            }
            
        }
    }
    static void cetak(String nama){
        System.out.print(nama);
    }
    
    static void cetakln(String nama){
        System.out.println(nama);
    }
    
    static void cetak_struk(){
        cetakln("\nApakan Anda ingin mencetak struk?[Ya/Tidak]");
        struk = sc.next();
        if(struk.equalsIgnoreCase("ya")){
            cetakln("\nSisa saldo Anda = "+saldo);
            cetakln("\nTerima kasih telah menggunakan layanan kami.\n");
            Identitas();
        }
        else if (struk.equalsIgnoreCase("tidak")){
            cetakln("\nTerima kasih telah menggunakan layanan kami.\n");
            Identitas();
        }
        else {
            cetakln("[Masukkan Anda salah!]");
        }
    }
    
    static void Identitas(){
        cetakln("===\t  Modul3\t===\n===\tKelompok 16\t===");
        cetakln("Nama\t: Gagah Pristiyaputra - 21120117130053"
                + "\nNama\t: Galih Saputra - 21120119120008");
        cetakln("==* Sistem ATM Sederhana *==");
    }
    
}
