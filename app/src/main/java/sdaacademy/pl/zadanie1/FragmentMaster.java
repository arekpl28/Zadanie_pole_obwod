package sdaacademy.pl.zadanie1;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentMaster extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_master, container, false);
        final MainActivity activity = (MainActivity) getActivity();
        Button trojkat_Button = (Button) view.findViewById(R.id.trojkatButton);
        Button kwadrat_Button = (Button) view.findViewById(R.id.kwadratButton);

        trojkat_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.showTrojkat();
            }
        });
        kwadrat_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.showKwadrat();
            }
        });
        return view;
    }
}
