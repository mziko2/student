package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class Controller {
    public TextField ulaz;
    public TextField izlaz;


        public static int sumaCifara(int n){
            int s=0;
            while(n!=0){
                s+=n%10;
                n/=10;
            }
        return s;
        }

    public void Izracunaj(ActionEvent actionEvent) {
        int n=Integer.parseInt(ulaz.getText());
        String rezultat= "";

        for(int i=1;i<=n;i++){
            if(i%sumaCifara(i)==0){
                rezultat+=i + ",";
            }
        }

        izlaz.setText(rezultat);




    }
}
