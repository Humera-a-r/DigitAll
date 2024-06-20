package com.example.digitall.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;

import com.example.digitall.R;
import com.example.digitall.UI.AgriTech.AdministrationFragment;
import com.example.digitall.UI.AgriTech.FarmManagementFragment;
import com.example.digitall.UI.AgriTech.TechnologyFragment;
import com.example.digitall.UI.Telehealth.AccountManagementFragment;
import com.example.digitall.UI.Telehealth.AppointmentBookingFragment;
import com.example.digitall.UI.Telehealth.EducationResourcesFragment;
import com.example.digitall.UI.Telehealth.HealthTrackingFragment;
import com.example.digitall.UI.Telehealth.MessagingChatFragment;
import com.example.digitall.UI.Telehealth.PrescriptionManagementFragment;
import com.example.digitall.UI.Telehealth.SymptomCheckerFragment;
import com.example.digitall.UI.Telehealth.VideoConsultationFragment;
import com.example.digitall.databinding.TelehealthFragmentBinding;

public class TelehealthFragment extends DialogFragment implements View.OnClickListener {
    TelehealthFragmentBinding telehealthFragmentBinding;
    private Button accountManagementButton;
    private Button symptomCheckerButton;
    private Button appointmentBookingButton;
    private Button videoConsultationsButton;
    private Button messagingButton;
    private Button prescriptionManagementButton;
    private Button healthTrackingButton;
    private Button educationResourcesButton;

    public static TelehealthFragment newInstance(){
        return new TelehealthFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        telehealthFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.telehealth_fragment, container,false);
        View telehealthView = telehealthFragmentBinding.getRoot();
        configureViewFinding();
        return telehealthView;
    }
    private void configureViewFinding() {
        AppCompatImageView imageBack = telehealthFragmentBinding.imageBack;
        imageBack.setOnClickListener(v -> dismiss());
        accountManagementButton  = telehealthFragmentBinding.accountManagementButton;
        accountManagementButton.setOnClickListener(this);
        symptomCheckerButton  = telehealthFragmentBinding.symptomCheckerButton;
        symptomCheckerButton.setOnClickListener(this);
        appointmentBookingButton  = telehealthFragmentBinding.appointmentBookingButton;
        appointmentBookingButton.setOnClickListener(this);
        videoConsultationsButton  = telehealthFragmentBinding.videoConsultationsButton;
        videoConsultationsButton.setOnClickListener(this);
        messagingButton  = telehealthFragmentBinding.messagingButton;
        messagingButton.setOnClickListener(this);
        prescriptionManagementButton  = telehealthFragmentBinding.prescriptionManagementButton;
        prescriptionManagementButton.setOnClickListener(this);
        healthTrackingButton  = telehealthFragmentBinding.healthTrackingButton;
        healthTrackingButton.setOnClickListener(this);
        educationResourcesButton  = telehealthFragmentBinding.educationResourcesButton;
        educationResourcesButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == accountManagementButton.getId()){
            DialogFragment accountmanagement = AccountManagementFragment.newInstance();
            accountmanagement.setArguments(new Bundle());
            accountmanagement.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
            accountmanagement.show(getChildFragmentManager(), "Telehealth Fragment");
        } else if (view.getId() == symptomCheckerButton.getId()) {
            DialogFragment symptom = SymptomCheckerFragment.newInstance();
            symptom.setArguments(new Bundle());
            symptom.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
            symptom.show(getChildFragmentManager(), "Symptom checker");

        }else if (view.getId() == appointmentBookingButton.getId()) {
            DialogFragment appointment = AppointmentBookingFragment.newInstance();
            appointment.setArguments(new Bundle());
            appointment.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
            appointment.show(getChildFragmentManager(), "Appointment Booking");

        }else if (view.getId() == videoConsultationsButton.getId()) {
            DialogFragment video = VideoConsultationFragment.newInstance();
            video.setArguments(new Bundle());
            video.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
            video.show(getChildFragmentManager(), "Administration Module");

        }else if (view.getId() == messagingButton.getId()) {
            DialogFragment messaging = MessagingChatFragment.newInstance();
            messaging.setArguments(new Bundle());
            messaging.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
            messaging.show(getChildFragmentManager(), "Messaging module");

        }else if (view.getId() == prescriptionManagementButton.getId()) {
            DialogFragment prescription = PrescriptionManagementFragment.newInstance();
            prescription.setArguments(new Bundle());
            prescription.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
            prescription.show(getChildFragmentManager(), "Prescription Management");

        }else if (view.getId() == healthTrackingButton.getId()) {
            DialogFragment healthtrack = HealthTrackingFragment.newInstance();
            healthtrack.setArguments(new Bundle());
            healthtrack.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
            healthtrack.show(getChildFragmentManager(), "Health Track");

        }else if (view.getId() == educationResourcesButton.getId()) {
            DialogFragment education = EducationResourcesFragment.newInstance();
            education.setArguments(new Bundle());
            education.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
            education.show(getChildFragmentManager(), "Education Resource   ");

        }


    }
}
