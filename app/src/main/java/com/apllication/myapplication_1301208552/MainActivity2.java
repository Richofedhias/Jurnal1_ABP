package com.apllication.myapplication_1301208552;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private ImageView image;
    private TextView judul, content1, content2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        image = findViewById(R.id.imageView);
        judul = findViewById(R.id.tV_judul);
        content1 = findViewById(R.id.tV_content_1);
        content2 = findViewById(R.id.tV_content_2);

        Intent iin = getIntent();
        final Bundle b = iin.getExtras();

        if (b != null) {
            String tittle = (String) b.get("tittle");
            String desc = (String) b.get("desc");
            String content1get = (String) b.get("content1");
            String content2get = (String) b.get("content2");
            Integer gambar = (Integer) b.get("image");

            image.setImageResource(gambar);
            judul.setText(tittle + "\n" + desc);
            content1.setText(content1get);
            content2.setText(content2get);

        }

    }
}