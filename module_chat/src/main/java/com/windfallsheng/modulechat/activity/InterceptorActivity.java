package com.windfallsheng.modulechat.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.windfallsheng.libbase.utils.RouteUtils;
import com.windfallsheng.modulechat.R;

@Route(path = RouteUtils.Chat_Interceptor)
public class InterceptorActivity extends AppCompatActivity {

    /**
     * eventBus数据接收页面
     */
    private TextView mTextView;
    private String extra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interceptor);
        initData();
        initView();
    }

    private void initData() {
        extra = getIntent().getStringExtra("extra");

    }

    private void initView() {
        TextView tv = (TextView) findViewById(R.id.classname);
        tv.setText(this.getClass().getName());
        mTextView = (TextView) findViewById(R.id.textView);
        mTextView.setText("extra==>" + extra + "#" + this.getClass().getName());
    }
}
