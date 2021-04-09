package com.combany.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    EditText ed2;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        btn=findViewById(R.id.button);

        ed2=findViewById(R.id.ed2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num =ed2.getText().toString();
                Intent i =new Intent(Activity2.this,Activity3.class);
                i.putExtra("name",num);
                startActivity(i);
            }
        });


    }
}