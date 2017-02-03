package css.cis3334.participation3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Double;

public class MainActivity extends AppCompatActivity {

    EditText etBill;
    EditText etNumParty;
    TextView tvTotalTip;
    TextView tvTipPerPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //init Variables
        etBill = (EditText) findViewById(R.id.editTextBill);
        etNumParty = (EditText) findViewById(R.id.editTextNumParty);
        tvTotalTip = (TextView) findViewById(R.id.textViewTotalTip);
        tvTipPerPerson = (TextView) findViewById(R.id.textViewTipPP);
    }

    public void onClickButtonCalc(View view) {
        Double number1 = 0.15 * Double.parseDouble(etBill.getText().toString());
        double rounded1 = Math.round(number1 * 100.0) / 100.0;
        tvTotalTip.setText("Total tip: $" + rounded1);
        number1 = number1 / Double.parseDouble(etNumParty.getText().toString());
        rounded1 = Math.round(number1 * 100.0) / 100.0;
        tvTipPerPerson.setText("Tip Per Person: $" + rounded1);
    }
}
