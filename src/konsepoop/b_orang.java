package konsepoop;

public class b_orang {
    String nama;
    int umur;
    String warnarambut;
    String warnakulit;
    int tinggibadan;
    int beratbadan;

    public b_orang() {
    }
    public b_orang(String nama){
        this.nama=nama;
    }
    public void menangis(){
        System.out.println("hu....hu.....");
    }
    public void tertawa(){
        System.out.println("ha......ha....");
    }

    public static void main(String[] args) {
        b_orang dido = new b_orang();
        dido.nama = "dido";
        dido.umur = 4;
        System.out.println("nama : " + dido.nama);
        System.out.println("umur : " + dido.umur + "tahun");
        dido.menangis();
        System.out.println();

        b_orang dodo = new b_orang("dodo");
        System.out.println("nama = " + dodo.nama);
        System.out.println("umur = " + dodo.umur + "tahun");
        dodo.tertawa();

    }
}
