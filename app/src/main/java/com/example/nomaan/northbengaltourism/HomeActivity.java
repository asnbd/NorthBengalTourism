package com.example.nomaan.northbengaltourism;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    Button mahastangarh, rajshahi, natore, chapai, paharpur, rangpur, dinajpur, share, about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mahastangarh = findViewById(R.id.btn_mahasthangarh);
        rajshahi = findViewById(R.id.btn_rajshahi);
        natore = findViewById(R.id.btn_natore);
        chapai = findViewById(R.id.btn_chapai);
        paharpur = findViewById(R.id.btn_paharpur);
        rangpur = findViewById(R.id.btn_rangpur);
        dinajpur = findViewById(R.id.btn_dinajpur);
        share = findViewById(R.id.btn_share);
        about = findViewById(R.id.btn_about);

        mahastangarh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
/*                Intent intent = new Intent(HomeActivity.this, MahasthangarhActivity.class);
                Toast.makeText(HomeActivity.this, "Loading Mahasthangarh (Bogra)", Toast.LENGTH_SHORT).show();*/

                Intent intent = new Intent(getApplicationContext(), ContentActivity.class);
                intent.putExtra("TITLE", R.string.mahasthangarh_bogra);
                intent.putExtra("IMG1", R.drawable.mahasthangarh_1);
//                intent.putExtra("IMG2", R.drawable.mahasthangarh_2);
                intent.putExtra("TEXT", R.string.mahasthangarh_text);
                startActivity(intent);
            }
        });

        rajshahi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
/*                Intent intent = new Intent(HomeActivity.this, RajshahiActivity.class);
                Toast.makeText(HomeActivity.this, "Loading Rajshahi", Toast.LENGTH_SHORT).show();*/

                Intent intent = new Intent(getApplicationContext(), ContentActivity.class);
                intent.putExtra("TITLE", R.string.natore);
                intent.putExtra("IMG1", R.drawable.varendra_research_museum_rajshahi);
//                intent.putExtra("IMG2", R.drawable.mahasthangarh_2);
                intent.putExtra("TEXT", R.string.rajshahi_text);
                startActivity(intent);
            }
        });

        natore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
 /*               Intent intent = new Intent(HomeActivity.this, NatoreActivity.class);
                Toast.makeText(HomeActivity.this, "Loading Natore", Toast.LENGTH_SHORT).show();
*/
                Intent intent = new Intent(getApplicationContext(), ContentActivity.class);
                intent.putExtra("TITLE", R.string.natore);
                intent.putExtra("IMG1", R.drawable.natore_rajbari);
//                intent.putExtra("IMG2", R.drawable.mahasthangarh_2);
                intent.putExtra("TEXT", R.string.natore_text);
                startActivity(intent);
            }
        });

        chapai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
/*                Intent intent = new Intent(HomeActivity.this, ChapaiActivity.class);
                Toast.makeText(HomeActivity.this, "Loading Chapai Nawabgonj", Toast.LENGTH_SHORT).show();*/

                Intent intent = new Intent(getApplicationContext(), ContentActivity.class);
                intent.putExtra("TITLE", R.string.chapai_nawabjonj);
                intent.putExtra("IMG1", R.drawable.chotto_sona_mosque);
//                intent.putExtra("IMG2", R.drawable.mahasthangarh_2);
                intent.putExtra("TEXT", R.string.chapai_text);
                startActivity(intent);
            }
        });

        paharpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
/*                Intent intent = new Intent(HomeActivity.this, PaharpurActivity.class);
                Toast.makeText(HomeActivity.this, "Loading Paharpur Buddhist Monastery", Toast.LENGTH_SHORT).show();*/

                Intent intent = new Intent(getApplicationContext(), ContentActivity.class);
                intent.putExtra("TITLE", R.string.paharpur_buddhist_monastery);
                intent.putExtra("IMG1", R.drawable.somapuri_vihara_paharpur);
//                intent.putExtra("IMG2", R.drawable.mahasthangarh_2);
                intent.putExtra("TEXT", R.string.paharpur_text);
                startActivity(intent);
            }
        });

        rangpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
/*                Intent intent = new Intent(HomeActivity.this, RangpurActivity.class);
                Toast.makeText(HomeActivity.this, "Loading Rangpur", Toast.LENGTH_SHORT).show();*/

                Intent intent = new Intent(getApplicationContext(), ContentActivity.class);
                intent.putExtra("TITLE", R.string.rangpur);
                intent.putExtra("IMG1", R.drawable.tajhat_palace_rangpur);
//                intent.putExtra("IMG2", R.drawable.mahasthangarh_2);
                intent.putExtra("TEXT", R.string.rangpur_text);
                startActivity(intent);
            }
        });

        dinajpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
/*                Intent intent = new Intent(HomeActivity.this, DinajpurActivity.class);
                Toast.makeText(HomeActivity.this, "Loading Dinajpur", Toast.LENGTH_SHORT).show();*/

                Intent intent = new Intent(getApplicationContext(), ContentActivity.class);
                intent.putExtra("TITLE", R.string.dinajpur);
                intent.putExtra("IMG1", R.drawable.shopnopuri_dinajpur);
//                intent.putExtra("IMG2", R.drawable.mahasthangarh_2);
                intent.putExtra("TEXT", R.string.dinajpur_text);
                startActivity(intent);
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, "Check this app https://play.google.com/store?hl=en");
                intent.setType("text/plain");
                startActivity(intent);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //finish();
                Intent intent = new Intent(HomeActivity.this, AboutActivity.class);
                Toast.makeText(HomeActivity.this, "Loading About", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}
