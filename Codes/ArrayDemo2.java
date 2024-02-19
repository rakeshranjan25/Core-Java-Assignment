public class ArrayDemo2 {
    public static void main(String[] args) {

         int num [] = new int[4];
         num[0]=5;
         num[1]=7;
         num[2]=4;
         num[3]=8;

         for(int n : num){
            System.out.println(n);
        }
    }
}
