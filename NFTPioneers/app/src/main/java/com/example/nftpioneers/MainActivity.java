package com.example.nftpioneers;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

/**
 * MainActivity.java & activity_main.xml = Welcome Screen page
 * MainMenu.java & activity_main2.xml = Main Menu page
 * MainActivity3.java & activity_main3.xml = Discover NFT's page
 * MainActivity4.java & activity_main4.xml = View Current NFT Holdings page
 * MainActivity5.java & activity_main5.xml = View Instructions page
 * MainActivity6.
 */
public class MainActivity extends AppCompatActivity {
    EditText mEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.test1);
        button.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                mEdit = (EditText)findViewById(R.id.editTextTextPersonName);
                MainActivity2();
            }
        });
    }
    public void MainActivity2(){
        Intent intent = new Intent(this, MainActivity2.class);
        //String name = mEdit;
        //intent.putExtra("name", name);
        startActivity(intent);
    }
}