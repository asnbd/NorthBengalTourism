package com.example.nomaan.northbengaltourism;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ContentActivity extends AppCompatActivity {

    ImageView imgView1;
    TextView textView, titleView;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        back = findViewById(R.id.btn_back);

        titleView = findViewById(R.id.title_view);
        imgView1 = findViewById(R.id.image_view_1);
        textView = findViewById(R.id.text_view);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent);
            }
        });

        int title = getIntent().getExtras().getInt("TITLE");
        int img1 = getIntent().getExtras().getInt("IMG1");
        int text = getIntent().getExtras().getInt("TEXT");

        titleView.setText(title);
        imgView1.setImageResource(img1);
        textView.setText(text);
    }
}
