package com.hand.mybatis.service;

import com.hand.mybatis.dto.FilmInfo;
import com.hand.mybatis.mapper.FilmInfoMapper;
import com.hand.mybatis.tools.DBTools;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by XIAOHAI on 2017/8/10.
 */
public class FilmInfoService {
    public void findFilmInfo() throws Exception{
        SqlSession sqlSession = DBTools.getSession();
        FilmInfoMapper mapper = sqlSession.getMapper(FilmInfoMapper.class);
      try{  FilmInfo filmInfo = mapper.findFilmInfo(1);
          System.out.print("=============================="+filmInfo.getFilmName());
        sqlSession.commit();
    }catch (Exception e){
          e.getStackTrace();
          sqlSession.rollback();
      }
    }
}
