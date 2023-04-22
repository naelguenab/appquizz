package com.example.myquizzapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView totalQuestionsTextView;
    TextView GoodAnswersTextView;
    TextView questionTextView;
    Button ansA,ansB,ansC,ansD;
    Button submitbtn;

    int score =0;
    int totalQuestion = QuestionAnswer.questionAnswer.question.length;
    int currentQuestionIndex =0;
    String selectedAnswer ="";




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        totalQuestionsTextView = findViewById(R.id.total_question);
        GoodAnswersTextView = findViewById(R.id.good_answers);
        questionTextView = findViewById(R.id.question);
        ansA = findViewById(R.id.ans_A);
        ansB = findViewById(R.id.ans_B);
        ansC = findViewById(R.id.ans_C);
        ansD = findViewById(R.id.ans_D);
        submitbtn = findViewById(R.id.submit_btn);


        ansA.setOnClickListener(submitOnclickList);
        ansB.setOnClickListener(submitOnclickList);
        ansC.setOnClickListener(submitOnclickList);
        ansD.setOnClickListener(submitOnclickList);
        submitbtn.setOnClickListener(this);

        totalQuestionsTextView.setText("Total question : "+totalQuestion);

        loadNewQuestion();

    }

    @Override
    public void onClick(View view) {

    }

    void loadNewQuestion(){
        GoodAnswersTextView.setText("Good answers : "+ score);
        questionTextView.setText(QuestionAnswer.questionAnswer.question[currentQuestionIndex]);
        ansA.setText(QuestionAnswer.questionAnswer.choices[currentQuestionIndex][0]);
        ansB.setText(QuestionAnswer.questionAnswer.choices[currentQuestionIndex][1]);
        ansC.setText(QuestionAnswer.questionAnswer.choices[currentQuestionIndex][2]);
        ansD.setText(QuestionAnswer.questionAnswer.choices[currentQuestionIndex][3]);

    }

    private  View.OnClickListener submitOnclickList = view -> {
        String answer = "";
        switch(view.getId()){
            case R.id.ans_A: answer = (String) ansA.getText();break;
            case R.id.ans_B: answer = (String) ansB.getText();break;
            case R.id.ans_C: answer = (String) ansC.getText();break;
            case R.id.ans_D: answer = (String) ansD.getText();break;
        }

        if (QuestionAnswer.questionAnswer.correctAnswers[currentQuestionIndex].equals(answer)){
            ++score;
            ++currentQuestionIndex;
            loadNewQuestion();
        }
    };

}