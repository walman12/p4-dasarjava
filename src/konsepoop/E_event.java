package konsepoop;

public class E_event {
    public int tglkegiatan;
    public int blnkegiatan;
    protected int tahunkegiatan;
    protected int maxpeserta;
    protected int jmlpeserta;
    public String namaevent;
    final int biayapendaftaran=50000;
    String tempatEvent;

    public E_event(String nama,int m){
        namaevent=nama;
        maxpeserta=m;
    }
    void infoEvent(){
        System.out.println("nama event : " +namaevent );
        System.out.println("maksimal peserta : " + maxpeserta);
        System.out.println("biaya pendaftaran : " + biayapendaftaran);
    }
}