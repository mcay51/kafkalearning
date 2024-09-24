package tr.com.mcay.notificationservice.listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationListener {

    @KafkaListener(topics = "blog-topic", groupId = "notification-group")
    public void listen(String message) {
        System.out.println("Received blog post notification: " + message);
        // Burada bildirim gönderebilirsiniz (örneğin, e-posta)
    }
}
