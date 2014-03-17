/**
 *
 * @author Mandeep
 */
public class Euler3 {

    public static void main(String[] args) {
        int smallest_perfectly_divisible_number = -1;
        int count = 0;
        for (int x = 1;; x++) {
            for (int y = 1; y <= 20; y++) {
                if (x % y != 0) {
                    break;
                }
                count++;
            }
            if (count == 20) {
                smallest_perfectly_divisible_number = x;
                break;
            } else {
                count = 0;
            }
        }
        System.out.println(smallest_perfectly_divisible_number);
    }
}
