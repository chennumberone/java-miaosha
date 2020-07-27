package com.chl.rabbitmq;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class MQConfig {
	
	public static final String MIAOSHA_QUEUE = "miaosha.queue";

	@Bean
	public Queue miaoShaQueue(){
		return new Queue(MIAOSHA_QUEUE,true);
	}
}
