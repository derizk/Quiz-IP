import java.util.*;

public class BesarKecil{
    
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Masukkan jumlah angka yang diinginkan : ");
        int n = sc.nextInt();
        System.out.println("-----------------------------------------");
    
        int [] angka = new int [n];
        int besar = 0;
        int kecil = 0;
        
        for (int i = 1 ; i<=n ; i++ ){
            
            System.out.println("Masukkan angka ke-"+i);
            angka[i-1] = sc.nextInt();
            if (angka [i-1] > besar){
                besar = angka [i-1];
            }
        }
        
        kecil = besar ; 
        
        for (int i = 1 ; i<=n ; i++ ){
            
            if (angka [i-1] < kecil){
                kecil = angka [i-1];
            }
        }
        
        System.out.println("-----------------------------------------");
        System.out.println("Nilai terkecil = "+kecil);
        System.out.println("Nilai terbesar = "+besar);
        

    }
}
