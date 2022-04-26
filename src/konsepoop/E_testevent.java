package konsepoop;

public class E_testevent {
    public static void main(String[] args) {
        E_event event = new E_event("yuk ngaji",200);
        event.tglkegiatan =10;
        event.blnkegiatan =11;
        event.tahunkegiatan=2018;
        event.infoEvent();
        System.out.println("==========================================");
        System.out.println("tanggal kegiatan : " +event.tglkegiatan + "/" + event.blnkegiatan + "/" + event.tahunkegiatan);
        event.jmlpeserta=100;
        System.out.println("jumlah peserta : " + event.jmlpeserta);
    }
}
