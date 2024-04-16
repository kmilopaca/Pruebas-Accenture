package com.everis.ct.web.step;

import com.everis.ct.web.page.StepPages;
import com.everis.ct.web.service.aspect.evidence.ScreenShot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@ScreenShot
@Component
public class IngresoPaginaStep {

    @Autowired
    private StepPages page;

    public void BtnCreate() {page.ingPagina().Create();}
    public void RegisterUser(String data, String data1) {
        page.ingPagina().Register(data,data1);}
    public void BtndeRegistro() {page.ingPagina().BtnRegistro();}

    public void BtnIngreso() {page.ingPagina().IngresoUser();}

    public void IngresoUser(String data, String data1) {
        page.ingPagina().LoginIngre(data,data1);}
    public void IngresoUsuario() {page.ingPagina().LogInicio();}

    public void IngresoCaptegoria() {page.ingPagina().SeleccionCap();}

    public void SeleccionProducto() {page.ingPagina().SelecProduc();}

    public void IngresoCart() {page.ingPagina().SlectCart();}

    public void RegisterCompra(String data, String data1, String data2, String data3, String data4, String data5) {
        page.ingPagina().DatosOrden(data,data1,data2,data3,data4,data5);}
    public void ConfirmaVenta() {page.ingPagina().ComfirmarCompra();}

    }



