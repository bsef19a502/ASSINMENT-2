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

public class QuizModule extends AppCompatActivity implements View.OnClickListener{

    TextView totalQuestionsTextView;
    ImageView imageView;
    Button ansA, ansB, ansC, ansD;
    Button nextBtn;

    int score=0;
    int[] totalQuestion = QuestionAnswer.images;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalQuestionsTextView = findViewById(R.id.textView1);
        imageView = findViewById(R.id.imageView1);
        ansA = findViewById(R.id.option_1);
        ansB = findViewById(R.id.option_2);
        ansC = findViewById(R.id.option_3);
        ansD = findViewById(R.id.option_4);
        nextBtn = findViewById(R.id.btn_next);

        imageView.setOnClickListener(this);
        ansA.setOnClickListener(this);
        ansB.setOnClickListener(this);
        ansC.setOnClickListener(this);
        ansD.setOnClickListener(this);
        nextBtn.setOnClickListener(this);

        totalQuestionsTextView.setText("Total questions : "+totalQuestion);

        loadNewQuestion();

    }

    @Override
    public void onClick(View view) {

        ansA.setBackgroundColor(Color.WHITE);
        ansB.setBackgroundColor(Color.WHITE);
        ansC.setBackgroundColor(Color.WHITE);
        ansD.setBackgroundColor(Color.WHITE);

        Button clickedButton = (Button) view;
        if(clickedButton.getId()==R.id.btn_next){
            if(selectedAnswer.equals(correctAnswers[currentQuestionIndex])){
                score++;
            }
            currentQuestionIndex++;
            loadNewQuestion();


        }else{
            //choices button clicked
            selectedAnswer  = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.MAGENTA);

        }

    }

    void loadNewQuestion(){

        if(currentQuestionIndex == totalQuestion ){
            finishQuiz();
            return;
        }

        //imageView.setImageResource(R.);
        ansA.setText(choices[currentQuestionIndex][0]);
        ansB.setText(choices[currentQuestionIndex][1]);
        ansC.setText(choices[currentQuestionIndex][2]);
        ansD.setText(choices[currentQuestionIndex][3]);

    }

    void finishQuiz(){
        String passStatus = "";
        if(score > totalQuestion*0.60){
            passStatus = "Hurray! You passed! :)";
        }else{
            passStatus = "OOPS! SORRY YOU ARE FAILED THE QUIZ!";
        }

        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("Score is "+ score+" out of "+ totalQuestion)
                .setPositiveButton("Restart",(dialogInterface, i) -> restartQuiz() )
                .setCancelable(false)
                .show();


    }

    void restartQuiz(){
        score = 0;
        currentQuestionIndex =0;
        loadNewQuestion();
    }

}