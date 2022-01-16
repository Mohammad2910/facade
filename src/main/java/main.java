import messaging.implementations.RabbitMqQueue;

public class main {
    public static void main(String[] args) throws Exception {
        System.out.println("startup");
        var mq = new RabbitMqQueue("localhost");
        //mq.addHandler();
    }
}
