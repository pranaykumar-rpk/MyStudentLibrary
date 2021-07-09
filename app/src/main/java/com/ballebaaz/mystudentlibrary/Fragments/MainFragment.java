package com.ballebaaz.mystudentlibrary.Fragments;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ballebaaz.mystudentlibrary.Activities.BranchesListActivity;
import com.ballebaaz.mystudentlibrary.ViewModelProviders.ViewModelFactory;
import com.ballebaaz.mystudentlibrary.ViewModels.MainViewModel;
import com.ballebaaz.mystudentlibrary.databinding.MainFragmentBinding;
import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.IdpResponse;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Arrays;
import java.util.List;

import static android.app.Activity.RESULT_OK;

public class MainFragment extends Fragment {
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener  mAuthStateListener;
    private final int RC_SIGN_IN = 123;
    private final List<AuthUI.IdpConfig> providers = Arrays.asList(
            new AuthUI.IdpConfig.PhoneBuilder().build(),
            new AuthUI.IdpConfig.GoogleBuilder().build());

    public static MainFragment getINSTANCE() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        MainFragmentBinding mainFragmentBinding= MainFragmentBinding.inflate(inflater,container,false);
        final MainViewModel mViewModel;
        ViewModelFactory viewModelFactory = ViewModelFactory.getInstance();
        mViewModel = ViewModelProviders.of(this,viewModelFactory).get(MainViewModel.class);
        mainFragmentBinding.setViewModel(mViewModel);
        mAuth=FirebaseAuth.getInstance();
        mAuthStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if(user != null){

                }else{
                    startActivityForResult(
                            AuthUI.getInstance()
                                    .createSignInIntentBuilder()
                                    .setAvailableProviders(providers)
                                    .build(),
                            RC_SIGN_IN);
                }
            }
        };

        mViewModel.getGotoMainActivity().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                startActivity(new Intent(getActivity(),BranchesListActivity.class));
            }
        });

        return mainFragmentBinding.getRoot();
    }

     public void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(mAuthStateListener);
    }

    @Override
        public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == RC_SIGN_IN){
            IdpResponse response = IdpResponse.fromResultIntent(data);
        }
        if (requestCode == RESULT_OK){
            FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        }
        else{

        }
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

}
