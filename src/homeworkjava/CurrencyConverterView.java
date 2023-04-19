/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homeworkjava;

import java.awt.Label;
import java.awt.TextField;

/**
 *
 * @author Al_Ma
 */
public class CurrencyConverterView  {
      private TextField inputField;
    private Label resultLabel;

    public CurrencyConverterView() {
        inputField = new TextField();
        resultLabel = new Label();

        VBox vbox = new VBox();
        vbox.getChildren().addAll(inputField, resultLabel);

        this.setCenter(vbox);
    }

    public String getInput() {
        return inputField.getText();
    }

    public void setResult(String result) {
        resultLabel.setText(result);
    }

    private void setCenter(VBox vbox) {
        
    }

    Object getInputField() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class VBox {

        public VBox() {
        }

        private Object getChildren() {
           
        }
    }
    
}
