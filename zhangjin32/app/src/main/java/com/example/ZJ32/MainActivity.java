package com.example.ZJ32;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ZJ32.R;

public class MainActivity extends AppCompatActivity {
    TextView mSignText;
    TextView mNameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSignText = (TextView)findViewById(R.id.txt_sign);
        mSignText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EdtActivity.class);
                startActivityForResult(intent,11);
            }
        });

    }
}
