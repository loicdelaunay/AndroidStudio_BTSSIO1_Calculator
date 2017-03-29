package thlaurebtssio.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCalcStand = (Button) findViewById(R.id.buttonCalcStand);
        btnCalcStand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TestCalcStand.class);
                startActivity(intent);
            }
        });

        Button btnCalcDev = (Button) findViewById(R.id.buttonCalcDev);
        btnCalcDev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalcDev.class);
                startActivity(intent);
            }
        });

        Button qt =(Button)findViewById(R.id.buttonQuit);
        qt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.exit(0);
            }
        });
    }
}
