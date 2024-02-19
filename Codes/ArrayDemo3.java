public class ArrayDemo3 {

    public static void main(String[] args) {
        
        //2d array
        // int num[][] = new int[3][2];
        // num[0][0] = 5 ;
        // num[0][1] = 3 ;
        // num[1][0] = 6 ;
        // num[1][1] = 1 ;
        // num[2][0] = 7 ;
        // num[2][1] = 9 ;

        //jagged array
        // int num[][] = new int[3][];
        // num[0] = new int[4];
        // num[1] = new int[2];
        // num[2] = new int[3];

        int num [][] = { {5,3,10,15},{6,1},{7,9,12}}; //jagged array

        // for(int i=0; i<=2; i++){

        //     for(int j=0; j<num[i].length; j++){
        //         System.out.print(num[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // enhanced for loop for 2d array

        for( int i[] : num){

            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
}
