package Tugas04;
public class No1 {
    public static void main(String[] args) {
        int[] F = {25,7,9,13,3};
        System.out.println("Insertion Short");
        System.out.println("Muh.Faishal Rizal");
        System.out.println("Data Sebelum diurutkan");
        for (int i = 0; i < F.length; i++) {
            System.out.print(F[i]+" "); 
            
        }
        for (int i = 1; i < F.length; i++) {
            int key = F[i]; 
            int j = i-1; 
            while((j>=0)&&(F[j]>key)){
                F[j+1] = F[j];
                j--;
            }
            F[j+1]=key;       
        }
        System.out.println();
        System.out.println("Data setelah diurutkan");
        for (int i = 0; i < F.length; i++) {
            System.out.print(F[i]+" ");     
        }
    }
}
