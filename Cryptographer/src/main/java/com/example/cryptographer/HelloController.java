package com.example.cryptographer;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class HelloController {

    @FXML
    TextField inputText;

    @FXML
    TextField outputText;

    @FXML
    Button btn;

    public void cryptoText() throws InvocationTargetException {

        //System.out.println("Введите текст для шифрования!");
        //Scanner sc = new Scanner(System.in);
        //String textForCrypto = sc.nextLine();
        String textForCrypto = inputText.getText();
        Map<String, String> cryptoDictionary = new HashMap<String, String>();
        cryptoDictionary.put("Привет!", "aPhrase");
        cryptoDictionary.put("Как дела?", "bPhrase");
        cryptoDictionary.put("Что делаешь?", "cPhrase");
        cryptoDictionary.put("Где ты?", "dPhrase");
        cryptoDictionary.put("Когда будешь?", "ePhrase");

        for (char letter : textForCrypto.toCharArray()) {
            for (String key : cryptoDictionary.keySet()) {
                if (letter == key.charAt(0)) {
                    System.out.print(cryptoDictionary.get(key));
                    System.out.print(" ");
                }
            }
        }
    }
}
