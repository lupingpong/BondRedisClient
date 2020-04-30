package redis.client.bond.pool;

/**
 * @author lubin@52iuh.com
 * @version 1.0
 * @date 2020/4/22 15:30
 */
public class PoolStats {
    private final int leased;
    private final int pending;
    private final int available;

    public PoolStats(int leased, int pending, int available) {
        this.leased = leased;
        this.pending = pending;
        this.available = available;
    }

    public int getLeased() {
        return leased;
    }

    public int getPending() {
        return pending;
    }

    public int getAvailable() {
        return available;
    }
}
