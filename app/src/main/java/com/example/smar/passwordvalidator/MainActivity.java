package com.example.smar.passwordvalidator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText input = (EditText) findViewById(R.id.enterPass);
                TextView result = (TextView) findViewById(R.id.strength);

                //result.setText("yes");
                //validator.validate(input.getText()) ==
                if(Validator.validate(input.getText().toString()) == true)
                    result.setText("Valid Password");
                else
                    result.setText("Not Valid Password");
            }
        });
    }
}
