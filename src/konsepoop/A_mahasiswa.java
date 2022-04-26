package konsepoop;

public class A_mahasiswa {
    public int nrp;
    public String nama;
    public void info(){
        System.out.println("ini siswa rpl polbeng");

    }

    public static void main(String[] args) {
        A_mahasiswa it = new A_mahasiswa();
        it.nrp =5;
        it.nama ="andi";
        it.info();
    }

}
