package com.hand.mybatis.mapper;

import com.hand.mybatis.dto.FilmInfo;

/**
 * Created by XIAOHAI on 2017/8/10.
 */
public interface FilmInfoMapper {
   FilmInfo findFilmInfo(int id) throws Exception;
}
