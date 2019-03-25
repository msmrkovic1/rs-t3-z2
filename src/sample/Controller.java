package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class Controller {

    public TextField ulaz;
    public TextField izlaz;



    //ispis promjenjene recenice

    public void onSubmit(ActionEvent actionEvent) {
        String str = ulaz.getText();

        String[] strArr = str.split(" ");

        izlaz.setText(najvecaRijec(strArr));
    }

    private String najvecaRijec(String[] strArr) {
        //posljednja najduza rijec
        String max = "";

        //nalazi najvecu rijec
        for(String item : strArr){
            if(max.length()<item.length()) max=item;
        }

        String s = "";
        //indeksiranje forloop-a
        int i = 0;
        for (String item : strArr) {
            if (max.equals(item)) {
                s += item.toUpperCase();
            } else {
                s += item;
            }
            if (i < strArr.length - 1) s += ' ';
            i = i + 1;
        }

        return s;
    }
}
