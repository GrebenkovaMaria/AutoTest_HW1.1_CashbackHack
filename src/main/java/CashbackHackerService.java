public class CashbackHackerService {
    private final int boundary = 1000;
    public int remain(int amount) {
        if (amount < boundary) {
            return boundary - amount;
        }
        return 0;
    }
}

