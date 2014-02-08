package qubo.modules.client;

import org.springframework.context.ApplicationContext;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Qubo_Song on 2/7/14.
 */
@Repository
public class ClientDAOImpl extends SqlSessionDaoSupport implements ClientDAO {

    private static final String NAMESPACE = ClientDAOImpl.class.getPackage().getName();

    public ClientDAOImpl() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        SqlSessionFactory sqlSessionFactory = applicationContext.getBean(SqlSessionFactory.class);
        this.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public long CountClientsByPolicyMode(int policyMode) {
        Map<String, Object> args = new HashMap<String, Object>();
        args.put("policyMode", policyMode);
        return getSqlSession().selectOne(NAMESPACE + ".countClientsByPolicyMode", args);
    }
}
