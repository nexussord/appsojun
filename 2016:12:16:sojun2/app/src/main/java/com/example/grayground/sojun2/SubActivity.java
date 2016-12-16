package com.example.grayground.sojun2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        TextView textView = (TextView) findViewById(R.id.textview2);
        String text = getIntent().getStringExtra("text");
        textView.setText(text);

    }
}
