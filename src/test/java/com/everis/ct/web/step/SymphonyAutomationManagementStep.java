package com.everis.ct.web.step;

import com.everis.ct.web.page.StepPages;
import com.everis.ct.web.service.aspect.evidence.ScreenShot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@ScreenShot
@Component

public class SymphonyAutomationManagementStep {
    @Autowired
    private StepPages page;

    public void MenuOperacionFlow() {
        page.symAutomations().AutoMenu();
    }
    public void AutomatizacionGestionada() {
        page.symAutomations().AutomationManagement();
    }

    public void OperacionFlow() {
        page.symAutomations().operation();
    }


}
