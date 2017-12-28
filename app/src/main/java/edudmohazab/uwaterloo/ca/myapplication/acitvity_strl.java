package edudmohazab.uwaterloo.ca.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class acitvity_strl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acitvity_strl);

        Button addStrl = (Button) findViewById(R.id.addStrl);
        addStrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText cashSterlingEditText = (EditText)findViewById(R.id.cashSterlingEditText);
                EditText treasurySterlingEditText = (EditText)findViewById(R.id.treasurySterlingEditText);

                int cashstrl = Integer.parseInt(cashSterlingEditText.getText().toString());
                int treasurystrl = Integer.parseInt(treasurySterlingEditText.getText().toString());
                int finalStrl = cashstrl + treasurystrl;

                Intent sendStrl = new Intent(getApplicationContext(), MainActivity.class);
                sendStrl.putExtra("sterling", "£" + finalStrl);
                startActivity(sendStrl);
            }
        });

    }
}
