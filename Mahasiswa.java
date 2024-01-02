/**
 * @author 
 * Nama:ADAM
 * Nim :22166002
 * Prodi:sistem informasi
 * Mahasiswa UAS
 */
package mahasiswa;

//super untuk merepresentasikan Mahasiswa
public class Mahasiswa {
    private String nama;
    private int umur;

    // Konstruktor untuk nama dan umur Mahasiswa
    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Metode untuk mendapatkan nama Mahasiswa
    public String getNama() {
        return nama;
    }

    // Metode untuk mengubah nama Mahasiswa
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Metode untuk mendapatkan umur Mahasiswa
    public int getUmur() {
        return umur;
    }

    // Metode untuk mengubah umur Mahasiswa
    public void setUmur(int umur) {
        this.umur = umur;
    }

    // Metode umum 
    public void displayInfo() {
        System.out.println("Saya " + getNama() + " umur " + getUmur());
    }

    // subclass turunan MahasiswaBaru yang mewarisi Mahasiswa
    class MahasiswaBaru extends Mahasiswa {
        private int nim;

        // Konstruktor untuk nama, umur, dan nim MahasiswaBaru
        public MahasiswaBaru(String nama, int umur, int nim) {
            super(nama, umur);
            this.nim = nim;
        }

        // Metode untuk mendapatkan nim MahasiswaBaru
        public int getNim() {
            return nim;
        }

        // Metode untuk mengubah nim MahasiswaBaru
        public void setNim(int nim) {
            this.nim = nim;
        }

        // Override metode displayInfo untuk menampilkan informasi khusus MahasiswaBaru
        @Override
        public void displayInfo() {
            System.out.println("Saya " + getNama() + " umur " + getUmur() + " dengan nim " + nim);
        }
    }
    // subclass turunan MahasiswaLama yang mewarisi Mahasiswa
    class MahasiswaLama extends Mahasiswa {
        private int angkatan;

        // Konstruktor untuk nama, umur, dan angkatan MahasiswaLama
        public MahasiswaLama(String nama, int umur, int angkatan) {
            super(nama, umur);
            this.angkatan = angkatan;
        }
        // Metode untuk mendapatkan angkatan MahasiswaLama
        public int getAngkatan() {
            return angkatan;
        }
        // Metode untuk mengubah angkatan MahasiswaLama
        public void setAngkatan(int angkatan) {
            this.angkatan = angkatan;
        }
        // Override metode displayInfo untuk menampilkan informasi khusus MahasiswaLama
        @Override
        public void displayInfo() {
            System.out.println("Saya " + getNama() + " umur " + getUmur() + " saya angkatan " + angkatan);
        }
    }
    // Metode untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa("Adam", 19);
        // Membuat objek MahasiswaBaru dan MahasiswaLama menggunakan objek Mahasiswa
        Mahasiswa.MahasiswaBaru mahasiswaBaru = mahasiswa.new MahasiswaBaru("Adam", 19, 22166002);
        mahasiswaBaru.displayInfo();
        Mahasiswa.MahasiswaLama mahasiswaLama = mahasiswa.new MahasiswaLama("Jamaludin", 23, 2020);
        mahasiswaLama.displayInfo();
    }
}
