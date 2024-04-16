package com.everis.ct.web.page;

import org.springframework.stereotype.Component;

@Component
public class StepPages {

    public SymphonyLogin symLogin() {
        return new SymphonyLogin();
    }

    public SymphonyMenu symMenu() {
        return new SymphonyMenu();
    }

    public SymphonyLocations symLocations() {
        return new SymphonyLocations();
    }

    public SymphonyAutomationManagement symAutomations() {
        return new SymphonyAutomationManagement();
    }

    public SymphonyChangeRequest symChangeRequest() {
        return new SymphonyChangeRequest();
    }

    public SymphonyActionExecution symActionExecution() {
        return new SymphonyActionExecution();
    }

    public IngresoPagina ingPagina() { return new IngresoPagina(); }

    public BotonUsuario NewUser() {return new BotonUsuario ();
    }
}
