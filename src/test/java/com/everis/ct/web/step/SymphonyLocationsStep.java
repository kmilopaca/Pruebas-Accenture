package com.everis.ct.web.step;

import com.everis.ct.web.page.StepPages;
import com.everis.ct.web.service.aspect.evidence.ScreenShot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@ScreenShot
@Component
public class SymphonyLocationsStep {
    @Autowired
    private StepPages page;

    public void Japon() {
        page.symLocations().menuJapan();
    }

    public void CS02() {
        page.symLocations().clickCU02();
    }

    public void Cancelar() {
        page.symLocations().clickCancelar();

    }

    public void Resources() {
        page.symLocations().resources();

    }

    public void resourcesType() {
        page.symLocations().resourceType();

    }

    public void Next() {
        page.symLocations().botonNext();

    }

    public void VolverSeleccion() {
        page.symLocations().resourceSpecification();

    }

    public void crearParametro(String arg0, String arg1) {
        page.symLocations().creacion(arg0, arg1);

    }

    public void Operaciones() {
        page.symLocations().operaciones();

    }

    public void GuardarParametro() {
        page.symLocations().guardar();

    }

    public void ConfirmarAccion() {
        page.symLocations().confirmar();
    }

    public void AceptarAccion() {
        page.symLocations().confirmarBoton();
    }
}

