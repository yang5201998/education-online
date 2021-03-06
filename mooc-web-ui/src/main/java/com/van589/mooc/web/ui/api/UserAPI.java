package com.van589.mooc.web.ui.api;

import com.van589.mooc.commons.utils.HttpClientUtils;
import com.van589.mooc.commons.utils.MapperUtils;
import com.van589.mooc.web.ui.dto.User;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户管理接口
 *
 */
public class UserAPI {

    /**
     * 登录
     * @param user
     * @return
     */
    public static User login(User user) throws Exception {
        List<BasicNameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("name", user.getName()));
        params.add(new BasicNameValuePair("password", user.getPassword()));

        String json = HttpClientUtils.doPost(API.API_USERS_LOGIN, params.toArray(new BasicNameValuePair[params.size()]));
        user = MapperUtils.json2pojoByTree(json, "data", User.class);
        return user;
    }
}
