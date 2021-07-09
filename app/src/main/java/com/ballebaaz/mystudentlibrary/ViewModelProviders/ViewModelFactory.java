package com.ballebaaz.mystudentlibrary.ViewModelProviders;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.ballebaaz.mystudentlibrary.ViewModels.MainViewModel;
import com.ballebaaz.mystudentlibrary.Repository.Repository;


public class ViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    private Repository repository;

    private ViewModelFactory(Repository repository) {
        this.repository = repository;
    }

    public static ViewModelFactory getInstance(){
        return new ViewModelFactory( Injection.provideRepository());
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(MainViewModel.class)){
            return (T) new MainViewModel(repository);
        }
        return super.create(modelClass);
    }
}
