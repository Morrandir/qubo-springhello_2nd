package qubo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import qubo.services.client.ClientService;

/**
 * Created by Qubo_Song on 2/7/14.
 */

@Controller
public class ClientServiceController {

    @Autowired
    private ClientService clientService;

    @RequestMapping("/NumberOfUserModeClients")
    public @ResponseBody long GetNumberOfUserModeClients() {
        return clientService.GetNumberOfUserModeClients();
    }
}
