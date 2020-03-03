package com.windfallsheng.modulerecom;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.windfallsheng.libbase.utils.RouteUtils;

@Route(path = RouteUtils.Recom_Fragment_Main)
public class MainFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recom, null);
        TextView tv = (TextView) view.findViewById(R.id.classname);
        tv.setText(this.getClass().getName());
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}