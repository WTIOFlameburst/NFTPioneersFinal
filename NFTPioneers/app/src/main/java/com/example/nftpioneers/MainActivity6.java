package com.example.nftpioneers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {
    int[] images = {R.drawable.bananapenguin,R.drawable.bandanacat,R.drawable.blingmonkey,R.drawable.convictmonkey,
            R.drawable.goldenmonkey,R.drawable.leopardmonkey,R.drawable.nyancat,R.drawable.samuraipenguin,R.drawable.coolpenguin,R.drawable.whitecat};
    int index = 0;
    int [] NFTPrices = MainActivity3.getNFTPrices();
    String nameChosen = "";
    String rarity = "";
    String price = "";
    public static int[] boughtNFTs = new int[10];
    int dayCounter = MainActivity3.getDayCounter();
    int balance = MainActivity3.getBalance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        Intent i = getIntent();
        index = i.getIntExtra("image",0);
        nameChosen = i.getStringExtra("name");
        rarity = i.getStringExtra("rarity");
        price = i.getStringExtra("price");

        ImageView buySellScreen = (ImageView) findViewById(R.id.imageView);
        buySellScreen.setImageResource(images[index]);

        TextView NFTTitle = (TextView) findViewById(R.id.textView23);
        NFTTitle.setText(nameChosen);

        TextView aboutNFT = (TextView) findViewById(R.id.textView24);
        aboutNFT.setText(rarity);

        TextView NFTPrice = (TextView) findViewById(R.id.textView25);
        NFTPrice.setText(price);

        Button buyNFT = (Button) findViewById(R.id.button2);
        Button sellNFT = (Button) findViewById(R.id.button);
        buyNFT.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int tempBalance = balance;
                for (int i = 0; i != boughtNFTs.length; i++){
                    if (boughtNFTs[i] == 1) {
                        tempBalance = tempBalance - NFTPrices[i];
                    }
                }
                if (tempBalance >= Integer.parseInt(price)){
                    boughtNFTs[index] = 1;
                }
            }
        });
        sellNFT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boughtNFTs[index] = 0;
            }
        });
    }
    public static int[] getBoughtNFTs(){
        return boughtNFTs;
    }
}