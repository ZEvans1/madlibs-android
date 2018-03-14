package com.example.guest.madlib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import butterknife.ButterKnife;
import butterknife.BindView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.buttonMadLib) Button mButtonMadLib;
    @BindView(R.id.adjective) EditText mEditAdjective;
    @BindView(R.id.verb) EditText mEditVerb;
    @BindView(R.id.noun) EditText mEditNoun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mButtonMadLib.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == mButtonMadLib) {
            String noun = mEditNoun.getText().toString();
            String adjective = mEditAdjective.getText().toString();
            String verb = mEditVerb.getText().toString();

            Intent intent = new Intent(MainActivity.this, MadLibActivity.class);

            intent.putExtra("noun", noun);
            intent.putExtra("adjective", adjective);
            intent.putExtra("verb", verb);

            startActivity(intent);

        }
    }
}
