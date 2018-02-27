import java.util.Scanner;

public class TugasAlgoritma {

    public static void main(String[] args) {
       
        Scanner Ketik = new Scanner(System.in);
        
        Barang [] brg = new Barang [1];
        for(int a = 0; a < brg.length; a++){
            
            System.out.println("Masukan Data Barang " +(a+1));
            System.out.print("Tipe    : ");
            String Tipe = Ketik.next();
            System.out.print("Warna   : ");
            String Warna = Ketik.next();
            System.out.print("Bahan   : ");
            String Bahan = Ketik.next();
            System.out.print("Ukuran  : ");
            double Ukuran = Ketik.nextDouble();
           
            Barang barang = new Barang ();
            barang.setTipe(Tipe);
            barang.setWarna(Warna);
            barang.setBahan(Bahan);
            barang.setUkuran(Ukuran);
            brg[a] = barang;
        }
        for (int a = 0; a < brg.length; a++){
            
            System.out.println("Tampilan Barang "+(a+1));
            System.out.println("Tipe   : "+brg[a].getTipe());
            System.out.println("Warna  : "+brg[a].getWarna());
            System.out.println("Bahan  : "+brg[a].getBahan());
            System.out.println("Ukuran  : "+brg[a].getUkuran() + " " + "meter");
        }
    }
    
}

class Barang {
    private String Tipe;
    private String Warna;
    private String Bahan;
    private Double Ukuran;

    public Barang() {
    }

    public String getTipe() {
        return Tipe;
    }

    public void setTipe(String Tipe) {
        this.Tipe = Tipe;
    }

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String Warna) {
        this.Warna = Warna;
    }
    public String getBahan() {
        return Bahan;
    }

    public void setBahan(String Bahan) {
        this.Bahan = Bahan;
    }
    public Double getUkuran() {
        return Ukuran;
    }

    public void setUkuran(Double Ukuran) {
        this.Ukuran = Ukuran;
    }
}

   