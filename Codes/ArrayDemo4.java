class calc {

    public int add(int num[]){
        int result = 0;
        for( int n : num){
            result = result+n;
        }
        return result;
    }
}

public class ArrayDemo4 {
public static void main(String[] args) {

    calc obj = new calc();
    int result = obj.add(new int[] {5,4,3,2}); //anonymous array (only use one time at a code)
    System.out.println(result);
}
}
