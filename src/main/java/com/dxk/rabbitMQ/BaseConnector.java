package com.dxk.rabbitMQ;

import java.io.IOException;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class BaseConnector {
	protected Channel channel;//频道
    protected Connection connection;//连接
    protected String queueName;//队列名称
    public BaseConnector(String queueName) throws IOException{
    	//初始化队列名称
    	this.queueName = queueName;
        //打开连接和创建频道
        ConnectionFactory factory = new ConnectionFactory();
        //设置MabbitMQ所在主机ip或者主机名  127.0.0.1即localhost
        factory.setHost("127.0.0.1");
        //创建连接  
        connection = factory.newConnection();
        //创建频道  
        channel = connection.createChannel();
        //声明创建队列
        channel.queueDeclare(queueName, false, false, false, null);
    }

}
