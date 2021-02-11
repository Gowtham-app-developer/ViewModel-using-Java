package com.gowtham.viewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private MainActivityViewModel mainViewModel;
    private TextView tvScoreA;
    private TextView tvScoreB;
    private Button btnPlayerA;
    private Button btnPlayerB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        // initialized ViewModel
        mainViewModel = ViewModelProviders.of(this).get(MainActivityViewModel.class);

        // set initial counter from view model
        tvScoreA.setText(String.valueOf(mainViewModel.getInitialCountA()));
        tvScoreB.setText(String.valueOf(mainViewModel.getInitialCountB()));

    }

    private void initView() {
        // initialized all views here
        tvScoreA = findViewById(R.id.tvScorePlayerA);
        tvScoreB = findViewById(R.id.tvScorePlayerB);
        btnPlayerA = findViewById(R.id.btnPlayerA);
        btnPlayerB = findViewById(R.id.btnPlayerB);
        btnPlayerA.setOnClickListener(this);
        btnPlayerB.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnPlayerA:
                //set current counter from view model
                tvScoreA.setText(String.valueOf(mainViewModel.getCurrentCountA()));
                break;
            case R.id.btnPlayerB:
                //set current counter from view model
                tvScoreB.setText(String.valueOf(mainViewModel.getCurrentCountB()));
                break;
            default:
        }
    }
}
