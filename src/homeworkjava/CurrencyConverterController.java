/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homeworkjava;

/**
 *
 * @author Al_Ma
 */
public class CurrencyConverterController {
     private final CurrencyConverterModel model;
    private CurrencyConverterView view;

    public CurrencyConverterController(CurrencyConverterModel model, CurrencyConverterView view) {
        this.model = model;
        this.view = view;

        view.getInputField().setOnAction(event -> {
            double amount = Double.parseDouble(view.getInput());
            double result = model.convert(amount);
            view.setResult(String.format("%.2f", result));
        });
    }

    private static class CurrencyConverterModel {

        public CurrencyConverterModel() {
        }

        private double convert(double amount) {

        }
    }
    
}
