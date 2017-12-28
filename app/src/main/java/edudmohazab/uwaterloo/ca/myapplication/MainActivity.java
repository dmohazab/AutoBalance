package edudmohazab.uwaterloo.ca.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button coinBtn = (Button)findViewById(R.id.coinBtn);
        coinBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent startCoin = new Intent(getApplicationContext(), coin.class);
                startActivity(startCoin);
            }
        });

        Button euroBtn = (Button)findViewById(R.id.euroBtn);
        euroBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent startEuro = new Intent(getApplicationContext(), activity_euro.class);
                startActivity(startEuro);
            }
        });


        Button strlBtn = (Button)findViewById(R.id.strlBtn);
        strlBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent startStrl = new Intent(getApplicationContext(), acitvity_strl.class);
                startActivity(startStrl);
            }
        });

        Button usdBtn = (Button)findViewById(R.id.usdBtn);
        usdBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent startUsd = new Intent(getApplicationContext(), USD.class);
                startActivity(startUsd);
            }
        });


        if(getIntent().hasExtra("euro")){
            TextView result = (TextView)findViewById(R.id.result);
            String finalResult = getIntent().getExtras().getString("euro");
            result.setText(finalResult);

            TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
            resultTextView.setText("Euro Final:");
        }
        else if (getIntent().hasExtra("sterling")){
            TextView result = (TextView)findViewById(R.id.result);
            String finalResult = getIntent().getExtras().getString("sterling");
            result.setText(finalResult);

            TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
            resultTextView.setText("Sterling Final:");
        }

        else if (getIntent().hasExtra("usd")){
            TextView result = (TextView)findViewById(R.id.result);
            String finalResult = getIntent().getExtras().getString("usd");
            result.setText(finalResult);

            TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
            resultTextView.setText("USD Final:");
        }

        else if (getIntent().hasExtra("coin")){
            TextView result = (TextView)findViewById(R.id.result);
            String finalResult = (getIntent().getExtras().getString("coin"));
            if(finalResult.length() <6)
                finalResult += "0";
            result.setText(finalResult);

            TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
            resultTextView.setText("Coin Final:");
        }

    }
}
