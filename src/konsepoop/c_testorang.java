package konsepoop;

public class c_testorang {
    public static void main(String[] args) {
        c_orang dido=new c_orang();
        dido.nama = "dido";
        dido.umur =4;
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
