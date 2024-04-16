package com.everis.ct.web.glue;

import com.everis.ct.web.WebAutomationApplication;
import com.everis.ct.web.lib.WebDriverManager;
import com.everis.ct.web.page.SymphonyAutomationManagement;
import com.everis.ct.web.step.*;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = WebAutomationApplication.class)
public class SymphonyStepDefinition {

    @Value("${url.site}")
    private String urlSymphony;

    @Autowired
    private WebDriverManager manager;

    @Autowired
    private SymphonyLoginStep loginStep;

    @Autowired
    private SymphonyMenuStep menuStep;

    @Autowired
    private SymphonyLocationsStep locationsStep;

    @Autowired
    private SymphonyAutomationManagementStep AutomationManagementStep;

    @Autowired
    private SymphonyChangeRequestStep ChangeRequestStep;

    @Autowired
    private SymphonyActionExecutionStep ActionExecutionStep;

    @Autowired
    private IngresoPaginaStep IngresoPagina;

    @Autowired
    private IngresoPaginaStep BtnCreate;

    @Autowired
    private IngresoPaginaStep RegisterUser;

    @Autowired
    private IngresoPaginaStep BtndeRegistro;

    @Autowired
    private IngresoPaginaStep IngresoUser;

    @Autowired
    private IngresoPaginaStep IngresoUsuario;
    @Autowired
    private IngresoPaginaStep BtnIngreso;
    @Autowired
    private IngresoPaginaStep IngresoCaptegoria;
    @Autowired
    private IngresoPaginaStep SeleccionProducto;
    @Autowired
    private IngresoPaginaStep IngresoCart;

    @Autowired
    private IngresoPaginaStep RegisterCompra;

    @Autowired
    private IngresoPaginaStep ConfirmaVenta;
    public SymphonyStepDefinition() {
    }

    @Dado("que abro la pagina de symphony sandbox")
    public void queAbroLaPaginaDeSymphonySandbox() {
        manager.navigateTo(urlSymphony);
    }

    //@Cuando("Ingreso a Symphony doy click en Registrarse")
    //public void ingresoASymphonyDoyClickEnRegistrarse() { loginStep.Registrarse();
    //}

    @Cuando("ingreso el usuario: {string} y la contraseña: {string}")
    public void ingresoElUsuarioYLaContraseña(String arg0, String arg1) {
        loginStep.LoginSymphony(arg0, arg1);
    }

    @Cuando("se da click en la menu Inventory Management")
    public void seDaClickEnLaMenuInventoryManagement() {
        menuStep.menuSymphonyIM();
    }

    @Cuando("se da click en japon")
    public void seDaClickEnJapon() {
        locationsStep.Japon();
    }

    @Cuando("se selecciona el icono de eliminar del detalle CU02")
    public void seSeleccionaElIconoDeEliminarDelDetalleCU() {
        locationsStep.CS02();
    }

    @Cuando("se da click en el mensaje emergente Cancelar")
    public void seDaClickEnElMensajeEmergenteCancelar() {
        locationsStep.Cancelar();
    }

    @Cuando("se selecciona add resource")
    public void seSeleccionaAddResource() {
        locationsStep.Resources();

    }

    @Cuando("selecciono resource Type")
    public void seleccionoResourceType() {
        locationsStep.resourcesType();

    }

    @Cuando("selecciono Next")
    public void seleccionoNext() {
        locationsStep.Next();
    }

    @Cuando("selecciono resource Specification")
    public void seleccionoResourceSpecification() {
        locationsStep.VolverSeleccion();
    }

    @Cuando("ingreso name: {string} Y el External ID: {string}")
    public void ingresoNameYElExternalID(String arg0, String arg1) {
        locationsStep.crearParametro(arg0, arg1);
    }

    @Cuando("selecciono Lifesycle Satate")
    public void seleccionoLifesycleSatate() {
        locationsStep.Operaciones();
    }

    @Cuando("se da click en guardar")
    public void seDaClickEnGuardar() {
        locationsStep.GuardarParametro();
    }

    @Cuando("se da click en guardar pide confirmacion de la accion")
    public void seDaClickEnGuardarPideConfirmacionDeLaAccion() {
        locationsStep.ConfirmarAccion();
    }

    @Entonces("Se da click en el boton aceptar")
    public void seDaClickEnElBotonAceptar() {
        locationsStep.AceptarAccion();
    }

    @Cuando("ingreso selecciono el menu")
    public void ingresoSelccionoElMenu() {AutomationManagementStep.MenuOperacionFlow();
    }
    @Cuando("Selecciono y doy clic a gestion Automatizada")
    public void seDaClickEnElMenuDeAutomationManagement() {
        AutomationManagementStep.AutomatizacionGestionada();
    }

    @Cuando("se da click en Operaciones")
    public void seDaClickEnOperaciones() {
        AutomationManagementStep.OperacionFlow();
    }


    @Cuando("ingreso a Configuration Management")
    public void ingresoAConfigurationManagement() { ChangeRequestStep.MenuConfigManagement();
    }


    @Cuando("ingreso a change request")
    public void ingresoAChangeRequest() { ChangeRequestStep.SelectChangeRequest();
    }

    @Cuando("selecciono NF initial Configuration")
    public void seleccionoNFInitialConfiguration() { ChangeRequestStep.SelectInitialConfiguration();
    }

    @Cuando("Selecciono nf-inicial-Parameters")
    public void seleccionoNfInicialParameters() { ChangeRequestStep.SelectInitialParameters();
    }

    @Cuando("luego damos click en action execution")
    public void luegoDamosClickEnActionExecution() { ActionExecutionStep.MenuActionExecution();
    }

    @Cuando("Luego seleccionamos shedule action")
    public void luegoSeleccionamosSheduleAction() { ActionExecutionStep.CreateActionExecution();
    }

    @Cuando("ingreso el nombre: {string} la  Descripcion: {string}")
    public void ingresoElNombreLaDescripcion(String arg0, String arg1) {
        ActionExecutionStep.NameyDescription(arg0, arg1);
    }

    @Cuando("Selecciono el Filter Resource Type")
    public void seleccionoElFilterResourceType() { ActionExecutionStep.FilteringResource();
    }

    @Cuando("selecciono {string}")
    public void selecciono(String arg0) { ActionExecutionStep.SelectRolSpaces(arg0);
    }
    @Cuando("selecciono la Accion de la lista desplegable")
    public void seleccionoLaAccionDeLaListaDesplegable() { ActionExecutionStep.SelectRolbackAction();
    }
    @Cuando("selecciono la lista desplegable")
    public void seleccionoLaListaDesplegable() {ActionExecutionStep.SelectListAction();
    }

    @Cuando("selecciono Action")
    public void seleccionoAction() { ActionExecutionStep.SelectActionScheduled();
    }

    @Cuando("agrego una seleccion")
    public void agregoUnaSeleccion() { ActionExecutionStep.SelectAllAction();
    }

    @Cuando("damos al boton Next")
    public void damosAlBotonNext() { ActionExecutionStep.SelectNextAction();
    }

    @Cuando("selcciono el sheduled the action")
    public void selccionoElSheduledTheAction() { ActionExecutionStep.ScheduledAction();
    }

    @Dado("Que ingreso al sistema")
    public void queAbroLaPagina() {
        manager.navigateTo(urlSymphony);
    }

    @Y ("Que ingreso al sistema selecciono New User")
    public void queIngresoAlSistemaSeleccionoNewUser() {BtnCreate.BtnCreate();
    }

    //@Y("ingreso los datos first name{string}, Last Name{string}, User Name{string} y  Password{string}")
    //public void ingresoLosDatosFirstNameLastNameUserNameYPassword(String arg0, String arg1) {RegisterUser.RegisterUser(arg0,arg1);
    //}
    @Y("doy click en el boton Register")
    public void doyClickEnElBotonRegister() {BtndeRegistro.BtndeRegistro();
    }

    @Y("ingreso usuario {string} y contrasena {string}")
    public void ingresoUsuarioYContraseña(String arg0, String arg1) {IngresoUser.IngresoUser(arg0,arg1);
    }

    @Entonces("doy click en el boton Login")
    public void doyClickEnElBotonLogin() {IngresoUsuario.IngresoUsuario();
    }

    @Y("ingreso los datos first name{string}, Last Name{string}")
    public void ingresoLosDatosFirstNameLastName(String arg0, String arg1) {RegisterUser.RegisterUser(arg0,arg1);
    }

    @Y("Selecciono Login")
    public void seleccionoLogin() {BtnIngreso.BtnIngreso();
    }

    @Y("Selecciono Categoria y Selecciono Laptops")
    public void seleccionoCategoriaYSeleccionoLaptops() {IngresoCaptegoria.IngresoCaptegoria();
    }

    @Y("Selecciono un Producto")
    public void seleccionoUnProducto() {SeleccionProducto.SeleccionProducto();
    }

    @Entonces("ingreso al carrito y verifico la compra")
    public void ingresoAlCarritoYVerificoLaCompra() {IngresoCart.IngresoCart();
    }

    @Entonces("Procedo con la compra he ingreso los Datos de la compra Name{string},Country{string}, City{string}, Credit Card{string}, Mounth{string}, Year {string}")
    public void procedoConLaCompraHeIngresoLosDatosDeLaCompraNameCountryCityCreditCardMounthYear(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) {RegisterCompra.RegisterCompra(arg0,arg1,arg2,arg3,arg4,arg5);
    }

    @Entonces("Proceso a dar Clip sobre Comprar")
    public void procesoADarClipSobreComprar() {ConfirmaVenta.ConfirmaVenta();
    }
}
