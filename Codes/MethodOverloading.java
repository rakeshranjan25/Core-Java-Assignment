class calc{
    public int add( int n1, int n2){
        int result = n1+n2;
        return result;
    }

    public int add( int n1, int n2, int n3){
        int result = n1+n2+n3;
        return result;
    }

    public double add( double n1, double n2){
        double result = n1+n2;
        return result;
    }

    public void show (int n){
        System.out.println("int " + n);
    }

    public void show (double n){
        System.out.println("double " + n);
    }
}


public class MethodOverloading {
    
    public static void main(String[] args) {
        calc obj = new calc();
        int result1 = obj.add(4,3);
        System.out.println(result1);

        int result2 = obj.add(4,3,2);
        System.out.println(result2);

        double result3 = obj.add(4.5,3.2);
        System.out.println(result3);

        obj.show(5);

        obj.show(11.2);
    }
}
