package com.dxk.redis;


import java.util.List;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class Main {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		 // 连接本地的 Redis 服务
		Jedis jedis = new Jedis("127.0.0.1");
		System.out.println("连接本地redis服务成功！");
		 // 查看服务是否运行
		System.out.println(jedis.ping());
		//-----如果输出为： pong则证明服务已运行
		
		jedis.set("test", "test");//String--
		System.out.println(jedis.get("test"));
		
		jedis.lpush("list1", "dxk");//List--
		jedis.lpush("list1", "yyx");
		jedis.lpush("list1", "lzw");
		List<String> list = jedis.lrange("list1",0,2);
		for (String string : list) {
			System.out.println(string);
		}
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
