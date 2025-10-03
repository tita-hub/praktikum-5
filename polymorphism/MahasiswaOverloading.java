class Mahasiswa {

    void belajar() {
        System.out.println("Mahasiswa sedang belajar umum.");
    }

    void belajar(String mataKuliah) {
        System.out.println("Mahasiswa belajar mata kuliah: " + mataKuliah);
    }

    void belajar(String mataKuliah, int jam) {
        System.out.println("Mahasiswa belajar " + mataKuliah + " selama " + jam + " jam.");
    }
}

public class MahasiswaOverloading {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();

        mhs.belajar();
        mhs.belajar("Pemrograman Berorientasi Lanjut");
        mhs.belajar("Pemrograman Web Lanjut", 2);
    }
}
