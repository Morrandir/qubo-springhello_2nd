package qubo.modules;

import org.springframework.context.ApplicationContext;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

/**
 * Created by Qubo_Song on 2/7/14.
 */
//@Repository
public class ClientDAOImpl extends SqlSessionDaoSupport implements ClientDAO {

    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");

    SqlSessionFactory sqlSessionFactory = applicationContext.getBean(SqlSessionFactory.class);

}
