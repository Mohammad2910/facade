package domain;


import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import messaging.Event;
import messaging.MessageQueue;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class PaymentRedirect {

    private MessageQueue queue;

    public PaymentRedirect(MessageQueue q){
        queue = q;
        //queue.addHandler("PaymentRequested",this::);
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("rabbitmq.server.dtu.dk"); // -> localhost rabbitMq

        try{
            Connection connection = factory.newConnection();
            Channel channel = connection.createChannel();
        }catch (IOException | TimeoutException e){
            e.printStackTrace();
        }
    }




}
