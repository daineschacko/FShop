package com.example.fshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class reg extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5,ed6;
    Button btnreg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        ed1=findViewById(R.id.name);
        ed2=findViewById(R.id.address);
        ed3=findViewById(R.id.email);
        ed4=findViewById(R.id.state);
        ed5=findViewById(R.id.district);
        ed6=findViewById(R.id.city);
        btnreg=findViewById(R.id.reghome);
        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    startActivity(new Intent(reg.this,home.class));

            }
        });
    }
}
