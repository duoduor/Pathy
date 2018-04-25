package com.wddMainTest;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.wdd.MongoTest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangduoduo on 2017/8/15.
 */
public class MainTest {
    public static void main( String[] args )
    {
        MongoTest mt = new MongoTest();
        //链接mongo
        MongoClient mongo=mt.getMongo();
        //数据库名
        String DbName= "wddMongoDB";
        //获取数据库DBName
        DB db =  mt.getDb(DbName);
        //集合名
        String collection = "school";
        //获取集合collection
        DBCollection table = mt.getTable(db,collection);

        /*
        //插入数据map   新增
        Map <String,Object> map = new HashMap<String, Object>();
         map.put("id",4);
         map.put("name","uu");
         map.put("age",18);
         map.put("sex",true);
         map.put("nickName","gg");
         mt.insert(map,table);
         */

        /*
         //查询
        BasicDBObject bdo = new BasicDBObject();
        //查询条件
        bdo.append("name","uu");
        bdo.append("nickName","gg");
        mt.search(bdo,table);
         */

        /*
         //修改
        BasicDBObject query = new BasicDBObject();
        BasicDBObject newDocument = new BasicDBObject();
        query.append("nickName","gg");//查的
        newDocument.append("nickName","cc"); //改的
        mt.update(query,newDocument,table);
        */

        /*
        //删
         BasicDBObject bdo = new BasicDBObject();
         bdo.append("nickName","cc");
         mt.delete(bdo,table);
         */
        System.out.println("----------");
        mt.showDb();
        System.out.println("==========");
        mt.showTables(db);


        System.out.println("执行完了吗");
    }
}
