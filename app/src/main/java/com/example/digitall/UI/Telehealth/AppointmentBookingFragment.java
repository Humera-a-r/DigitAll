package com.example.digitall.UI.Telehealth;

import android.app.Dialog;
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
import com.example.digitall.databinding.AppointmentBookingFragmentBinding;

public class AppointmentBookingFragment extends DialogFragment {
    AppointmentBookingFragmentBinding appointmentBookingFragmentBinding;
    public static AppointmentBookingFragment newInstance() {
        return new AppointmentBookingFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        appointmentBookingFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.appointment_booking_fragment, container,false);
        View appointview = appointmentBookingFragmentBinding.getRoot();
        return appointview;
    }
}
