package studio.istart.basic_example;


import java.util.concurrent.CountDownLatch;

import org.springframework.stereotype.Component;

/**
 * @author dongyan
 */
@Component
public class Basic_Receiver {

    private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }

}