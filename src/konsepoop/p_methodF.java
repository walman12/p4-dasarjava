package konsepoop;

public class p_methodF {
    public static void main(String[] args) {
        o_orang daru = new o_orang("daru nugroho " ,20);
        cetakOrang(daru);
    }
    private static void cetakOrang(o_orang orang){
        System.out.println("nama = " + orang.nama);
        System.out.println("umur = " +orang.umur + "");

    }
}
