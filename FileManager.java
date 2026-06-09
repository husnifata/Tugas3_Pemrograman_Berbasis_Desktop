import java.io.*;

public class FileManager {

    public static void simpanMenu(Menu menu)
            throws IOException {

        BufferedWriter bw =
                new BufferedWriter(
                        new FileWriter("menu.txt"));

        for (MenuItem item : menu.getDaftarMenu()) {

            if (item instanceof Makanan) {
                bw.write("Makanan,"
                        + item.getNama()
                        + ","
                        + item.getHarga());
            }

            else if (item instanceof Minuman) {
                bw.write("Minuman,"
                        + item.getNama()
                        + ","
                        + item.getHarga());
            }

            else if (item instanceof Diskon) {
                bw.write("Diskon,"
                        + item.getNama()
                        + ","
                        + ((Diskon) item).getDiskon());
            }

            bw.newLine();
        }

        bw.close();
    }

    public static void simpanStruk(Pesanan pesanan)
            throws IOException {

        BufferedWriter bw =
                new BufferedWriter(
                        new FileWriter("struk.txt"));

        for (MenuItem item :
                pesanan.getDaftarPesanan()) {

            bw.write(item.getNama());
            bw.newLine();
        }

        bw.write("TOTAL = "
                + pesanan.hitungTotal());

        bw.close();
    }
}