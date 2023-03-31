document.querySelector('#btnGuardarEstudiante').addEventListener('click', GuardarEstudiante);

function GuardarEstudiante(){
    var sId = document.querySelector('#txtid').value,
    sNombre = document.querySelector('#txtNombre').value,
    sApellido = document.querySelector('#txtApellido').value,
    sCurso = document.querySelector('#txtCurso').value;

    addEstudianteToSystem(sId,sNombre,sApellido,sCurso);
}