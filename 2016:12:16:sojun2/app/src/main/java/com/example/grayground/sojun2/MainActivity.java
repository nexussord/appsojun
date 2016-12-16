package com.example.grayground.sojun2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = (EditText) findViewById(R.id.edittext);

        final Intent intent = new Intent(MainActivity.this, SubActivity.class);
        Button button = (Button) findViewById(R.id.button);
        final String a = "a";

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                intent.putExtra("text", editText.getText().toString());

                //새로운 화면을 시작
                startActivity(intent);
                //기존 화면을 끼준다
                finish();

            }
        });
    }
}
