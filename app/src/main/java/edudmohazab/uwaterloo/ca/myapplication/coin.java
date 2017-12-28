package edudmohazab.uwaterloo.ca.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class coin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coin);

        Button coinAdd = (Button)findViewById(R.id.coinAdd);
        coinAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText nickelRollEditText = (EditText)findViewById(R.id.nickelRollEditText);
                EditText nickelLooseEditText = (EditText)findViewById(R.id.nickelLooseEditText);
                EditText dimeRollEditText = (EditText)findViewById(R.id.dimeRollEditText);
                EditText dimeLooseEditText = (EditText)findViewById(R.id.dimeLooseEditText);
                EditText quarterRollEditText = (EditText)findViewById(R.id.quarterRollEditText);
                EditText quarterLooseEditText = (EditText)findViewById(R.id.quarterLooseEditText);
                EditText loonieRollEditText = (EditText)findViewById(R.id.loonieRollEditText);
                EditText loonieLooseEditText = (EditText)findViewById(R.id.loonieLooseEditText);
                EditText twoonieRollEditText = (EditText)findViewById(R.id.twoonieRollEditText);
                EditText twoonieLooseEditText = (EditText)findViewById(R.id.twoonieLooseEditText);

                double nickels = (Double.parseDouble((nickelRollEditText.getText().toString()) ) *  2 +
                        Double.parseDouble((nickelLooseEditText.getText().toString() ) )  * 0.05);

                double dimes = (Double.parseDouble((dimeRollEditText.getText().toString()) ) *  5 +
                        Double.parseDouble((dimeLooseEditText.getText().toString() ) )  * 0.10);

                double quarters = (Double.parseDouble((quarterRollEditText.getText().toString()) ) *  10 +
                        Double.parseDouble((quarterLooseEditText.getText().toString() ) )  * 0.25);

                double loonies = (Double.parseDouble((loonieRollEditText.getText().toString()) ) *  25 +
                        Double.parseDouble((loonieLooseEditText.getText().toString() ) ) );

                double twoonies = (Double.parseDouble((twoonieRollEditText.getText().toString()) ) *  50 +
                        Double.parseDouble((twoonieLooseEditText.getText().toString() ) )  * 2);

                double total = nickels + dimes + quarters + loonies + twoonies;

                Intent sendCoin = new Intent(getApplicationContext(), MainActivity.class);
                sendCoin.putExtra("coin", "$" + total);
                startActivity(sendCoin);

            }
        });
    }
}
