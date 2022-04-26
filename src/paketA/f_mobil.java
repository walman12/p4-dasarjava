package paketA;

public class f_mobil {
    private String nama;
    private String nobm;
    public int jmlroda;
    public String bahanbakar;
    public boolean fullAC;

    public f_mobil(String nama, String nobm){
        this.nama = nama;
        this.nobm = nobm;
        this.jmlroda = 4;
        this.bahanbakar = "bensin";
        this.fullAC = true;

    }
    public String getinfo(){
        String info = "mobil : " + nama +
                "\nNomor Bm : " + nobm +
                "\njumlah roda : " + jmlroda +
                "\njenis bahan bakar : " + bahanbakar +
                "\nFull ac : " + fullAC;
        return info;
    }
}
