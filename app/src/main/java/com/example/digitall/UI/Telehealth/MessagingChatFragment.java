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
import com.example.digitall.databinding.MessagingChatFragmentBinding;

public class MessagingChatFragment extends DialogFragment {
    MessagingChatFragmentBinding messagingChatFragmentBinding;
    public static MessagingChatFragment newInstance() {
        return new MessagingChatFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        messagingChatFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.messaging_chat_fragment, container,false);
        View messageview = messagingChatFragmentBinding.getRoot();
        return messageview;
    }
}
