package com.windfallsheng.modulechat.module_service;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.windfallsheng.libbase.provider.IChatModuleService;
import com.windfallsheng.libbase.utils.RouteUtils;
import com.windfallsheng.modulechat.net.ChatService;

@Route(path = RouteUtils.Service_Chat)
public class ChatModuleService implements IChatModuleService {

    @Override
    public String getUserName(String userId) {
        return ChatService.getUserName() + "#" + this.getClass().getName();
    }

    @Override
    public void init(Context context) {

    }
}
