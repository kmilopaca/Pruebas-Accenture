#language:es
@CASOS
Característica: Automatizacion Symphony COE Testing - Flujo 4 y 6

  @CREARCU02
  Escenario: Ejecucion del caso 1 del flujo 4
    Dado que abro la pagina de symphony sandbox
    Cuando ingreso el usuario: "symphony@nttdata.com" y la contraseña: "symphony@nttdata.com"
    Cuando se da click en la menu Inventory Management
    Cuando se da click en japon
    Cuando se selecciona add resource
    Cuando selecciono resource Type
    Cuando selecciono Next
    Cuando selecciono resource Specification
    Cuando ingreso name: "Prueba" Y el External ID: ""
    Cuando selecciono Lifesycle Satate
    Cuando se da click en guardar
    Cuando se da click en guardar pide confirmacion de la accion
    Entonces Se da click en el boton aceptar

  @Borrar
  Escenario: Ejecucion del caso 1 del flujo 4
    Dado que abro la pagina de symphony sandbox
    Cuando ingreso el usuario: "symphony@nttdata.com" y la contraseña: "symphony@nttdata.com"
    Cuando se da click en la menu Inventory Management
    Cuando se da click en japon
    Cuando se selecciona el icono de eliminar del detalle CU02
    Cuando se da click en el mensaje emergente Cancelar

  @OPERACIONES
  Escenario: Ingreso al modulo de operaciones
    Dado que abro la pagina de symphony sandbox
    Cuando ingreso el usuario: "symphony@nttdata.com" y la contraseña: "symphony@nttdata.com"
    Cuando ingreso selecciono el menu
    Cuando Selecciono y doy clic a gestion Automatizada
    Cuando se da click en Operaciones

    @CARGARARCHIVO
    Escenario: Cargar el archivo para que se pueda eliminar la Operacion
      Dado que abro la pagina de symphony sandbox
      Cuando ingreso el usuario: "symphony@nttdata.com" y la contraseña: "symphony@nttdata.com"
      Cuando se da click en la menu Inventory Management
      Cuando ingreso a Configuration Management
      Cuando ingreso a change request
      Cuando selecciono NF initial Configuration
      Cuando Selecciono nf-inicial-Parameters
      Cuando seleciono el archivo
      Cuando Selecciono Submit
      Cuando selecciono una descripcion
      Cuando selecciono confirmar y cargar


  @CREARACTION
  Escenario: Crear un Scheduled Action
    Dado que abro la pagina de symphony sandbox
    Cuando ingreso el usuario: "symphony@nttdata.com" y la contraseña: "symphony@nttdata.com"
    Cuando se da click en la menu Inventory Management
    Cuando luego damos click en action execution
    Cuando Luego seleccionamos shedule action
    Cuando ingreso el nombre: "Prueba" la  Descripcion: "Se realiza prueba de action Execution"
    Cuando Selecciono el Filter Resource Type
    Cuando selecciono "ManagedElement[CU]"
    Cuando selecciono la Accion de la lista desplegable
    Cuando selecciono la lista desplegable
    Cuando selecciono Action
    Cuando agrego una seleccion
    Cuando damos al boton Next
    Cuando selcciono el sheduled the action


  @NewTest
  Escenario: Ingresar a un Pagina Web
    Dado Que ingreso al sistema
    Y Que ingreso al sistema selecciono New User
    Y ingreso los datos first name"Test02", Last Name"Test02"
    Y doy click en el boton Register

    @ingresoTest
    Escenario: Ingresar a un Pagina Web
      Dado Que ingreso al sistema
      Y Selecciono Login
      Y ingreso usuario "Test27" y contrasena "Test2023*"
      Entonces doy click en el boton Login
      Y Selecciono Categoria y Selecciono Laptops
      Y Selecciono un Producto
      Entonces ingreso al carrito y verifico la compra
      Entonces Procedo con la compra he ingreso los Datos de la compra Name"",Country"", City"", Credit Card"", Mounth"", Year ""
      Entonces Proceso a dar Clip sobre Comprar






