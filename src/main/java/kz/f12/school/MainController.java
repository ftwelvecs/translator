package kz.f12.school;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;

import java.util.HashMap;
import java.util.Map;

public class MainController {

    private Map<String, String> dictionary = new HashMap<>();

    public MainController() {
        dictionary.put("hello", "привет");
        dictionary.put("good bye", "пока");
    }

    @FXML
    private TextField from;

    @FXML
    private TextField translate;

    @FXML
    void initialize() {
        from.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) {
                String text = from.getText();
                String translate = dictionary.get(text);
                this.translate.setText(translate);
            }
        });
    }

}