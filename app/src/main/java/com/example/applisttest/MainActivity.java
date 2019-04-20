package com.example.applisttest;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.example.applisttest.adapters.StoreListAdapter;
import com.example.applisttest.databinding.ActivityMainBinding;
import com.example.applisttest.datas.StoreList;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding act;
    List<StoreList> storeArrayList = new ArrayList<>();
    StoreListAdapter storeListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         act = DataBindingUtil.setContentView(this, R.layout.activity_main);

         setupEvents();
         fillList();
         setValues();
         bindViews();
    }

    void setupEvents(){

    }

    void fillList(){
        storeArrayList.add(new StoreList("Google", "Google Inc.", 4.4, true));
        storeArrayList.add(new StoreList("Chrome Browser - Google", "Google Inc.", 4.2, true));
        storeArrayList.add(new StoreList("Google+", "Google Inc.", 4.2, false));
        storeArrayList.add(new StoreList("Android System WebView", "Google Inc.", 4.3, true));
        storeArrayList.add(new StoreList("Google Play Games", "Google Inc.", 4.5, false));
        storeArrayList.add(new StoreList("Google Text-to-speech", "Google Inc.", 4.0, true));
        storeArrayList.add(new StoreList("Google", "Google Inc.", 4.4, true));
        storeArrayList.add(new StoreList("Chrome Browser - Google", "Google Inc.", 4.2, true));
        storeArrayList.add(new StoreList("Google+", "Google Inc.", 4.2, false));
        storeArrayList.add(new StoreList("Android System WebView", "Google Inc.", 4.3, true));
        storeArrayList.add(new StoreList("Google Play Games", "Google Inc.", 4.5, false));
        storeArrayList.add(new StoreList("Google Text-to-speech", "Google Inc.", 4.0, true));
    }

    void setValues(){

        storeListAdapter = new StoreListAdapter(MainActivity.this, storeArrayList);
        act.storeListView.setAdapter(storeListAdapter);

    }

    void bindViews(){

    }

}
