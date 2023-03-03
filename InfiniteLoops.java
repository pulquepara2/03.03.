public class InfiniteLoops {
    public static void main(String[] args) {
        int i = 1;


        do {
            System.out.println(i+1);
            i= i+1;
        } while (i < 10);
    }
}
