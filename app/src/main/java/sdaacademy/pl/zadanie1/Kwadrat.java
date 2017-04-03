package sdaacademy.pl.zadanie1;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Kwadrat extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_kwadrat, container, false);
        final EditText aBok = (EditText) view.findViewById(R.id.aBokKwadrat);
        final EditText bBok = (EditText) view.findViewById(R.id.aBokKwadrat);

        final EditText pole = (EditText) view.findViewById(R.id.kwadratPoleWynik);
        final EditText obwod = (EditText) view.findViewById(R.id.kwadratObwodWynik);

        Button obliczPole = (Button) view.findViewById(R.id.kwadratPole);
        obliczPole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aB = aBok.getText().toString();
                String bB = bBok.getText().toString();
                try {
                    double a = Double.parseDouble(aB);
                    double b = Double.parseDouble(bB);

                    double result = a * b;
                    pole.setText(Float.toString((float) result));
                } catch (Exception e) {
                    pole.setText("Błędne");
                    obwod.setText("dane");
                }

            }
        });

        Button obliczObwod = (Button) view.findViewById(R.id.kwadratObwod);
        obliczObwod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aB = aBok.getText().toString();
                String bB = bBok.getText().toString();
                try {
                    double a = Double.parseDouble(aB);
                    double b = Double.parseDouble(bB);

                    double result = (2*a) + (2*b);
                    obwod.setText(Float.toString((float) result));
                } catch (Exception e) {
                    pole.setText("Błędne");
                    obwod.setText("dane");
                }
            }
        });


        return view;
    }
}
