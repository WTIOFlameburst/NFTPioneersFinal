package com.example.nftpioneers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        TextView text = (TextView) findViewById(R.id.textView44);
        text.setText("Welcome settlers to NFTPioneers!\n" +
                "\n" +
                "NFTPioneers is a virtual simulator game that gives the experience of real world NFT trading\n" +
                "\n" +
                "Objective: To earn $3000 in the least days possible\n" +
                "\n" +
                "Instructions:\n" +
                "\n" +
                "The player starts with $1000 and each day decides to purchase a variety of NFTs. NFT's come in three different rarities, Common, Epic, and Legendary.\n" +
                "There are less Epic and Legendary NFTs and are more expensive than Commons. The rarer the NFT the bigger the price increase but watch out! They can also drop in price for the same amount!\n" +
                " Higher risk higher reward just like in real life. Each day the prices of NFTs change, once you reach a total of $3000 in assests you win the game!\n" +
                "\n" +
                "Good luck and happy trading our fellow pioneers!");
        Button mainMenu5 = (Button) findViewById(R.id.main_menu_5);
        mainMenu5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                MainActivity2();
            }
        });
    }
    public void MainActivity2(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}
