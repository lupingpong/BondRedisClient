package redis.client.bond.pool;


import redis.client.bond.Connection;

/**
 * @author lubin@52iuh.com
 * @version 1.0
 * @date 2020/4/22 14:51
 */
public class PoolEntry {
    Connection connection;
    private volatile  Integer state;
}
