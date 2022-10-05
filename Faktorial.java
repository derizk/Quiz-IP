
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Faktorial
{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Masukkan angka yang akan di cek faktorialnya :)");
        int n = Integer.parseInt(br.readLine());
     
        int hasil = 1;
        System.out.println("------------------------------------------");
        for (int i = n ; i<=n && i>0 ; i--){
            
            hasil = hasil * i ;
            
        }
        
        System.out.println("Hasil dari faktorial "+n+" adalah : "+hasil);   
        
        
    }
}
