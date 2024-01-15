package com.example.kingsleague.ui.menu;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class menuViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public menuViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("hola mundo");
    }

    public LiveData<String> getText() {
        return mText;
    }
}