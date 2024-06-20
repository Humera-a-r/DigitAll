package com.example.digitall.Fragments;

import static android.content.ContentValues.TAG;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.digitall.Adapters.EcoTourismListAdapter;
import com.example.digitall.Models.EcoTourism.EcoTourismStateList;
import com.example.digitall.Models.EcoTourism.StateProducts;
import com.example.digitall.Models.EcoTourism.StateTouristPlaces;
import com.example.digitall.R;
import com.example.digitall.databinding.EcotourismFragmentBinding;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class EcotourismFragment extends DialogFragment {
    private EcotourismFragmentBinding ecotourismFragmentBinding;
    private RecyclerView ecoTourismRecyclerView;
    private TextView noRecord;
    private SearchView searchView;
    private List<EcoTourismStateList> ecoTourismStateList;

    public static EcotourismFragment newInstance(){
        return new EcotourismFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ecotourismFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.ecotourism_fragment, container, false);
        View tourView = ecotourismFragmentBinding.getRoot();

        configureViewFinding();
        addItemsFromJSON();

        return tourView;
    }

    private void configureViewFinding() {

        ecoTourismStateList = new ArrayList<>();
        AppCompatImageView imageBack = ecotourismFragmentBinding.imageBack;
        imageBack.setOnClickListener(v -> dismiss());

        ecoTourismRecyclerView = ecotourismFragmentBinding.ecoTourismRecycler;
        noRecord = ecotourismFragmentBinding.noRecordsFound;
        searchView = ecotourismFragmentBinding.searchView;

        ecoTourismRecyclerView.setHasFixedSize(true);
        ecoTourismRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if (newText.length() > 0 ){
                    List<EcoTourismStateList> searchList = new ArrayList<>();
                    for (EcoTourismStateList ecoTourismState : ecoTourismStateList){
                        if ((ecoTourismState.getName().toLowerCase(Locale.ROOT)).contains(newText.toLowerCase(Locale.ROOT)) ||
                        (ecoTourismState.getAbout().toLowerCase(Locale.ROOT)).contains(newText.toLowerCase(Locale.ROOT)) ||
                                (ecoTourismState.getClimate().toLowerCase(Locale.ROOT)).contains(newText.toLowerCase(Locale.ROOT)) ||
                                (ecoTourismState.getHistory().toLowerCase(Locale.ROOT)).contains(newText.toLowerCase(Locale.ROOT)) ||
                                (ecoTourismState.getTime().toLowerCase(Locale.ROOT)).contains(newText.toLowerCase(Locale.ROOT)) ||
                                (ecoTourismState.getFood().toLowerCase(Locale.ROOT)).contains(newText.toLowerCase(Locale.ROOT))){
                            searchList.add(ecoTourismState);
                        }
                    }
                    filteredList(searchList);
                }else {
                    bindToView();
                }
                return false;
            }
        });
    }

    private void bindToView() {
        try {
            if (ecoTourismStateList.isEmpty()){
                ecoTourismRecyclerView.setVisibility(View.GONE);
                noRecord.setVisibility(View.VISIBLE);
            }else {
                ecoTourismRecyclerView.setVisibility(View.VISIBLE);
                noRecord.setVisibility(View.GONE);

                EcoTourismListAdapter ecoTourismListAdapter = new EcoTourismListAdapter(getContext(), ecoTourismStateList);
                ecoTourismRecyclerView.setAdapter(ecoTourismListAdapter);
            }
        } catch (Exception e) {
            Toast.makeText(getActivity(), "Something went wrong!", Toast.LENGTH_SHORT).show();
        }
    }

    private void filteredList(List<EcoTourismStateList> searchList) {
        try {
            if (ecoTourismStateList.isEmpty()){
                ecoTourismRecyclerView.setVisibility(View.GONE);
                noRecord.setVisibility(View.VISIBLE);
            }else {
                ecoTourismRecyclerView.setVisibility(View.VISIBLE);
                noRecord.setVisibility(View.GONE);

                EcoTourismListAdapter ecoTourismListAdapter = new EcoTourismListAdapter(getContext(), searchList);
                ecoTourismRecyclerView.setAdapter(ecoTourismListAdapter);
            }
        } catch (Exception e) {
            Toast.makeText(getActivity(), "Something went wrong!", Toast.LENGTH_SHORT).show();
        }
    }


    private void addItemsFromJSON() {
        try {

            String jsonDataString = readJSONDataFromFile();
            JSONArray jsonArray = new JSONArray(jsonDataString);

            for (int i = 0; i < jsonArray.length(); ++i) {
                JSONObject itemObj = jsonArray.getJSONObject(i);

                String id = itemObj.getString("id");
                String name = itemObj.getString("name");
                String capital = itemObj.getString("capital");
                String about = itemObj.getString("about");
                String climate = itemObj.getString("climate");
                String history = itemObj.getString("history");
                String time = itemObj.getString("time");
                String food = itemObj.getString("food");
                JSONArray imgArr = itemObj.getJSONArray("img");
                JSONArray productsArray = itemObj.getJSONArray("products");
                JSONArray touristArray = itemObj.getJSONArray("tourist");

                // Convert JSONArray to String[]
                String[] imgArray = new String[imgArr.length()];
                for (int j = 0; j < imgArr.length(); j++) {
                    imgArray[j] = imgArr.getString(j);
                }

                // Convert JSONArray to List<StateProducts>
                List<StateProducts> productsList = new ArrayList<>();
                for (int j = 0; j < productsArray.length(); j++) {
                    JSONObject productObj = productsArray.getJSONObject(j);
                    String productName = productObj.getString("name");
                    String productDescription = productObj.getString("description");
                    String productImage = productObj.getString("image");
                    String productCategory = productObj.getString("category");
                    StateProducts product = new StateProducts(productName, productDescription, productImage, productCategory);
                    productsList.add(product);
                }

                // Convert JSONArray to List<StateTouristPlaces>
                List<StateTouristPlaces> touristList = new ArrayList<>();
                for (int j = 0; j < touristArray.length(); j++) {
                    JSONObject touristObj = touristArray.getJSONObject(j);
                    String touristName = touristObj.getString("name");
                    String touristInfo = touristObj.getString("info");
                    String touristImages = touristObj.getString("images");
                    String touristLocation = touristObj.getString("location");
                    StateTouristPlaces touristPlace = new StateTouristPlaces(touristName, touristInfo, touristImages, touristLocation);
                    touristList.add(touristPlace);
                }

                EcoTourismStateList holidays = new EcoTourismStateList(id, name, capital, about, climate, history,
                        time, food, imgArray, productsList, touristList);
                ecoTourismStateList.add(holidays);
                bindToView();
            }

        } catch (JSONException | IOException e) {
            Log.d(TAG, "addItemsFromJSON: ", e);
        }
    }

    private String readJSONDataFromFile() throws IOException {

        InputStream inputStream = null;
        StringBuilder builder = new StringBuilder();

        try {

            String jsonString = null;
            inputStream = getResources().openRawResource(R.raw.ecotourism);
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(inputStream, "UTF-8"));

            while ((jsonString = bufferedReader.readLine()) != null) {
                builder.append(jsonString);
            }

        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
        return new String(builder);
    }
}
