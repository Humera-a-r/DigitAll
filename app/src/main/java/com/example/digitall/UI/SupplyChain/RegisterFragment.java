package com.example.digitall.UI.SupplyChain;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;

import com.example.digitall.R;
import com.example.digitall.UI.AgriTech.FarmManagementFragment;
import com.example.digitall.databinding.RegisterFragmentBinding;

public class RegisterFragment extends DialogFragment {
    RegisterFragmentBinding registerFragmentBinding;
    public static RegisterFragment newInstance() {
        return new RegisterFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        registerFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.register_fragment, container,false);
        View registerview = registerFragmentBinding.getRoot();
        return registerview;
    }
}
