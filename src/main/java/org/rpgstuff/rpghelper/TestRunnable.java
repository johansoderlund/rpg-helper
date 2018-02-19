package org.rpgstuff.rpghelper;

import javafx.scene.text.Text;

import java.util.Date;

public class TestRunnable implements Runnable{

    private long currentTime;
    private long displayTime;
    private Text text;

    public TestRunnable(long startTime, Text text){
        this.currentTime = System.currentTimeMillis();
        this.displayTime = startTime;
    }

    public void run() {
        while(true) {
            long diff = System.currentTimeMillis() - currentTime;
            System.out.println((new Date(displayTime + diff)).toString());
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
