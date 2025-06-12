package DSA.Bit_wise.searching;

import java.util.*;

public class square_root {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();

        int l = 0, h = n;
        int result = 0;

        while (l <= h) {
            int mid = (l + h) / 2;
            int sq = mid * mid;

            if (sq == n) {
                result = mid;
                break;
            } else if (sq > n) {
                h = mid - 1;
            } else {
                result = mid;
                l = mid + 1;
            }
        }

        System.out.println(result);
    }
}