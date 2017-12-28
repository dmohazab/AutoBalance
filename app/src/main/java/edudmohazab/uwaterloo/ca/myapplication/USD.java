package edudmohazab.uwaterloo.ca.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class USD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usd);

        Button usdAdd = (Button)findViewById(R.id.usdAdd);
        usdAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText usdBund1 = (EditText)findViewById(R.id.usdBund1);
                EditText usdBund2 = (EditText)findViewById(R.id.usdBund2);
                EditText usdBund3 = (EditText)findViewById(R.id.usdBund3);
                EditText usdTreasury = (EditText)findViewById(R.id.usdTreasury);

                int bundle1 = Integer.parseInt(usdBund1.getText().toString());
                int bundle2 = Integer.parseInt(usdBund2.getText().toString());
                int bundle3 = Integer.parseInt(usdBund3.getText().toString());
                int treasury = Integer.parseInt(usdTreasury.getText().toString());

                int finalUsd = bundle1 + bundle2 + bundle3 + treasury;

                Intent sendUsd = new Intent(getApplicationContext(), MainActivity.class);
                sendUsd.putExtra("usd", "$" + finalUsd);
                startActivity(sendUsd);
            }
        });
    }
}
