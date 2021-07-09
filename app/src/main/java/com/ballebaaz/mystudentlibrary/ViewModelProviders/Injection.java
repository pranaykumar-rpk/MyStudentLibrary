package com.ballebaaz.mystudentlibrary.ViewModelProviders;


import com.ballebaaz.mystudentlibrary.DataSources.LocalDataSource;
import com.ballebaaz.mystudentlibrary.DataSources.RemoteDataSource;
import com.ballebaaz.mystudentlibrary.Repository.Repository;

public class Injection {
    public static Repository provideRepository() {
        return Repository.getINSTANCE(RemoteDataSource.getINSTANCE(), LocalDataSource.getINSTANCE());
    }
}
