package BinarySearch;

public class _374_Guess_Number_Higher_or_Lower extends GuessGame {
    public int guessNumber(int n) {
        int l = 1;
        int r = n;
        int mid = 0;

        while (l >= r) {
            mid = l + (r - l) / 2;

            if (guess(mid) == -1) {
                r = mid - 1;
            }
            if (guess(mid) == 1) {
                l = mid + 1;
            }
            if (guess(mid) == 0){
                break;
            }
        }

        return mid;
    }
}


class GuessGame {
    public int guess(int num) {

        return 1;
    }

}