package com.windfallsheng.modulechat.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.windfallsheng.libbase.utils.RouteUtils;
import com.windfallsheng.modulechat.R;

@Route(path = RouteUtils.Chat_ForResult)
public class ForResultActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * finish
     */
    private Button mFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_result);
        initView();
    }

    private void initView() {
        mFinish = (Button) findViewById(R.id.finish);
        TextView tv = (TextView) findViewById(R.id.classname);
        tv.setText(this.getClass().getName());
        mFinish.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.finish) {
            Intent intent = new Intent();
            intent.putExtra("name", "ForResult返回的数据#" + this.getClass().getName());
            setResult(999, intent);
            finish();
        } else {
        }
    }
}
