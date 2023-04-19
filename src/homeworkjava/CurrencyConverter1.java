/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homeworkjava;

/**
 *
 * @author Al_Ma
 */
public class CurrencyConverter1 extends Application {
    public void start(Stage primaryStage) throws Exception {
        CurrencyConverterModel model = new CurrencyConverterModel();
        model.setExchangeRate(1.12);

        CurrencyConverterView view = new CurrencyConverterView();

        CurrencyConverterController controller = new CurrencyConverterController(model, view);

        Scene scene = new Scene(view);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private static class Stage {

        public Stage() {
        }
    }

    private static class CurrencyConverterModel {

        public CurrencyConverterModel() {
        }

        private void setExchangeRate(double d) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
}
