package konsepoop;

public class g_teststatic {
    //static method
    static void myStaticMethod(){
        System.out.println("static methods can be called without creating objects");

    }
    //public method
    public void myPublicMethod(){
        System.out.println("public methods must be called by creating objects");
    }
    ///main method
    public static void main(String[] args) {
        myStaticMethod();//call the static method
        //myPublicmethod(); this would output an error

        g_teststatic myObj = new g_teststatic();//create an onject of my class
        myObj.myPublicMethod();//call the public method
    }
}
