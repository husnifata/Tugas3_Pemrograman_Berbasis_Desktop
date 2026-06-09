import java.util.ArrayList;

public class Pesanan {
    private ArrayList<MenuItem> daftarPesanan;

    public Pesanan() {
        daftarPesanan = new ArrayList<>();
    }

    public void tambahPesanan(MenuItem item) {
        daftarPesanan.add(item);
    }

    public void tampilPesanan() {
        for (MenuItem item : daftarPesanan) {
            item.tampilMenu();
        }
    }

    public double hitungTotal() {
        double total = 0;
        double persenDiskon = 0;

        for (MenuItem item : daftarPesanan) {
            if (item instanceof Diskon) {
                persenDiskon = ((Diskon) item).getDiskon();
            } else {
                total += item.getHarga();
            }
        }

        total = total - (total * persenDiskon / 100);

        return total;
    }

    public ArrayList<MenuItem> getDaftarPesanan() {
        return daftarPesanan;
    }
}