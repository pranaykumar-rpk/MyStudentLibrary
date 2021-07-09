package com.ballebaaz.mystudentlibrary.Activities;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ballebaaz.mystudentlibrary.R;
import com.ballebaaz.mystudentlibrary.databinding.ActivityBranchesListBinding;

public class BranchesListActivity extends AppCompatActivity {
    private ActivityBranchesListBinding activityBranchesListBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityBranchesListBinding= DataBindingUtil.setContentView(this,R.layout.activity_branches_list);
    }
}
