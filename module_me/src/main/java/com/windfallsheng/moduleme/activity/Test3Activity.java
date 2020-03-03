package com.windfallsheng.moduleme.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.windfallsheng.libbase.utils.RouteUtils;
import com.windfallsheng.moduleme.R;

@Route(path = RouteUtils.NeedLogin_Test3)
public class Test3Activity extends AppCompatActivity {

    /**
     * 数据接收页面
     */
    private TextView mTextView;
    /**
     * eventBus返回数据
     */
    private Button mBtnBackData;
    private String extra;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_bus);
        initData();
        initView();
    }

    private void initData() {
        extra = getIntent().getStringExtra("extra");

    }

    private void initView() {
        mTextView = (TextView) findViewById(R.id.textView);
        mBtnBackData = (Button) findViewById(R.id.btn_back_data);
        mBtnBackData.setText("finish");
        mBtnBackData.setVisibility(View.GONE);
        mTextView.setText("extra==>" + extra);
        TextView tv = (TextView) findViewById(R.id.classname);
        tv.setText(this.getClass().getName());
    }


}
