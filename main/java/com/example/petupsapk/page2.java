package com.example.petupsapk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
public class page2 extends AppCompatActivity {
    Button b;
    EditText n,m,na;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        b=(Button)findViewById(R.id.button3);
        n=(EditText) findViewById(R.id.txtname);
        m=(EditText) findViewById(R.id.txtaddress);
        na=(EditText) findViewById(R.id.txtnumber);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(n.getText().toString().equals("")&&m.getText().toString().equals("")&&na.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "PLEASE COMPLETE THE DATA! ", Toast.LENGTH_SHORT).show();


                }else{
                    intent = new Intent(getApplicationContext(), page3.class);
                    intent.putExtra("EdiTtEXTvALUE", n.getText().toString());
                    intent.putExtra("EdiTtEXTvALUE1", m.getText().toString());
                    intent.putExtra("EdiTtEXTvALUE2", na.getText().toString());

                    Toast.makeText(getApplicationContext(), "DATA CONTRIBUTING TO PET UPS ", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }
            }
        });
    }
}