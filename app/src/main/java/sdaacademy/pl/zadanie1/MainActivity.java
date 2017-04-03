package sdaacademy.pl.zadanie1;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void showTrojkat() {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentFrame, new Trojkat());
        transaction.commit();
    }


    public void showKwadrat() {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentFrame, new Kwadrat());
        transaction.commit();
    }
}
