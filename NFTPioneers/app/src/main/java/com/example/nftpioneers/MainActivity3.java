package com.example.nftpioneers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    int[] images = {R.drawable.bananapenguin,R.drawable.bandanacat,R.drawable.blingmonkey,R.drawable.convictmonkey,
            R.drawable.goldenmonkey,R.drawable.leopardmonkey,R.drawable.nyancat,R.drawable.samuraipenguin,R.drawable.coolpenguin,R.drawable.whitecat};
    String[] titleOfNFTs = {"Banana Penguin", "Bandana Cat", "Bling Monkey", "Convict Monkey", "Golden Monkey", "Leopard Monkey", "Nyan Cat", "Samurai Penguin","White Cat","Cool Penguin"};
    String[] NFTRarity = {"Legendary", "Common", "Epic", "Common","Legendary", "Common","Legendary","Epic","Common","Epic"};
    public static int[] NFTPrice = {1750,375,850,150,2000,475,1500,750,250,875};
    int index = 0;
    public static int dayCounter = 1;
    public static int balance = 1000;
    int [] boughtNFTs = MainActivity6.getBoughtNFTs();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ImageButton firstNFT = (ImageButton) findViewById(R.id.imageButton13);
        ImageButton secondNFT = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton thirdNFT = (ImageButton) findViewById(R.id.imageButton12);
        ImageButton fourthNFT = (ImageButton) findViewById(R.id.imageButton11);

        firstNFT.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                index = 0;
                MainActivity6(index);
            }
        });
        secondNFT.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                index = 1;
                MainActivity6(index);
            }
        });
        thirdNFT.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                index = 2;
                MainActivity6(index);
            }
        });
        fourthNFT.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                index = 3;
                MainActivity6(index);
            }
        });
        TextView dayCount = (TextView) findViewById(R.id.textView39);
        dayCount.setText("Day #" +dayCounter);

        TextView accountValue = (TextView) findViewById(R.id.textView33);
        accountValue.setText("Balance: $" +balance);

        TextView firstNFTTitle = (TextView) findViewById(R.id.textView7);
        firstNFTTitle.setText(titleOfNFTs[0]);

        TextView aboutFirstNFT = (TextView) findViewById(R.id.textView16);
        aboutFirstNFT.setText("Rarity: " +NFTRarity[0]);

        ImageView nftTOP = (ImageView) findViewById(R.id.imageButton13);
        nftTOP.setImageResource(images[0]);

        TextView firstNFTPrice = (TextView) findViewById(R.id.textView34);
        firstNFTPrice.setText(""+NFTPrice[0]);

        //second nft
        TextView secondNFTTitle = (TextView) findViewById(R.id.textView18);
        secondNFTTitle.setText(titleOfNFTs[1]);

        TextView aboutSecondNFT = (TextView) findViewById(R.id.textView17);
        aboutSecondNFT.setText("Rarity: " +NFTRarity[1]);

        ImageView nftTWO = (ImageView) findViewById(R.id.imageButton2);
        nftTWO.setImageResource(images[1]);

        TextView secondNFTPrice = (TextView) findViewById(R.id.textView35);
        secondNFTPrice.setText(""+NFTPrice[1]);

       //third nft
        TextView thirdNFTTitle = (TextView) findViewById(R.id.textView19);
        thirdNFTTitle.setText(titleOfNFTs[2]);

        TextView aboutThirdNFT = (TextView) findViewById(R.id.textView20);
        aboutThirdNFT.setText("Rarity: " +NFTRarity[2]);

        ImageView nftTHREE = (ImageView) findViewById(R.id.imageButton12);
        nftTHREE.setImageResource(images[2]);

        TextView thirdNFTPrice = (TextView) findViewById(R.id.textView36);
        thirdNFTPrice.setText(""+NFTPrice[2]);

        //fourth NFT
        TextView fourthNFTTitle = (TextView) findViewById(R.id.textView21);
        fourthNFTTitle.setText(titleOfNFTs[3]);

        TextView aboutfourthNFT = (TextView) findViewById(R.id.textView22);
        aboutfourthNFT.setText("Rarity: " + NFTRarity[3]);

        ImageView nftFOUR = (ImageView) findViewById(R.id.imageButton11);
        nftFOUR.setImageResource(images[3]);

        TextView fourthNFTPrice = (TextView) findViewById(R.id.textView37);
        fourthNFTPrice.setText(""+NFTPrice[3]);

        Button nextDay = (Button) findViewById(R.id.refreshPrices);
        Button nextPage = (Button) findViewById(R.id.nextpage);
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
                MainActivity7();
            }
        });
        nextDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dayCounter++;
                refreshPrices(NFTPrice);
            }
        });
    }
    public void MainActivity7(){
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
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

    public void refreshPrices(int[] whatever){
        int upOrDown = 0;
        int changePrice = 0;
        for (int i = 0; i != whatever.length; i++){
            changePrice = 0;
            if (NFTRarity[i].equals("Common")){ // If the NFT's rarity is common then price can change from 1 - 50
                changePrice = (int)(Math.random() * 50 + 1);
            }
            else if (NFTRarity[i].equals("Epic")){ // If the NFT's rarity is epic then price can change from 50 - 250
                changePrice = (int)(Math.random() * 250 + 50);
            }
            else if (NFTRarity[i].equals("Legendary")){ // If the NFT's rarity is legendary then price can change from 250 - 500
                changePrice = (int)(Math.random() * 500 + 250);
            }

            // Positive or negative
            upOrDown = (int)(Math.random() * 2 + 1); // Random number between 1 - 2
            if (upOrDown == 1){ // If upOrDown equals 1 then add
                whatever[i] = (int) (whatever[i] + changePrice);
            }
            else if (upOrDown == 2){ // If upOrDown equals 2 then subtract
                whatever[i] = (int) (whatever[i] - changePrice);
                if ((whatever[i] - changePrice < 0)){ // If the price drops below 0 set to 5
                    whatever[i] = 5;
                }
            }
            if (boughtNFTs[i] == 1 && upOrDown == 1){
                balance += changePrice;
            }
            if (boughtNFTs[i] == 1 && upOrDown == 2){
                balance -= changePrice;
            }
            if (balance >= 3000){
                Intent intent = new Intent(this, MainActivity9.class);
                startActivity(intent);
            }
        }

        TextView firstNFTPrice = (TextView) findViewById(R.id.textView34);
        firstNFTPrice.setText(""+NFTPrice[0]);

        TextView secondNFTPrice = (TextView) findViewById(R.id.textView35);
        secondNFTPrice.setText(""+NFTPrice[1]);

        TextView thirdNFTPrice = (TextView) findViewById(R.id.textView36);
        thirdNFTPrice.setText(""+NFTPrice[2]);

        TextView fourthNFTPrice = (TextView) findViewById(R.id.textView37);
        fourthNFTPrice.setText(""+NFTPrice[3]);

        TextView dayCount = (TextView) findViewById(R.id.textView39);
        dayCount.setText("Day #" +dayCounter);

        TextView accountValue = (TextView) findViewById(R.id.textView33);
        accountValue.setText("Balance: $" +balance);

    }
    public static int[] getNFTPrices(){
        return NFTPrice;
    }
    public static int getDayCounter(){
        return dayCounter;
    }
    public static int getBalance(){
        return balance;
    }

}

