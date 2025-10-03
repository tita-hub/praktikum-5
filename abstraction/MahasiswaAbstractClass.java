abstract class Mahasiswa {
    protected String nama;

    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    public abstract void belajar();
}

class MahasiswaS1 extends Mahasiswa {
    public MahasiswaS1(String nama) {
        super(nama);
    }

    @Override
    public void belajar() {
        System.out.println(nama + " belajar mata kuliah S1.");
    }
}

public class MahasiswaAbstractClass {
    public static void main(String[] args) {
        Mahasiswa mhs = new MahasiswaS1("Tita");
        mhs.belajar();
    }
}
