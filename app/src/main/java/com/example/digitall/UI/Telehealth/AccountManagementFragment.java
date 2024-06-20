package com.example.digitall.UI.Telehealth;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;

import com.example.digitall.R;
import com.example.digitall.UI.SupplyChain.CommunicateWithConsumerFragment;
import com.example.digitall.databinding.AccountManagementFragmentBinding;

public class AccountManagementFragment extends DialogFragment {
    AccountManagementFragmentBinding accountManagementFragmentBinding;
    public static AccountManagementFragment newInstance() {
        return new AccountManagementFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        accountManagementFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.account_management_fragment, container,false);
        View accountview = accountManagementFragmentBinding.getRoot();
        return accountview;
    }
}
