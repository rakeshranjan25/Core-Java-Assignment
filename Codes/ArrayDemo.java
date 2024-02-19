public class ArrayDemo { 
    public static void main(String[] args) {
        
        int num [] = {5,7,9,8};

        // for(int i=0; i<=3; i++){
        //     System.out.println( num[i] );
        // }

        //enhanced for loop for array
        for(int n : num){
            System.out.println(n);
        }
    }
    
}
