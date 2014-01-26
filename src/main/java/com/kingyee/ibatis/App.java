package com.kingyee.ibatis;

import java.io.InputStream;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.kingyee.ibatis.mapper.CmsAdminMapper;
import com.kingyee.ibatis.mapper.TestMapper;
import com.kingyee.ibatis.model.CmsAdmin;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        InputStream in = Resources.getResourceAsStream("MySqlMapConfig.xml");
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(in);
        
        SqlSession session = sf.openSession();
        CmsAdminMapper mapper = session.getMapper(CmsAdminMapper.class);
        
        CmsAdmin m = mapper.selectByPrimaryKey(43);
        System.out.println(m.getUsername());
    }
}
