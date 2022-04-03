package com.example.nftpioneers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button discoverNFTButton = (Button) findViewById(R.id.discoverNFT);
        Button viewHoldingsButton = (Button) findViewById(R.id.viewHoldings);
        Button viewInstructionsButton  = (Button) findViewById(R.id.viewInstructions);

        discoverNFTButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                MainActivity3();
            }
        });
        viewHoldingsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                MainActivity4();
            }
        });
        viewInstructionsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                MainActivity5();
            }
        });
    }
    public void MainActivity3(){
        Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
    public void MainActivity4(){
        Intent intent = new Intent(this,MainActivity4.class);
        startActivity(intent);
    }
    public void MainActivity5(){
        Intent intent = new Intent(this,MainActivity5.class);
        startActivity(intent);
    }
}