package edudmohazab.uwaterloo.ca.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activity_euro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_euro);

        Button addEuro = (Button) findViewById(R.id.addEuro);
        addEuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText cashEuroEditText = (EditText)findViewById(R.id.cashEuroEditText);
                EditText treasuryEuroEditText = (EditText)findViewById(R.id.treasuryEuroEditText);

                int casheuro = Integer.parseInt(cashEuroEditText.getText().toString());
                int treasuryeuro = Integer.parseInt(treasuryEuroEditText.getText().toString());
                int finalEuro = casheuro + treasuryeuro;

                Intent sendEuro = new Intent(getApplicationContext(), MainActivity.class);
                sendEuro.putExtra("euro", "€" + finalEuro);
                startActivity(sendEuro);
            }
        });
    }
}
