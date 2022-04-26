package konsepoop;

public class o_orang {
    String nama;
    int umur;
    String warnarambut;
    String warnakulit;
    int tinggibadan;
    int beratbadan;

    public o_orang() {
    }
    public o_orang(String nama,int umur){
        this.nama=nama;
        this.umur=umur;

    }
    public o_orang(String nama,int umur, int tinggibadan,int beratbadan){
        this(nama, umur);
        this.tinggibadan=tinggibadan;
        this.beratbadan=beratbadan;

    }
    public void menangis() {
        System.out.println("hu.....hu......");
    }
    public void tertawa() {
        System.out.println("ha.....ha.....");

    }

}
