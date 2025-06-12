package DSA.Bit_wise;

public class swap {

     public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4};

        int xor = 0;
        for (int num : arr) {
            xor ^= num;
        }

        int setBit = xor & -xor;

        int x = 0, y = 0;
        for (int num : arr) {
            if ((num & setBit) != 0) {
                x ^= num;
            } else {
                y ^= num;
            }
        }

        System.out.println("The two unique elements are: " + x + " and " + y);
    }
}
}