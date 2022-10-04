import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Warewolf {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String nama ;
        int pilih = 0; 
        String peran = "";
        
        do {
            System.out.println("Masukkan Nama anda : ");
            nama = br.readLine();
            //boolean cek_kata = nama.isEmpty();
            if (nama.isEmpty()==true){
                System.out.println("Harus diiisi !");
            }
        } while(nama.isEmpty()==true);
        
         
        do {
            try{
            System.out.println("Pilih Peran anda : ");
            System.out.println("1. Penyihir ");
            System.out.println("2. Guard ");
            System.out.println("3. Warewolf ");
            System.out.println("Masukkan Peran anda : ");
            pilih = Integer.parseInt(br.readLine());
            
            switch (pilih){
                case 1:
                    peran = "Penyihir";
                    break;
                case 2:
                    peran = "Guard";
                    break;
                case 3:
                    peran = "Warewolf";
                    break;
                default :
                    System.out.println("Harus sesuai dengan pilihan !!!!");
            }
        }catch (Exception e){
            System.out.println("Harus diisi dengan angka !!!");
        }
        }while(pilih < 1 ||pilih > 3); 
        
    System.out.println("--------------------------");
    System.out.println("Welcome "+nama+" anda berperan sebagai "+peran);
      
    
    }
}
