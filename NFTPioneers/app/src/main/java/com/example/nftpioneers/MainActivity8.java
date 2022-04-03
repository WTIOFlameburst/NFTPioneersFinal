package com.example.nftpioneers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity8 extends AppCompatActivity {
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
        setContentView(R.layout.activity_main8);


        ImageButton firstNFT = (ImageButton) findViewById(R.id.imageButton13);
        ImageButton secondNFT = (ImageButton) findViewById(R.id.imageButton2);

        firstNFT.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                index = 8;
                MainActivity6(index);
            }
        });
        secondNFT.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                index =9;
                MainActivity6(index);
            }
        });
        TextView dayCount = (TextView) findViewById(R.id.textView26);
        dayCount.setText("Day #"+dayCounter);

        TextView accountValue = (TextView) findViewById(R.id.textView10);
        accountValue.setText("Balance: $" +balance);

        TextView firstNFTTitle = (TextView) findViewById(R.id.textView7);
        firstNFTTitle.setText(titleOfNFTs[8]);

        TextView aboutFirstNFT = (TextView) findViewById(R.id.textView16);
        aboutFirstNFT.setText("Rarity: " +NFTRarity[8]);

        ImageView nftTOP = (ImageView) findViewById(R.id.imageButton13);
        nftTOP.setImageResource(images[8]);

        TextView firstNFTPrice = (TextView) findViewById(R.id.textView27);
        firstNFTPrice.setText(""+NFTPrice[8]);

        //second nft
        TextView secondNFTTitle = (TextView) findViewById(R.id.textView18);
        secondNFTTitle.setText(titleOfNFTs[9]);

        TextView aboutSecondNFT = (TextView) findViewById(R.id.textView17);
        aboutSecondNFT.setText("Rarity: " +NFTRarity[9]);

        ImageView nftTWO = (ImageView) findViewById(R.id.imageButton2);
        nftTWO.setImageResource(images[9]);

        TextView secondNFTPrice = (TextView) findViewById(R.id.textView30);
        secondNFTPrice.setText(""+NFTPrice[9]);

        Button prevPage = (Button) findViewById(R.id.button4);
        Button mainMenu3 = (Button) findViewById(R.id.main_menu_3);
        mainMenu3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                MainActivity2();
            }
        });
        prevPage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                MainActivity7();
            }
        });
    }

    public void MainActivity2(){
        Intent intent = new Intent(this, MainActivity2.class);
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
    public void MainActivity7(){
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
    }

}

