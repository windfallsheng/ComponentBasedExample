package com.windfallsheng.moduleme;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.windfallsheng.libbase.bean.EventBusBean;
import com.windfallsheng.libbase.bean.JavaBean;
import com.windfallsheng.libbase.utils.RouteUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Route(path = RouteUtils.Me_Fragment_Main)
public class MainFragment extends Fragment implements View.OnClickListener {

    /**
     * 依赖注入
     */
    private Button mAutoInject;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_me, null);
        initView(view);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    private void initView(View view) {
        mAutoInject = (Button) view.findViewById(R.id.autoInject);
        mAutoInject.setOnClickListener(this);
        TextView tv = (TextView) view.findViewById(R.id.classname);
        tv.setText(this.getClass().getName());
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        if (i == R.id.autoInject) {
            /**
             * 序列化过得
             * 必须先初始化JsonServiceImpl实现SerializationService
             */
            EventBusBean eventBusBean = new EventBusBean();
            eventBusBean.setProject("android");
            eventBusBean.setNum(3);
            /**
             * 普通的javaBean
             */
            JavaBean javaBean = new JavaBean();
            javaBean.setName("windfallsheng");
            javaBean.setAge(25);

            List<JavaBean> objList = new ArrayList<>();
            objList.add(javaBean);

            Map<String, List<JavaBean>> map = new HashMap<>();
            map.put("testMap", objList);

            ARouter.getInstance().build(RouteUtils.Me_Inject)
                    .withString("name", "老王")
                    .withInt("age", 18)
                    .withBoolean("boy", true)
                    .withLong("high", 180)
                    .withString("url", "https://www.baidu.com")
                    .withParcelable("pac", eventBusBean)
                    .withObject("obj", javaBean)
                    .withObject("objList", objList)
                    .withObject("map", map)
                    .navigation();
        } else {
        }
    }
}