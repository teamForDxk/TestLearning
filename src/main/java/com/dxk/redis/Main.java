package com.dxk.redis;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class Main {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		 // 连接本地的 Redis 服务
		Jedis jedis = new Jedis("r-2zeb87da48653fe4.redis.rds.aliyuncs.com");
		System.out.println("连接本地redis服务成功！");
		 // 查看服务是否运行
		System.out.println("服务正在运行：" + jedis.ping());
	}
	@Test
	public void getValue() throws Exception{
		/*@SuppressWarnings("resource")
		Jedis jedis = new Jedis("127.0.0.1");
		System.out.println("连接成功！");
		String ping = jedis.ping();
		System.out.println(ping);
		System.out.println(jedis.get("test"));*/
		
		@SuppressWarnings("resource")
		Jedis jedis = new Jedis("47.94.221.120");
		System.out.println("连接成功！");
		String ping = jedis.ping();
		System.out.println(ping);
		System.out.println(jedis.get("name"));
		
	}

}
