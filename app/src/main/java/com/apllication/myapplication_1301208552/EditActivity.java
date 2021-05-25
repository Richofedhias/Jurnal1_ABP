package com.apllication.myapplication_1301208552;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class EditActivity extends AppCompatActivity {

    private EditText nama,merk,content1,content2;
    private Button edit;
    ArrayList<MobilList> isiMobilList = new ArrayList<MobilList>();
    MobilAdapter_1301208552 rvAdapter;
    int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        nama = findViewById(R.id.eT_nama);
        merk = findViewById(R.id.eT_nama_mobil);
        content1 = findViewById(R.id.eT_content1);
        content2 = findViewById(R.id.eT_content2);
        edit = findViewById(R.id.btn_edit);


        Intent iin = getIntent();
        final Bundle b = iin.getExtras();

        if (b != null) {
            String tittle = (String) b.get("tittle");
            String desc = (String) b.get("desc");
            String content1get = (String) b.get("content1");
            String content2get = (String) b.get("content2");

            merk.setText(tittle);
            nama.setText(desc);
            content1.setText(content1get);
            content2.setText(content2get);

        }

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getnama = nama.getText().toString();
                String getmerk = merk.getText().toString();
                String getContent1 = content1.getText().toString();
                String getContent2 = content2.getText().toString();

                isiMobilList.get(position).setTittle(getnama);
                isiMobilList.get(position).setDesc(getmerk);
                isiMobilList.get(position).setContent1(getContent1);
                isiMobilList.get(position).setContent2(getContent2);


                Intent intent = new Intent(EditActivity.this,MainActivity.class);
//                intent.putExtra("tittle", getnama);
//                intent.putExtra("desc", getmerk);
//                intent.putExtra("content1", getContent1);
//                intent.putExtra("content2", getContent2);
                startActivity(intent);
                finish();
            }
        });
    }
}