package com.evanco.commentqueueconsumer;

import com.evanco.commentqueueconsumer.util.feign.CommentClient;
import com.evanco.commentqueueconsumer.util.messages.Comment;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageListener {

    @Autowired
    private CommentClient client;

    @RabbitListener(queues = CommentQueueConsumerApplication.QUEUE_NAME)
    public void receiveMessage(Comment msg) {

        // Let the presence of a valid ID determine create or update
        System.out.println(msg.toString());
        if(msg.getCommentId() != null){
            client.updateComment(msg, msg.getCommentId());
            System.out.println("=== Update comment ===");
        }else {
            client.createComment(msg);
            System.out.println("=== Create new comment ===");
        }
    }
}
