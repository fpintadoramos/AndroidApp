# Android

## Funciones de la app.
La app es muy sencilla, te permite generar una lista de tareas mediante añadiendo y eliminando elementos.<br/>
Una vez generada la lista de tareas te permite enviar esa lista por correo, whatsapp, etc.

## Base de datos.
Esta creada la base de datos, el dao, y la entity que maneja la base de datos.<br/>
Al implementar la base de datos en la aplicación me crashea, pero aun asi he dejado comentado como funcionaria la aplicación con la base de datos.

## Intents.
He hecho un intent el cual permita enviar la lista de tareas mediante cualquier medio.

## Actividades y Fragmentos.
La aplicacion se compone de una MainActivity y de cuatro fragmentos:
* Fragmento de Inicio. 
Este consta de un solo botón que inicia la aplicación.
* Fragmento de Tareas. 
Consta de tres botones de los cuales dos son para añadir y eliminar y el tercero se usa para enviar la lista de tareas.
* Fragmento de Ayuda. 
Un fragmento que aparece cuando se accede a el mediante el menu.
* Fragmento de Partners 
Este fragmento está vacio ya que aqui iba a introducir el retrofit pero este no me funcionaba.

## ViewModel
Se usa un viewModel en el fragmento de Tareas para eliminar, añadir y obtener de la lista de tareas.
