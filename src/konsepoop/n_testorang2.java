package konsepoop;

public class n_testorang2 {
    public static void main(String[] args) {
        n_orang badu = new n_orang();//construktor tanpa parameter
        badu.nama = "badu";
        badu.umur = 12;
        System.out.println("nama : " + badu.nama);
        System.out.println("umur : " + badu.umur + "tahun");
        badu.tertawa();

        System.out.println();

        n_orang dodo=new n_orang("dodo",10);//construktor dengan 2 parameter
        System.out.println("nama : " + badu.nama);
        System.out.println("umur : " + badu.umur + "tahun");
        badu.menangis();
    }
}
