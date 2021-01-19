import java.util.Scanner;


public class Restoran {
public static int n1,makan,minum,diskon,TOTAL1,TOTAL,total,total_;
    

    public static void main(String[] args) {
   	
        String Nama;
        Scanner input = new Scanner(System.in);
        System.out.println("Mau pesen kak? (y/n) : Y ");
            System.out.println("Selamat Datang");
            System.out.println("Masukan Nama Anda : Kharis");
            System.out.println("Hi Kharis" );
            System.out.println("Mau pesan apa");
            System.out.println("1.Makanan");
            System.out.println("2.Minuman");
            System.out.println("3.Ga makasih kak");
            System.out.println("Pilihan Anda : 1");    
            System.out.println("Mau makan apa kak");                                 
            System.out.println("Boleh ka di liat dulu Menu Makanannya kak :");
            System.out.println("1.Nasi Goreng Pete");
            System.out.println("2.Indomie Telur");
            System.out.println("3.Roti Bakar Spesial");
            System.out.println("4.Terima Kasih");
            System.out.println("Pilihan Anda : 1 ");        
            System.out.print("Pilihan Anda Nasi Goreng");
            int price = 22000;
            System.out.println(" Dengan Harga IDR 22000");
            System.out.println("Mau berapa Banyak ? 1 ");
            int tota10 = 1;
            int priceN = tota10 * price;
            System.out.println("Total Harga " + priceN);
            makan = priceN;
            System.out.println("Bisa diliat kak menu minuman kami");
            System.out.println("1.Jus Jeruk");
            System.out.println("2.Teh Tarik");
            System.out.println("3.Air Mineral");
            System.out.println("4.udah terima kasih");
            System.out.println("Pilihan Anda : 4 ");     
            total = makan;
            System.out.println("Mau nambah pesanan kak ? (y/n) : n");                          
            System.out.println("Mau bayar aja kak ? : y");
            TOTAL = makan ;       
	    System.out.println("=============");
            System.out.println("Mau mencoba gopay? (y/n) : y ");
	    System.out.println("============");         
            System.out.println("selamat anda mendapatkan diskon 30%");
            System.out.println("total harga sebesar " + TOTAL);
            diskon =  (TOTAL * 30)/100;
            System.out.println("Anda mendapatkan diskon sebesar" + diskon);
            TOTAL1 = TOTAL - diskon;
            System.out.println("Anda membayar sebesar " + TOTAL1);
    }
}

   