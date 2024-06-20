package com.example.digitall.UI.HomePage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;

import com.example.digitall.R;
import com.example.digitall.databinding.ChatbotFragmentBinding;

public class ChatBotFragment extends DialogFragment {
    ChatbotFragmentBinding chatbotFragmentBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        chatbotFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.chatbot_fragment, container, false);
        View chatView = chatbotFragmentBinding.getRoot();

        return chatView;
    }
}
