package com.example.fshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ph;
    Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ph=findViewById(R.id.ph_edt);
        btn1=findViewById(R.id.bt_sign_in);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ph.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"Enter Phone Number",Toast.LENGTH_LONG).show();
                }
                else {
                    startActivity(new Intent(MainActivity.this,reg.class));
                }
            }
        });
    }
}
