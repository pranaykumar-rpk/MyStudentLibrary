package com.ballebaaz.mystudentlibrary.ViewModels;

import android.arch.lifecycle.ViewModel;

import com.ballebaaz.mystudentlibrary.Repository.Repository;
import com.ballebaaz.mystudentlibrary.ViewModelProviders.SingleLiveEvent;

public class MainViewModel extends ViewModel {

    //----------------------------------------------------------Single Live Events------------------------------------------------------//
    private SingleLiveEvent<String> gotoMainActivity = new SingleLiveEvent<>();
    //----------------------------------------------------------Single Live Events------------------------------------------------------//

    //----------------------------------------------------------getters------------------------------------------------------//
    public SingleLiveEvent<String> getGotoMainActivity() {
        return gotoMainActivity;
    }
    //----------------------------------------------------------getters------------------------------------------------------//

    private static String TAG="MainViewModel";
    private Repository repository;
    public MainViewModel(Repository repository) {
        this.repository = repository;
    }
    public void onClickedEnterButton(){
        gotoMainActivity.setValue("gotoMain");
    }
}

