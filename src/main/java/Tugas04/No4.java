package Tugas04;
public class No4 {
    public static void main(String[] args) {
        int F[] = {25,7,9,13,3};
        System.out.println("Shell Short");
        System.out.println("Muh.Faishal Rizal");
        System.out.println("Data sebelum diurutkan");
        hasil(F); 
        shellshort(F);
        System.out.println();
        System.out.println("Data setelah diurutkan");
        hasil(F);
    }
    public static void shellshort(int[] F) {
        int n = F.length;
        int C = 0;
        int M = 0;
        int jarak, i, k, kondisi;
        boolean sudah = true;
        int temp;
        jarak = n;
        
        while (jarak >=1){
            jarak = jarak / 2;
            sudah = true;
            while(sudah){
                sudah = false;
                for (k = 0; k < n-jarak; k++) {
                    i = k + jarak;
                    C++;
                    if (F[k]>F[i]){
                        temp = F[k];
                        F[k] = F[i];
                        F[i] = temp;
                        sudah = true;
                    }
                }
            }
        }
    } 
    public static void hasil(int[]data){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
    }
}
