package Tugas04;
import java.util.Scanner;
public class No7 {
    public static void main(String[] args) {
        int F[] = {25,7,9,13,3};
        System.out.println("Bubble Short");
        System.out.println("Data Sebelum diurutkan");
        hasil(F);
        System.out.println();
        bubbleshort(F);
        System.out.println("Data Setelah diurutkan");        
        hasil(F);
        System.out.println();
        System.out.println("Pencarian Menggunakan Binnary Search");
        pencarianBinary(F);
    }
    public static void bubbleshort(int[] F) {
        int i=1, j;
        int temp;
        int n = F.length;
        while (i < n) {
            j = n-1;
            while (j>=i){
                if (F[j-1]>F[j]){
                    temp = F[j];
                    F[j] = F [j-1];
                    F[j-1] = temp;
                }
                j = j - 1;
            }
            i = i + 1;
        }  
    }
    public static void hasil(int[] F) {
        for (int i = 0; i < F.length; i++) {
            System.out.print(F[i]+" ");
        }   
    }
    public static void pencarianBinary(int F []) {
        System.out.println();
        System.out.println("*******Cari Data*******");
        int caridata;
        Scanner pencarian = new Scanner(System.in);
        System.out.println("Masukan Angka : ");
        caridata = pencarian.nextInt();
        int batasbawah = F.length - 1;
        int batasatas = 0;
        boolean ketemu = false;
        int poin = 0;
        while ((batasatas <= batasbawah ) && (ketemu == false)){
        poin = (batasatas + batasbawah)/2;
        System.out.println("indeks pointer : "+poin);  
            if (F [poin]== caridata){
                ketemu = true;
                System.out.println("Data "+caridata+" telah ditemukan pada indeks ke "+poin);
            }
            else {
                if (caridata < F[poin]){
                    System.out.println("cari di kiri");
                    batasbawah = poin-1;   
                }
                else{
                    System.out.println("cari di kanan");
                    batasatas = poin+1;    
                }
            }
        }
        if (ketemu==true){
            System.out.println("data "+caridata+" ditemukan di indeks "+(poin+" di baris "+(poin+1)));
        }
        else{
            System.out.println("data "+caridata+" tidak ada ");
        }
    }
}

