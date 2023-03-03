public class DoCount {
    public static void main(String[] args) {
        int startingNumber = 0;
countUp(startingNumber);
    }
    public static void countUp (int startingNumber) {

        do {
            System.out.println(startingNumber);
            startingNumber ++;
        } while (startingNumber <= 100);
    }
}
