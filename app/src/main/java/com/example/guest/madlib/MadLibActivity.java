package com.example.guest.madlib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.BindView;

public class MadLibActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.textViewMadLib) TextView mTextViewMadLib;
    @BindView(R.id.buttonBack) Button mButtonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madlibs);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String noun = intent.getStringExtra("noun");
        String adjective = intent.getStringExtra("adjective");
        String verb = intent.getStringExtra("verb");

        mTextViewMadLib.setText("Here is a noun, " + noun + ". Here is an adjective, " + adjective + ", and finally, mmmmmmmmmm here is a verb, " + verb + ".");

        mButtonBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mButtonBack) {
            Intent intent = new Intent(MadLibActivity.this, MainActivity.class);
            startActivity(intent);
        }
    }

}
