package konsepoop;

public class q_methodG {
    public static void main(String[] args) {
        o_orang dosen = getOrang("depandi" ,29 );
        cetakOrang(dosen);
    }
    private static void cetakOrang(o_orang orang){
        System.out.println("nama = " + orang.nama);
        System.out.println("umur + " + orang.umur + "tahun");

    }
    private static o_orang getOrang(String nama,int umur){
        o_orang orang = new o_orang(nama,umur);
        return orang;
    }
}
