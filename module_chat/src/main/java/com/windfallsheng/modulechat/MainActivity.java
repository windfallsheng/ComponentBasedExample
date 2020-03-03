package com.windfallsheng.modulechat;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.windfallsheng.libbase.utils.AppUtils;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        Log.d("MainActivity", "packageName=" + AppUtils.getPackageName(this));
    }

    private void initView() {
        TextView tv = (TextView) findViewById(R.id.classname);
        tv.setText(this.getClass().getName());
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.fl_main, new MainFragment())
                .commitAllowingStateLoss();
    }
}
