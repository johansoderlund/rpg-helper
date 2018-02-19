package org.rpgstuff.rpghelper;

import javafx.animation.*;
import javafx.scene.control.Label;
import javafx.util.Duration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DigitalClock extends Label {

    private static DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private LocalDateTime startTime;
    private static int INCREMENT_SECONDS = 1;

    public DigitalClock(int year, int month, int day, int hour, int minute) {
        this.startTime = LocalDateTime.of(year, month, day, hour, minute);
        bindToTime();
    }

    // the digital clock updates once a second.
    private void bindToTime() {
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(0),
                event -> {
            startTime = startTime.plusSeconds(INCREMENT_SECONDS);
            setText(startTime.format(DATE_FORMAT));
        }),
                new KeyFrame(Duration.seconds(INCREMENT_SECONDS)));

        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    public void plusDays(int days){
        startTime = startTime.plusDays(days);
        setText(startTime.format(DATE_FORMAT));
    }
}