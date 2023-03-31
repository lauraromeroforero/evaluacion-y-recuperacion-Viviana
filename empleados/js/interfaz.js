var EmpleadoList = -[];

function addEmpleadoToSystem(pid, pnombre, papellido, pcargo, psalario, pnocturnas, pfestivas, pventas){
    var NuevoEmpleado = {
        id : pid,
        nombre : pnombre,
        apellido : papellido,
        cargo : pcargo,
        salario : psalario
    };

    console.log(NuevoEmpleado);
    EmpleadoList.push(NuevoEmpleado);
    tabla.innerHTML = '';
    for (i = 0; i <=EmpleadoList.length; i++){
        tabla.innerHTML += '<tr><td>' + EmpleadoList[i].cedula +
        '<tr><td>' + EmpleadoList[i].nombre +
        '<tr><td>' + EmpleadoList[i].apellido +
        '<tr><td>' + EmpleadoList[i].cargo +
        '<tr><td>' + EmpleadoList[i].salario 
        '<tr><td>';
    }
}