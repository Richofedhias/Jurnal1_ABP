package com.apllication.myapplication_1301208552;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rV_mobil;
    MobilAdapter_1301208552 mobilAdapter;
    ArrayList<MobilList> listMobil = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rV_mobil = findViewById(R.id.rV_mobil);

        listMobil.add(new MobilList("Mitsu","Xpander Cross","Premium At\n290juta","Rockford\nfosgate\n300 juta",R.drawable.cars_satu));
        listMobil.add(new MobilList("Honda","Jazz","Premium At\n290juta","Rockford\nfosgate\n300 juta",R.drawable.cars_dua));
        listMobil.add(new MobilList("Toyota","Alphard","Premium At\n290juta","Rockford\nfosgate\n300 juta",R.drawable.cars_tiga));
        listMobil.add(new MobilList("BMW","C100","Premium At\n290juta","Rockford\nfosgate\n300 juta",R.drawable.cars_dua));
        listMobil.add(new MobilList("Mitsu","Xpander Cross","Premium At\n290juta","Rockford\nfosgate\n300 juta",R.drawable.cars_satu));

        rV_mobil.setHasFixedSize(true);
        LinearLayoutManager lm = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        rV_mobil.setLayoutManager(lm);
        mobilAdapter = new MobilAdapter_1301208552(this,listMobil);
        rV_mobil.setAdapter(mobilAdapter);




    }
}