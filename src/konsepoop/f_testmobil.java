package konsepoop;
import paketA.f_mobil;
public class f_testmobil {
    public static void main(String[] args) {
        f_mobil avanza = new f_mobil("innova","BM3210");
        avanza.jmlroda = 4;
        avanza.bahanbakar="solar";
        avanza.fullAC = true;
        System.out.println(avanza.getinfo());
    }
}
