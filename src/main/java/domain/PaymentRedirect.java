package domain;


import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class PaymentRedirect {


    public PaymentRedirect(){
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
