package com.example.petupsapk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class page3 extends AppCompatActivity {
    TextView n,m,na;
    Button bU;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        n = (TextView)findViewById(R.id.tn);
        m= (TextView)findViewById(R.id.ta);
        na= (TextView)findViewById(R.id.tnu);
        bU=(Button)findViewById(R.id.button4);
        n.setText(getIntent().getStringExtra("EdiTtEXTvALUE"));
        m.setText(getIntent().getStringExtra("EdiTtEXTvALUE1"));
        na.setText(getIntent().getStringExtra("EdiTtEXTvALUE2"));
        bU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "EXIT", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(page3.this,MainActivity.class);
                startActivity(intent3);
            }
        });
    }
}