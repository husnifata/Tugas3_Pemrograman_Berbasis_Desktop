import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Menu menu = new Menu();
        Pesanan pesanan = new Pesanan();

        int pilih;

        do {

            System.out.println("\n=== RESTORAN ===");
            System.out.println("1. Tambah Menu");
            System.out.println("2. Tampilkan Menu");
            System.out.println("3. Pesan");
            System.out.println("4. Hitung Total");
            System.out.println("5. Simpan Struk");
            System.out.println("6. Keluar");

            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {

                case 1:

                    System.out.println(
                            "1. Makanan");
                    System.out.println(
                            "2. Minuman");
                    System.out.println(
                            "3. Diskon");

                    int jenis =
                            input.nextInt();
                    input.nextLine();

                    System.out.print(
                            "Nama: ");
                    String nama =
                            input.nextLine();

                    if (jenis == 1) {

                        System.out.print(
                                "Harga: ");
                        double harga =
                                input.nextDouble();
                        input.nextLine();

                        System.out.print(
                                "Jenis Makanan: ");
                        String jm =
                                input.nextLine();

                        menu.tambahMenu(
                                new Makanan(
                                        nama,
                                        harga,
                                        jm));
                    }

                    else if (jenis == 2) {

                        System.out.print(
                                "Harga: ");
                        double harga =
                                input.nextDouble();
                        input.nextLine();

                        System.out.print(
                                "Jenis Minuman: ");
                        String jmin =
                                input.nextLine();

                        menu.tambahMenu(
                                new Minuman(
                                        nama,
                                        harga,
                                        jmin));
                    }

                    else if (jenis == 3) {

                        System.out.print(
                                "Diskon (%): ");
                        double diskon =
                                input.nextDouble();

                        menu.tambahMenu(
                                new Diskon(
                                        nama,
                                        diskon));
                    }

                    break;

                case 2:
                    menu.tampilkanMenu();
                    break;

                case 3:

                    menu.tampilkanMenu();

                    try {

                        System.out.print(
                                "Pilih nomor menu: ");

                        int nomor =
                                input.nextInt();

                        MenuItem item =
                                menu.getItem(
                                        nomor - 1);

                        pesanan.tambahPesanan(
                                item);

                        System.out.println(
                                "Pesanan berhasil ditambahkan");

                    } catch (Exception e) {

                        System.out.println(
                                e.getMessage());
                    }

                    break;

                case 4:

                    System.out.println(
                            "Total = Rp"
                            + pesanan.hitungTotal());

                    break;

                case 5:

                    try {

                        FileManager.simpanStruk(
                                pesanan);

                        FileManager.simpanMenu(
                                menu);

                        System.out.println(
                                "Data berhasil disimpan");

                    } catch (Exception e) {

                        System.out.println(
                                e.getMessage());
                    }

                    break;

                case 6:

                    System.out.println(
                            "Terima kasih");

                    break;

                default:

                    System.out.println(
                            "Pilihan tidak tersedia");
            }

        } while (pilih != 6);
    }
}