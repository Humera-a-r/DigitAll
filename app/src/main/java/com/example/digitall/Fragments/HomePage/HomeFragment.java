package com.example.digitall.Fragments.HomePage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;

import com.example.digitall.Fragments.AgriTechFragment;
import com.example.digitall.Fragments.EcotourismFragment;
import com.example.digitall.Fragments.MoreFragment;
import com.example.digitall.Fragments.SettingsFragment;
import com.example.digitall.Fragments.SkillDevelopment;
import com.example.digitall.Fragments.SupplyChainFragment;
import com.example.digitall.Fragments.TelehealthFragment;
import com.example.digitall.Fragments.TipsFragment;
import com.example.digitall.Fragments.UpdatesFragment;
import com.example.digitall.Fragments.WaterManagmentFragment;
import com.example.digitall.R;
import com.example.digitall.UI.Authentication.DatabaseHelper;
import com.example.digitall.databinding.HomeFragmentBinding;

public class HomeFragment extends DialogFragment implements View.OnClickListener {
    HomeFragmentBinding homeFragmentBinding;
    private LinearLayout ecoTourismLayout;
    private LinearLayout supplyChainLayout;
    private LinearLayout agriTechLayout;
    private LinearLayout telehealthLayout;

    private LinearLayout skillDevLayout;
    private LinearLayout waterManagementLayout;
    private LinearLayout updatesLayout;
    private LinearLayout tipsLayout;
    private LinearLayout settingLayout;
    private LinearLayout moreDetailsLayout;
    private TextView textViewUser;
    DatabaseHelper databaseHelper;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        homeFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.home_fragment, container, false);
        View homeView = homeFragmentBinding.getRoot();

        configureViewElements();
        configureViewListeners();


        return homeView;
    }

    private void configureViewElements() {
        try {
            ecoTourismLayout = homeFragmentBinding.clickEcoTourism;
            supplyChainLayout = homeFragmentBinding.clickSupplyChain;
            agriTechLayout = homeFragmentBinding.clickAgriTech;
            telehealthLayout=homeFragmentBinding.clickTelehealth;
             skillDevLayout = homeFragmentBinding.clickSkillDev;
            waterManagementLayout = homeFragmentBinding.clickWaterManagement;
            updatesLayout = homeFragmentBinding.clickUpdates;
            tipsLayout = homeFragmentBinding.clickTips;
            settingLayout = homeFragmentBinding.clickSettings;
            moreDetailsLayout = homeFragmentBinding.clickMoreDetails;
            textViewUser = homeFragmentBinding.user;
            databaseHelper = new DatabaseHelper(getContext());

            // Find TextView


        } catch (Exception e) {
            Toast.makeText(getActivity(), "Something went wrong!", Toast.LENGTH_SHORT).show();
        }
    }

    private void configureViewListeners() {
        try {
            ecoTourismLayout.setOnClickListener(this);
            supplyChainLayout.setOnClickListener(this);
            agriTechLayout.setOnClickListener(this);
             skillDevLayout.setOnClickListener(this);
            waterManagementLayout.setOnClickListener(this);
            updatesLayout.setOnClickListener(this);
            tipsLayout.setOnClickListener(this);
            settingLayout.setOnClickListener(this);
            moreDetailsLayout.setOnClickListener(this);
            telehealthLayout.setOnClickListener(this);
        } catch (Exception e) {
            Toast.makeText(getActivity(), "Something went wrong!", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClick(View v) {
        try {
            if (v.getId() == ecoTourismLayout.getId()){
                DialogFragment ecoTourismFragment = EcotourismFragment.newInstance();
                ecoTourismFragment.setArguments(new Bundle());
                ecoTourismFragment.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
                ecoTourismFragment.show(getChildFragmentManager(), "Eco Tourism Fragment");
            } else if (v.getId() == supplyChainLayout.getId()){
                DialogFragment supplyChainFragment = SupplyChainFragment.newInstance();
                supplyChainFragment.setArguments(new Bundle());
                supplyChainFragment.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
                supplyChainFragment.show(getChildFragmentManager(), "Supply Chain Fragment");
            } else if (v.getId() == agriTechLayout.getId()){
                DialogFragment agriTechFragment = AgriTechFragment.newInstance();
                agriTechFragment.setArguments(new Bundle());
                agriTechFragment.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
                agriTechFragment.show(getChildFragmentManager(), "Agri Tech Fragment");
            }else if (v.getId() == telehealthLayout.getId()){
                DialogFragment  telehealthFragment = TelehealthFragment.newInstance();
                telehealthFragment.setArguments(new Bundle());
                telehealthFragment.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
                telehealthFragment.show(getChildFragmentManager(), "Telehealth Fragment");
            }
            else if (v.getId() == skillDevLayout.getId()){
                DialogFragment skillDevFragment = SkillDevelopment.newInstance();
                skillDevFragment.setArguments(new Bundle());
                skillDevFragment.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
                skillDevFragment.show(getChildFragmentManager(), "Skill Development Fragment");
            } else if (v.getId() == waterManagementLayout.getId()){
                DialogFragment waterMgmtFragment = WaterManagmentFragment.newInstance();
                waterMgmtFragment.setArguments(new Bundle());
                waterMgmtFragment.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
                waterMgmtFragment.show(getChildFragmentManager(), "Water Management Fragment");
            } else if (v.getId() == updatesLayout.getId()){
                DialogFragment updatesFragment = UpdatesFragment.newInstance();
                updatesFragment.setArguments(new Bundle());
                updatesFragment.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
                updatesFragment.show(getChildFragmentManager(), "Updates Fragment");
            } else if (v.getId() == tipsLayout.getId()){
                DialogFragment tipsFragment = TipsFragment.newInstance();
                tipsFragment.setArguments(new Bundle());
                tipsFragment.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
                tipsFragment.show(getChildFragmentManager(), "Tips Fragment");
            } else if (v.getId() == settingLayout.getId()){
               DialogFragment settingsFragment = SettingsFragment.newInstance();
                settingsFragment.setArguments(new Bundle());
                settingsFragment.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
                settingsFragment.show(getChildFragmentManager(), "Settings Fragment");
            } else if (v.getId() == moreDetailsLayout.getId()){
                DialogFragment moreDetailsFragment = MoreFragment.newInstance();
                moreDetailsFragment.setArguments(new Bundle());
                moreDetailsFragment.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
                moreDetailsFragment.show(getChildFragmentManager(), "More Details Fragment");
            }
        } catch (Exception e) {
            Toast.makeText(getActivity(), "Something went wrong!", Toast.LENGTH_SHORT).show();
        }
    }
//    private String fetchUserNameFromDatabase() {
//        String userName = "";
//        SQLiteDatabase db = DatabaseHelper.getReadableDatabase();
//        Cursor cursor = db.rawQuery("SELECT " + DatabaseHelper.COLUMN_FULLNAME + " FROM " + DatabaseHelper.TABLE_USERS, null);
//        if (cursor.moveToFirst()) {
//            userName = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_FULLNAME));
//        }
//        cursor.close();
//        return userName;
//    }
}
