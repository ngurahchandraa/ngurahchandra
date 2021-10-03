package soal1;

public class Main {
    public static void main (String[] args){

        Barang brg001 = new Barang("BRG-001" , "Tas Gucci");
        brg001.setHarga(1200);
        Barang brg002 = new Barang("BRG-002" , "Printer Epson L355");
        brg002.setHarga(200);
        Barang brg003 = new Barang("BRG-003" , "Koper" , 150);
        brg003.setNama("Koper");
        Barang brg004 = new Barang("BRG-004" , "Helm" , 20);

        System.out.println(brg001.getIdProduk() + " " + brg001.getNama() + " " + brg001.getHarga());
        System.out.println(brg002.getIdProduk() + " " + brg002.getNama() + " " + brg002.getHarga());

        System.out.println(brg003.getIdProduk() + " " + brg003.getNama() + " " + brg003.getHarga());
        System.out.println(brg004.getIdProduk() + " " + brg004.getNama() + " " + brg004.getHarga());

        System.out.println("total harga dari BRG-001, BRG-003, BRG-004 : " + (brg001.getHarga() + (brg003.getHarga() + (brg004.getHarga()))));

    }
}

