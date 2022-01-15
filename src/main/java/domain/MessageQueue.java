package domain;

import java.util.function.Consumer;

public interface MessageQueue {

    void publish(Event message);
    void addHandler(String eventType, Consumer<Event> handler);

}