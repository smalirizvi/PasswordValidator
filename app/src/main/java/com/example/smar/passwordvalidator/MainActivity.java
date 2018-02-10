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
                EditText enterPass = (EditText) findViewById(R.id.enterPass);
                TextView strength = (TextView) findViewById(R.id.strength);

                if(Validator.validate(enterPass.getText().toString()) == true)
                    strength.setText("Good Password");
                else
                    strength.setText("Failed Password");
            }
        });
    }
}
