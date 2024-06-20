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
import com.example.digitall.databinding.VideoConsultationFragmentBinding;

public class VideoConsultationFragment extends DialogFragment {
    VideoConsultationFragmentBinding videoConsultationFragmentBinding;
    public static VideoConsultationFragment newInstance() {
        return new VideoConsultationFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        videoConsultationFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.video_consultation_fragment, container,false);
        View videoview = videoConsultationFragmentBinding.getRoot();
        return videoview;
    }
}
