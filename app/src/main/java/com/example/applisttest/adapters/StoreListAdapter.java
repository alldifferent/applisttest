package com.example.applisttest.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.applisttest.R;
import com.example.applisttest.datas.StoreList;

import java.util.ArrayList;
import java.util.List;

public class StoreListAdapter extends ArrayAdapter<StoreList> {

    Context mContext;
    List<StoreList> mList;
    LayoutInflater inf;

    public StoreListAdapter(Context context, List<StoreList> list){
        super(context, R.layout.store_list_item,list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);


    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View row = convertView;

        if (row == null){
            row = inf.inflate(R.layout.store_list_item, null);
        }

        TextView appNameTxt = row.findViewById(R.id.appNameTxt);
        TextView compNameTxt = row.findViewById(R.id.compNameTxt);
        TextView scoreTxt = row.findViewById(R.id.scoreTxt);
        TextView installTxt = row.findViewById(R.id.installTxt);

        StoreList storeList = mList.get(position);

        appNameTxt.setText(storeList.appName);
        compNameTxt.setText(storeList.coperName);

        String scoreStr = String.valueOf(storeList.score);

        scoreTxt.setText(scoreStr);

        if (storeList.appInstall == true){
            installTxt.setText("INSTALLED");
        }else{
            installTxt.setText("UNINSTALLED");
        }

        return row;

    }
}
