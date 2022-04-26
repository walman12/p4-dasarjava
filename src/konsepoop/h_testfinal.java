package konsepoop;

public class h_testfinal {
    int x= 10;
    double pl = 3.14;

    public static void main(String[] args) {
        h_testfinal myObj= new h_testfinal();
        myObj.x = 50;//will generate an error: cannot assign a value to a final variabel
        myObj.pl = 25;//will generate an error: cannot assign a value to a final variabel
        System.out.println(myObj.x);
    }
}
