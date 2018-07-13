package com.example.nomaan.northbengaltourism;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    Button back;
    TextView fbText;
    ImageView fbIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        back = findViewById(R.id.btn_back);
        fbText = findViewById(R.id.fb_asnbd);
        fbIcon = findViewById(R.id.fb_logo);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Intent intent = new Intent(AboutActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        fbText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.facebook.com/asnbd"));
                startActivity(intent);
            }
        });

        fbIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.facebook.com/asnbd"));
                startActivity(intent);
            }
        });
    }
}
