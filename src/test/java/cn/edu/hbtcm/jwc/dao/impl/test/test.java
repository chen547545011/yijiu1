package cn.edu.hbtcm.jwc.dao.impl.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.util.List;
import org.hibernate.Query;

import javax.sql.DataSource;
import javax.sql.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import cn.edu.hbtcm.jwc.dao.AcupointDao;
import cn.edu.hbtcm.jwc.dao.impl.AcupointDaoHibernate4;
import cn.edu.hbtcm.jwc.model.Acupoint;
import cn.edu.hbtcm.jwc.service.impl.DocManagerImpl;



//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class test extends AbstractJUnit4SpringContextTests {//  extends AbstractJUnit4SpringContextTests {
//	@Resource AcupointDao acupointDao;
	public static void main(String args[]) throws SQLException{
		/*ApplicationContext ctx =new ClassPathXmlApplicationContext("spring-hibernate1.xml");
		AcupointDao acupointDao=ctx.getBean("acupointDao", AcupointDao.class);
		List<Acupoint> ls=acupointDao.findAll(Acupoint.class);
		System.out.println(ls.size());
		for(int i=0;i<ls.size();i++){
			System.out.println(ls.get(i));
		}*/
		ApplicationContext ctx =new ClassPathXmlApplicationContext("spring-hibernate.xml");
		System.out.println("spring bean注入成功");
	}
//	
	@Test
	public void testBaen() throws Exception {
		ApplicationContext ctx =new ClassPathXmlApplicationContext("spring-hibernate.xml");
		System.out.println("spring bean注入成功");
	}
	
	@Test
	public void testDate() throws Exception {
		ApplicationContext ctx =new ClassPathXmlApplicationContext("spring-hibernate1.xml");
		//dataSource没问题
	    DataSource ds=ctx.getBean("dataSource", DataSource.class);
	    Connection conn = ds.getConnection();
//		 通过数据库连接获取PreparedStatement
		PreparedStatement pstmt = conn.prepareStatement(
			"insert into test values(?, ?)");
		pstmt.setInt(1, 1);
		pstmt.setString(2 , "疯狂Java地址：www.crazyit.org");
//		 执行SQL语句
		int t=pstmt.executeUpdate();
		if(t==0){
			System.out.println("插入失败");
		}
		else{
			System.out.println("插入成功");
		}
		pstmt.close();
		conn.close();
	}
	
	@Test
	public void testDate2() throws Exception {
		ApplicationContext ctx =new ClassPathXmlApplicationContext("spring-hibernate1.xml");
		//dataSource没问题
	    DataSource ds=ctx.getBean("dataSource", DataSource.class);
	    Connection conn = ds.getConnection();
//		 通过数据库连接获取Statement
		Statement pstmt = conn.createStatement();
		String sql="select * from test";
//		 执行SQL语句
		ResultSet rs=pstmt.executeQuery(sql);
//		System.out.println(rs.next());
		while(rs.next()){
			System.out.println("id="+rs.getInt(1)+"   password="+rs.getString(2));
		}
		rs.close();
		pstmt.close();
		conn.close();
	}
	
	@Test
	public void testdo() throws Exception {
//		 Session session=HibernateUtil.getSession();// get session
//			String hql="from Acupoint";// 命名参数 
//			Query  query = session.createQuery(hql); // create query object
//			System.out.println(query.list());
//			query.setString("name","apple");
//			List<Product> list=query.list();// get product if product's name=apple
//			for (Product product : list) {
//				// print product's info
//				System.out.println("name is:"+product.getName()+"\tQQ shenma is:"+product.getQq());
//			}
//			session.close();
//			HibernateUtil.closeSession();
		    
	}
	@Test
	public void testdo1()  throws Exception {
		ApplicationContext ctx =new ClassPathXmlApplicationContext("spring-hibernate1.xml");
		AcupointDao acupointDao=ctx.getBean("acupointDao", AcupointDao.class);
		List<Acupoint> ls=acupointDao.findAll(Acupoint.class);
		System.out.println(ls.size());
		for(int i=0;i<ls.size();i++){
			System.out.println(ls.get(i));
		}
	}
    
}
