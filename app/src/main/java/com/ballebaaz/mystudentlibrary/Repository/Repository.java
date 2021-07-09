package com.ballebaaz.mystudentlibrary.Repository;


import com.ballebaaz.mystudentlibrary.DataSources.LocalDataSource;
import com.ballebaaz.mystudentlibrary.DataSources.RemoteDataSource;
import com.ballebaaz.mystudentlibrary.Interfaces.LocalSource;
import com.ballebaaz.mystudentlibrary.Interfaces.RemoteSource;

public class Repository implements LocalSource, RemoteSource {
    private static Repository INSTANCE;
    private RemoteDataSource remoteDataSource;
    private LocalDataSource localDataSource;
    public static Repository getINSTANCE(RemoteDataSource remoteDataSource, LocalDataSource localDataSource){
        if(INSTANCE == null)
            INSTANCE = new Repository(remoteDataSource,localDataSource);
        return INSTANCE;
    }
    private Repository(RemoteDataSource remoteDataSource, LocalDataSource localDataSource){
        this.localDataSource=localDataSource;
        this.remoteDataSource=remoteDataSource;
    }
}
