package org.haqnawaz.mylearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);


        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startLearning();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                AttemptQuiz();
            }
        });


        btn3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)

            {
                Repository();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)

            {
                CustomizedLearning();
            }
        });
    }
    public void startLearning()
    {
        Intent learnIntent = new Intent(this, LearningModule.class);
        startActivity(learnIntent);
    }

    public void AttemptQuiz()
    {
        Intent quizIntent = new Intent(this, QuizModule.class);
        startActivity(quizIntent);
    }

    public void Repository()
    {
         Intent RepoIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://github.com/bsef19a502/ASSINMENT-2"));
         startActivity(RepoIntent);
    }


    public void CustomizedLearning()
    {
        Intent customIntent = new Intent(this, MainActivity2.class);
        startActivity(customIntent);
    }
}