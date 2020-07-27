package com.chl.redis;

/**
 * @author chl
 * @date 2020/5/23 10:37
 */
public class UserKey extends BasePrefix {
    public UserKey(String prefix) {
        super(prefix);
    }
    public static UserKey getByUsername=new UserKey("username");


}
