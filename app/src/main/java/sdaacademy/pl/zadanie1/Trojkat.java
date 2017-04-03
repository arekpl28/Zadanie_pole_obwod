package sdaacademy.pl.zadanie1;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Trojkat extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_trojkat, container, false);
        final EditText wysokosc = (EditText) view.findViewById(R.id.bBok);
        final EditText podstawa = (EditText) view.findViewById(R.id.aPodstawa);
        final EditText bok = (EditText) view.findViewById(R.id.cBok);

        final EditText pole = (EditText) view.findViewById(R.id.trojkatPoleWynik);
        final EditText obwod = (EditText) view.findViewById(R.id.trojkatObwodWynik);

        Button obliczPole = (Button) view.findViewById(R.id.trojkatPole);
        obliczPole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String wys = wysokosc.getText().toString();
                String podst = podstawa.getText().toString();
                try {
                    double h = Double.parseDouble(wys);
                    double b = Double.parseDouble(podst);

                    double result = h * b / 2;
                    pole.setText(Float.toString((float)result));
                } catch (Exception e) {
                    pole.setText("Błędne");
                    obwod.setText("dane");
                }
            }
        });
        Button obliczObwod = (Button) view.findViewById(R.id.trojkatObwod);
        obliczObwod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String wys = wysokosc.getText().toString();
                String podst = podstawa.getText().toString();
                String cBok = bok.getText().toString();
                try {
                    double h = Double.parseDouble(wys);
                    double b = Double.parseDouble(podst);
                    double c = Double.parseDouble(cBok);

                    double result = h+b+c;
                    obwod.setText(Float.toString((float)result));
                } catch (Exception e) {
                    pole.setText("Błędne");
                    obwod.setText("dane");
                }

            }
        });

        return view;
    }
}
