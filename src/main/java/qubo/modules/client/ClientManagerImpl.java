package qubo.modules.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Qubo_Song on 2/7/14.
 */

@Repository
public class ClientManagerImpl implements ClientManager {

    @Autowired
    private ClientDAO clientDAO;

    @Override
    public long CountClientsByPolicyMode(int policyMode) {
        return clientDAO.CountClientsByPolicyMode(policyMode);
    }
}
