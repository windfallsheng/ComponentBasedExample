package com.windfallsheng.moduleme.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.windfallsheng.libbase.utils.RouteUtils;
import com.windfallsheng.moduleme.R;


@Route(path = RouteUtils.Me_WebView)
public class WebViewActivity extends AppCompatActivity {

    private WebView mWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        initView();
    }

    private void initView() {
        TextView tv = (TextView) findViewById(R.id.classname);
        tv.setText(this.getClass().getName());
        mWebview = (WebView) findViewById(R.id.webview);
        mWebview.loadUrl(getIntent().getStringExtra("url"));
    }
}
