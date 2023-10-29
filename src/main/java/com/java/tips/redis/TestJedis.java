package com.java.tips.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Controller
public class TestJedis {

	@Autowired
	JedisPool jedisPool;
	
	@RequestMapping(name = "jedis")
	@ResponseBody
	public String set() {
		Jedis jedis = jedisPool.getResource();

		jedis.set("james","v-01");
        String xxx = jedis.get("james");
        System.out.println(xxx);
        return xxx;
    }
}