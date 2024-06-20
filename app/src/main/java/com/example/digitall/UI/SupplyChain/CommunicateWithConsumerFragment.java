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
import com.example.digitall.databinding.CommunicateWithConsumerFragmentBinding;

public class CommunicateWithConsumerFragment extends DialogFragment {
    CommunicateWithConsumerFragmentBinding communicateWithConsumerFragmentBinding;
    public static CommunicateWithConsumerFragment newInstance() {
        return new CommunicateWithConsumerFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        communicateWithConsumerFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.communicate_with_consumer_fragment, container,false);
        View communicate = communicateWithConsumerFragmentBinding.getRoot();
        return communicate;
    }
}
