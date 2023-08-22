public class fibonacci {

    public static void main(String[] args) {
        // 1 1
        int first = 0;
        int last = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println(last);
            int temp = last;
            last = first + last;
            first = temp;
        }
    }
}
