package qubo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qubo.configs.POLICY_MODE;
import qubo.modules.ClientManager;

/**
 * Created by Qubo_Song on 2/7/14.
 */

@Service("clientService")
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientManager clientManager;

    @Override
    public long GetNumberOfUserModeClients() {
        return clientManager.CountClientsByPolicyMode(POLICY_MODE.USER_MODE);
    }
}
