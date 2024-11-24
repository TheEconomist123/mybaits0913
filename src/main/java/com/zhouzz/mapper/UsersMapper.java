package com.zhouzz.mapper;

import com.zhouzz.pojo.Users;
import com.zhouzz.pojo.UsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;

public interface UsersMapper {
    long countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    int deleteByPrimaryKey(Long id);
    @SelectKey(statement = "SELECT user_seq.NEXTVAL FROM DUAL", keyProperty = "id", before = true, resultType = Long.class)
    int insert(Users row);

    int insertSelective(Users row);

    List<Users> selectByExampleWithBLOBs(UsersExample example);

    List<Users> selectByExample(UsersExample example);

    Users selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") Users row, @Param("example") UsersExample example);

    int updateByExampleWithBLOBs(@Param("row") Users row, @Param("example") UsersExample example);

    int updateByExample(@Param("row") Users row, @Param("example") UsersExample example);

    int updateByPrimaryKeySelective(Users row);

    int updateByPrimaryKeyWithBLOBs(Users row);

    int updateByPrimaryKey(Users row);

    int insertWithSequence(Users users);
}