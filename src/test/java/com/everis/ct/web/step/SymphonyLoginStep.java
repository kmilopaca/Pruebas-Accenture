package com.everis.ct.web.step;

import com.everis.ct.web.page.StepPages;
import com.everis.ct.web.service.aspect.evidence.ScreenShot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@ScreenShot
@Component
public class SymphonyLoginStep {
    @Autowired
    private StepPages page;

    //public void Registrarse() {
        //page.symLogin().BotonRegistrarse(); }
    public void LoginSymphony(String data, String data1) {
        page.symLogin().login(data,data1);
    }
}
