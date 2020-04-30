package redis.client.bond.config;

/**
 * @author lubin
 * @version 1.0
 * @date 2020/4/22 14:49
 */
public class BondRedisConfig {
    private final Integer soTimeout;
    private final boolean soReuseAddress;
    private final Integer soLinger;
    private final boolean soKeepAlive;
    private final String addrIp;
    private final Integer port;

    public BondRedisConfig(Integer soTimeout, boolean soReuseAddress, Integer soLinger, boolean soKeepAlive, String addrIp, Integer port) {
        this.soTimeout = soTimeout;
        this.soReuseAddress = soReuseAddress;
        this.soLinger = soLinger;
        this.soKeepAlive = soKeepAlive;
        this.addrIp = addrIp;
        this.port = port;
    }

    public String getAddrIp() {
        return addrIp;
    }

    public Integer getPort() {
        return port;
    }

    public Integer getSoTimeout() {
        return soTimeout;
    }

    public boolean isSoReuseAddress() {
        return soReuseAddress;
    }

    public Integer getSoLinger() {
        return soLinger;
    }

    public boolean isSoKeepAlive() {
        return soKeepAlive;
    }
}
