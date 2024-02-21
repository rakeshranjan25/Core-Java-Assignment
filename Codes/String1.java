public class String1 {
    
    public static void main(String[] args) {
        
        String brand = "Bhopal";
        System.out.println(brand);
        brand.concat("Indore");
        System.out.println(brand);

        System.out.println();

        StringBuilder brand1 = new StringBuilder("Bhopal");
        System.out.println(brand1);
        brand1.append("Inodre");
        System.out.println(brand1);
    }
}
