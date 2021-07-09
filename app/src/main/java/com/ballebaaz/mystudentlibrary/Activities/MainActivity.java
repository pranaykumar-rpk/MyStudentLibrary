package com.ballebaaz.mystudentlibrary.Activities;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ballebaaz.mystudentlibrary.Fragments.MainFragment;
import com.ballebaaz.mystudentlibrary.R;
import com.ballebaaz.mystudentlibrary.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding= DataBindingUtil.setContentView(this, R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().replace(R.id.mainContainer, MainFragment.getINSTANCE(),"Main Fragment").commit();
        }
}
