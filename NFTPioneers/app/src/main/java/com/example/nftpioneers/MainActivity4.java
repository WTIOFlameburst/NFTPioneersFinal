package com.example.nftpioneers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    int [] boughtNFTs = MainActivity6.getBoughtNFTs();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button mainMenu4 = (Button) findViewById(R.id.main_menu_4);
        mainMenu4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                MainActivity2();
            }
        });
        TextView bananaPenguin = (TextView) findViewById(R.id.bananaPenguinStatus);
        bananaPenguin.setText("Owned #"+boughtNFTs[0]);

        TextView BandanaCat = (TextView) findViewById(R.id.BandanaCatStatus);
        BandanaCat.setText("Owned #"+boughtNFTs[1]);

        TextView BlingMonkey = (TextView) findViewById(R.id.BlingMonkeyStatus);
        BlingMonkey.setText("Owned #"+boughtNFTs[2]);

        TextView ConvictMonkey = (TextView) findViewById(R.id.ConvictMonkeyStatus);
        ConvictMonkey.setText("Owned #"+boughtNFTs[3]);

        TextView GoldenMonkey = (TextView) findViewById(R.id.GoldenMonkeyStatus);
        GoldenMonkey.setText("Owned #"+boughtNFTs[4]);

        TextView LeopardMonkey = (TextView) findViewById(R.id.LeopardMonkeyStatus);
        LeopardMonkey.setText("Owned #"+boughtNFTs[5]);

        TextView NyanCat = (TextView) findViewById(R.id.NyanCatStatus);
        NyanCat.setText("Owned #"+boughtNFTs[6]);

        TextView SamuraiPenguin = (TextView) findViewById(R.id.SamuraiPenguinStatus);
        SamuraiPenguin.setText("Owned #"+boughtNFTs[7]);

        TextView WhiteCat = (TextView) findViewById(R.id.WhiteCatStatus);
        WhiteCat.setText("Owned #"+boughtNFTs[8]);

        TextView CoolPenguin = (TextView) findViewById(R.id.CoolPenguinStatus);
        CoolPenguin.setText("Owned #"+boughtNFTs[9]);


    }

    public void MainActivity2(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}
