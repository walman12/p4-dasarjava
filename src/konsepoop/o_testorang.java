package konsepoop;

public class o_testorang {
    public static void main(String[] args) {
        o_orang badu = new o_orang();//construktor tanpa parameter
        badu.nama = "badu";
        badu.umur = 12;
        System.out.println("nama : " + badu.nama);
        System.out.println("umur : " + badu.umur + "tahun");
        badu.tertawa();

        System.out.println();

        o_orang dodo=new o_orang("dodo",10);//construktor dengan 2 parameter
        System.out.println("nama : " + badu.nama);
        System.out.println("umur : " + badu.umur + "tahun");
        badu.menangis();

        System.out.println();

        o_orang jono =new o_orang("jono" , 12, 168, 76);//constructor dengan 4 parameter
        System.out.println("nama : " + jono.nama );
        System.out.println("umur : " + jono.umur + "tahun");
        System.out.println("tinggi badan : " + jono.tinggibadan + "cm");
        System.out.println("berat badan : " + jono.beratbadan + "cm");
        jono.tertawa();

    }
}
