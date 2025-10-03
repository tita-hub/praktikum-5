class Orang {
    void perkenalan() {
        System.out.println("Saya adalah seorang manusia.");
    }
}

class Dosen extends Orang {
    @Override
    void perkenalan() {
        System.out.println("Saya Dosen, siap mengajar mahasiswa.");
    }
}

public class DosenOverriding {
    public static void main(String[] args) {
        Orang o1 = new Orang();
        Orang o2 = new Dosen();

        o1.perkenalan(); 
        o2.perkenalan(); 
    }
}
