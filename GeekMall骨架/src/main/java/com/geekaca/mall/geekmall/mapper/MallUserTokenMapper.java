package com.geekaca.mall.geekmall.mapper;

import com.geekaca.mall.geekmall.domain.MallUserToken;

/**
* @author ytdag
* @description 针对表【tb_newbee_mall_user_token】的数据库操作Mapper
* @createDate 2023-07-14 20:17:03
* @Entity com.geekaca.mall.geekmall.domain.MallUserToken
*/
public interface MallUserTokenMapper {

    int deleteByPrimaryKey(Long id);

    int insert(MallUserToken record);

    int insertSelective(MallUserToken record);

    MallUserToken selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MallUserToken record);

    int updateByPrimaryKey(MallUserToken record);

}
