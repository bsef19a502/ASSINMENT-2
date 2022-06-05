package org.haqnawaz.mylearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    ListView myList;
    String [] Alphabets = {"A", "B","C", "D", "E", "F", "G", "H", "I", "J", "K" , "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V" ,"W" , "X", "Y","Z"};
    int [] images = {R.drawable.apple, R.drawable.balloon, R.drawable.cat,R.drawable.ducky,R.drawable.elephant,R.drawable.fan,
            R.drawable.grapes, R.drawable.hat, R.drawable.icecream, R.drawable.jam,R.drawable.kite, R.drawable.lamp,R.drawable.mango,R.drawable.nose,
            R.drawable.orange,R.drawable.pencil,R.drawable.queen,R.drawable.rose,R.drawable.sun,R.drawable.tree,R.drawable.umbrella,R.drawable.voilen,R.drawable.watermelon, R.drawable.xray,R.drawable.yoyo,R.drawable.zip};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myList = findViewById(R.id.lstView);
        // ArrayAdapter <String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.activity_custom_list_view, R.id.textView, Alphabets);
        //myList.setAdapter(arrayAdapter);
        CustomAdapter arrayAdapter = new CustomAdapter(getApplicationContext(),Alphabets, images);
        myList.setAdapter(arrayAdapter);
    }
}