package konsepoop;

public class n_testorang {
    public static void main(String[] args) {
        n_orang badu=new n_orang();
        badu.nama="badu";
        badu.umur=12;
        System.out.println("nama : " + badu.nama);
        System.out.println("umur : " + badu.umur + "tahun");
        badu.tertawa();
    }
}
