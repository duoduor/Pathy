package test.com.hand.mybatis.service;

import com.hand.mybatis.dto.FilmInfo;
import com.hand.mybatis.mapper.FilmInfoMapper;
import com.hand.mybatis.tools.DBTools;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Created by XIAOHAI on 2017/8/10.
 */
public class FilmInfoServiveTest {
    @Test
    public void findFilmInfo() throws Exception{
        SqlSession sqlSession = DBTools.getSession();
        FilmInfoMapper mapper = sqlSession.getMapper(FilmInfoMapper.class);
        try{
            FilmInfo filmInfo = mapper.findFilmInfo(1);
           String a = filmInfo.getFilmName();
           System.out.print(a);

            sqlSession.commit();
        }catch (Exception e){
            e.getStackTrace();
            sqlSession.rollback();
        }
    }
}

