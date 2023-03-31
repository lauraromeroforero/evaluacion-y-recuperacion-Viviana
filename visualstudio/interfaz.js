var EstudianteList = -[];

function addEstudianteToSystem(pid, pnombre, papellido, pcurso){
    var NuevoEstudiante = {
        id : pid,
        nombre : pnombre,
        apellido : papellido,
        curso : pcurso,
    };

    console.log(NuevoEstudiante);
    EstudianteList.push(NuevoEstudiante);
    tabla.innerHTML = '';
    for (i = 0; i <=EstudianteList.length; i++){
        tabla.innerHTML += '<tr><td>' + EstudianteList[i].id +
        '<tr><td>' + EstudianteList[i].nombre +
        '<tr><td>' + EstudianteList[i].apellido +
        '<tr><td>' + EstudianteList[i].curso +
        '<tr><td>';
    }
}