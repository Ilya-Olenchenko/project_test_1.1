package com.example.project_test_11.ui.statistics;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StatisticsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public  StatisticsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is statistic fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}