package com.example.nftpioneers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity {
    int[] images = {R.drawable.bananapenguin,R.drawable.bandanacat,R.drawable.blingmonkey,R.drawable.convictmonkey,
            R.drawable.goldenmonkey,R.drawable.leopardmonkey,R.drawable.nyancat,R.drawable.samuraipenguin,R.drawable.coolpenguin,R.drawable.whitecat};
    String[] titleOfNFTs = {"Banana Penguin", "Bandana Cat", "Bling Monkey", "Convict Monkey", "Golden Monkey", "Leopard Monkey", "Nyan Cat", "Samurai Penguin","White Cat","Cool Penguin"};
    String[] NFTRarity = {"Legendary", "Common", "Epic", "Common","Legendary", "Common","Legendary","Epic","Common","Epic"};
    int [] NFTPrice = MainActivity3.getNFTPrices();
    int dayCounter = MainActivity3.getDayCounter();
    int balance = MainActivity3.getBalance();
    int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        ImageButton firstNFT = (ImageButton) findViewById(R.id.imageButton13);
        ImageButton secondNFT = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton thirdNFT = (ImageButton) findViewById(R.id.imageButton12);
        ImageButton fourthNFT = (ImageButton) findViewById(R.id.imageButton11);

        firstNFT.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                index = 4;
                MainActivity6(index);
            }
        });
        secondNFT.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                index =5;
                MainActivity6(index);
            }
        });
        thirdNFT.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                index=6;
                MainActivity6(index);
            }
        });
        fourthNFT.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                index=7;
                MainActivity6(index);
            }
        });
        TextView dayCount = (TextView) findViewById(R.id.textView38);
        dayCount.setText("Day #"+dayCounter);

        TextView accountValue = (TextView) findViewById(R.id.textView9);
        accountValue.setText("Balance: $" +balance);

        TextView firstNFTTitle = (TextView) findViewById(R.id.textView7);
        firstNFTTitle.setText(titleOfNFTs[4]);

        TextView aboutFirstNFT = (TextView) findViewById(R.id.textView16);
        aboutFirstNFT.setText("Rarity: " +NFTRarity[4]);

        ImageView nftTOP = (ImageView) findViewById(R.id.imageButton13);
        nftTOP.setImageResource(images[4]);

        TextView firstNFTPrice = (TextView) findViewById(R.id.textView28);
        firstNFTPrice.setText(""+NFTPrice[4]);

        //second nft
        TextView secondNFTTitle = (TextView) findViewById(R.id.textView18);
        secondNFTTitle.setText(titleOfNFTs[5]);

        TextView aboutSecondNFT = (TextView) findViewById(R.id.textView17);
        aboutSecondNFT.setText("Rarity: " +NFTRarity[5]);

        ImageView nftTWO = (ImageView) findViewById(R.id.imageButton2);
        nftTWO.setImageResource(images[5]);

        TextView secondNFTPrice = (TextView) findViewById(R.id.textView29);
        secondNFTPrice.setText(""+NFTPrice[5]);

        //third nft
        TextView thirdNFTTitle = (TextView) findViewById(R.id.textView19);
        thirdNFTTitle.setText(titleOfNFTs[6]);

        TextView aboutThirdNFT = (TextView) findViewById(R.id.textView20);
        aboutThirdNFT.setText("Rarity: " +NFTRarity[6]);

        ImageView nftTHREE = (ImageView) findViewById(R.id.imageButton12);
        nftTHREE.setImageResource(images[6]);

        TextView thirdNFTPrice = (TextView) findViewById(R.id.textView31);
        thirdNFTPrice.setText(""+NFTPrice[6]);

        //fourth NFT
        TextView fourthNFTTitle = (TextView) findViewById(R.id.textView21);
        fourthNFTTitle.setText(titleOfNFTs[7]);

        TextView aboutfourthNFT = (TextView) findViewById(R.id.textView22);
        aboutfourthNFT.setText("Rarity: " + NFTRarity[7]);

        ImageView nftFOUR = (ImageView) findViewById(R.id.imageButton11);
        nftFOUR.setImageResource(images[7]);

        TextView fourthNFTPrice = (TextView) findViewById(R.id.textView32);
        fourthNFTPrice.setText(""+NFTPrice[7]);

        Button prevPage = (Button) findViewById(R.id.button5);
        Button nextPage = (Button) findViewById(R.id.nextpage2);
        Button mainMenu3 = (Button) findViewById(R.id.main_menu_3);
        mainMenu3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                MainActivity2();
            }
        });
        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity8();
            }
        });
        prevPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity3();
            }
        });

    }

    public void MainActivity2(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void MainActivity3(){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    public void MainActivity8(){
        Intent intent = new Intent(this, MainActivity8.class);
        startActivity(intent);
    }
    public void MainActivity6(int index) {
        String name = titleOfNFTs[index];
        String rarity = NFTRarity[index];
        String price = String.valueOf(NFTPrice[index]);
        Intent intent = new Intent(this,MainActivity6.class);
        intent.putExtra("image", index);
        intent.putExtra("name", name);
        intent.putExtra("rarity", rarity);
        intent.putExtra("price",price);
        startActivity(intent);
    }

}

