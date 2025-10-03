interface Dosen {
    void mengajar();
}

class DosenTetap implements Dosen {
    private String nama;

    public DosenTetap(String nama) {
        this.nama = nama;
    }

    @Override
    public void mengajar() {
        System.out.println("Dosen tetap " + nama + " sedang mengajar.");
    }
}

public class DosenInterface {
    public static void main(String[] args) {
        Dosen dosen = new DosenTetap("Pak Fachrul Pralienka Bani Muhamad, M.Kom.");
        dosen.mengajar();
    }
}
