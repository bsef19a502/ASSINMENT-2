package org.haqnawaz.mylearningapp;

import static org.haqnawaz.mylearningapp.QuestionAnswer.*;
import static org.haqnawaz.mylearningapp.QuestionAnswer.images;

import androidx.appcompat.app.AppCompatActivity;


import android.app.AlertDialog;
        import android.graphics.Color;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageView;
        import android.widget.TextView;

public class QuizModule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}