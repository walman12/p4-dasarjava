public class d_mahasiswa {
    private String nama;
    private int nrp;
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public  int getNrp(){
        return nrp;
    }

    public void setNrp(int nrp) {
        this.nrp = nrp;
    }
    public d_mahasiswa(String nama,int nrp){
        this.nama=nama;
        this.nrp=nrp;
    }
    public void info(){
        System.out.println(nama + "," + nrp);
    }
    public void tostring (){
        System.out.println("data mahasiswa\n " + nama + "\n " + nrp);
    }

}
