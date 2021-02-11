package com.gowtham.viewmodel;


import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private int clickCountA = 0;
    private int clickCountB = 0;

    public int getInitialCountA() {
        return clickCountA;
    }

    public int getInitialCountB() {
        return clickCountB;
    }

    public int getCurrentCountA() {
        clickCountA++;
        return clickCountA;
    }

    public int getCurrentCountB() {
        clickCountB++;
        return clickCountB;
    }
}
