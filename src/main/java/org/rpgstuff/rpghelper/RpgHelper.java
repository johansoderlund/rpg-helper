package org.rpgstuff.rpghelper;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.rpgstuff.rpghelper.utils.DieRoller;

import java.time.Clock;
import java.util.*;
import java.util.stream.Collectors;

public class RpgHelper extends Application{
    public static void main(String[] args) throws InterruptedException{
/*        Map<Integer, Integer> results = new HashMap<Integer, Integer>();
        DieRoller dieRoller = new DieRoller();
        for(int i=0; i<10000; i++) {
            int roll = dieRoller.rollD20();
            if(results.containsKey(roll)){
                results.put(roll, results.get(roll) + 1);
            }
            else{
                results.put(roll, 1);
            }
        }
        Map<Integer,Integer> sorted = results.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder())).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) -> e1, LinkedHashMap::new));
        for(Map.Entry<Integer, Integer> entry : sorted.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }*/

/*        Thread test = new Thread(new TestRunnable(System.currentTimeMillis()));
        test.start();
        Thread.sleep(3000);
        System.out.println("Got here!");
        Thread.sleep(3000);
        test.interrupt();
        test.join();*/
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        DigitalClock digitalClock = new DigitalClock(1440, 10, 1, 12, 0);
        Pane pane = new Pane();
        pane.getChildren().add(digitalClock);
        Button button = new Button("Add 2 days");
        button.setOnAction((actionEvent) -> digitalClock.plusDays(2));
        button.relocate(0, 50);
        pane.getChildren().add(button);
        stage.setScene(new Scene(pane, 200, 200));
        stage.show();
    }
}
