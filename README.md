# BondRedisClient
this is redis client by java
# pool
1.创建PoolingHttpClientConnectionManager实例
2.给manager设置参数
3.给manager设置重试策略
4.给manager设置连接管理策略
5.开启监控线程,及时关闭被服务器单向断开的连接
6.构建HttpClient实例
7.创建HttpPost/HttpGet实例,并设置参数
8.获取响应,做适当的处理
9.将用完的连接放回连接池