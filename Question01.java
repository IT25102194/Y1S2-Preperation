public class Question01 {
    public static void main(String[] args) {
        int miles = 26;
        int yards = 385;
        double kiloMeters;
        
        kiloMeters = (miles + (yards/1760.0)) * 1.609;
        System.out.println("Distance in kilometers: " + kiloMeters);
    }
}
