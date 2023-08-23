package com.example.cryptographer;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.util.*;

public class HelloController {

    @FXML
    TextField inputText;

    @FXML
    TextField outputText;

    @FXML
    Button btn;

    public void encodeText() {

        HashMap<String, String> dictionary = new HashMap<>();

        String[] namelyText = new String[]{inputText.getText()};

        dictionary.put("Привет!","aPhrase");
        dictionary.put("Как твои дела?","bPhrase");
        dictionary.put("Хорошо!","cPhrase");
        dictionary.put("Двигаемся вперёд!","dPhrase");
        dictionary.put("Делаем проект!","ePhrase");

        dictionary.put("aPhrase","Привет!");
        dictionary.put("bPhrase","Как твои дела?");
        dictionary.put("cPhrase","Хорошо!");
        dictionary.put("dPhrase","Двигаемся вперёд!");
        dictionary.put("ePhrase","Делаем проект!");


        for (int i = 0; i < namelyText.length; i++) {
            namelyText[i] = dictionary.get(namelyText[i]);
            System.out.println(namelyText[i]);
            outputText.setText(namelyText[i]);
        }
    }
}
