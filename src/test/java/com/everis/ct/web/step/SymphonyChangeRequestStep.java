package com.everis.ct.web.step;

import com.everis.ct.web.page.StepPages;
import com.everis.ct.web.service.aspect.evidence.ScreenShot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@ScreenShot
@Component

public class SymphonyChangeRequestStep {

    @Autowired
    private StepPages page;

    public void MenuConfigManagement() {
        page.symChangeRequest().ConfigManagement(); }

    public void SelectChangeRequest() {
        page.symChangeRequest().ChangeRequest();
    }

    public void SelectInitialConfiguration() {
        page.symChangeRequest().InicialConfiguration();
    }

    public void SelectInitialParameters() {
        page.symChangeRequest().InicialParameters();
    }
}
