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

    public int setCurrentCountA() {
        clickCountA++;
        return clickCountA;
    }

    public int setCurrentCountB() {
        clickCountB++;
        return clickCountB;
    }
}
