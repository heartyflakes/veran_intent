package mcm.edu.ph.veran_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button next1 = findViewById(R.id.btnNextCon);

        next1.setOnClickListener(this);

    }
    @Override
    public void onClick(View view){

        TextView display = findViewById(R.id.txtDisplay);
        EditText input = findViewById(R.id.txtMonthValue);

        Intent i= new Intent(MainActivity.this, Activity2.class);

        int numberMonths = Integer.parseInt(String.valueOf(input.getText()));

        switch (view.getId()) {
            case R.id.btnNextCon:
                i.putExtra("INMONTHS", numberMonths);

                startActivity(i);
                break;



        }


    }
}