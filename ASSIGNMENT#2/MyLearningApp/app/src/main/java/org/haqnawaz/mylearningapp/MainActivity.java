package org.haqnawaz.mylearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startLearning();
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                attemptQuiz();
            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRepo();
            }
        });
    }

        public void startLearning()
        {
            Intent learnIntent = new Intent(this, LearningModule.class);
            startActivity(learnIntent);
        }

        public void attemptQuiz()
        {
            Intent quizIntent = new Intent(this, QuizModule.class);
            startActivity(quizIntent);
        }

        public void openRepo()
        {
            Intent RepoIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://github.com/bsef19a502/ASSINMENT-2"));
            startActivity(RepoIntent);
        }

}