package konsepoop;

public class m_methodE {
    public static void main(String[] args) {
        int[] myArray = {1,3,5,7,9,11};
        cetarArray(myArray);

    }
    private static void cetarArray(int[] array){
        for (int i = 0;i < array.length; i++){
            System.out.println(String.valueOf(array[i]) +"");
        }
        System.out.println();
    }
}
