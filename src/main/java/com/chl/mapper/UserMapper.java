package com.chl.mapper;

import com.chl.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author chl
 * @date 2020/5/22 21:50
 */
@Mapper
public interface UserMapper {
    @Select("select * from user")
    public List<User> getAll();
}
