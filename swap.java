public class swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int temp;

        System.out.println("Before swapping a = "+a+" b = "+b);

        //swapping
        temp = a;
        a=b;
        b=temp;

        System.out.println("After swapping a = "+a+" b = "+b);

    }
}
