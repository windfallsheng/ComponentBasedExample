package com.windfallsheng.libbase.route_service;

import com.alibaba.android.arouter.launcher.ARouter;
import com.windfallsheng.libbase.provider.IChatModuleService;


/**
 * <p>
 * 服务的发现
 */

public class ModuleRouteService {

    public static String getUserName(String userId) {
        IChatModuleService chatModuleService = ARouter.getInstance().navigation(IChatModuleService.class);
        if (chatModuleService != null) {
            return chatModuleService.getUserName(userId);
        }
        return "";
    }

}
