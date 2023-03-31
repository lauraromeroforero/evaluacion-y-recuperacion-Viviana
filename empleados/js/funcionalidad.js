document.querySelector('#btnGuardarEmpleado').addEventListener('click', GuardarEmpleado);

function GuardarEmpleado(){
    var sId = document.querySelector('#txtid').value,
    sNombre = document.querySelector('#txtNombre').value,
    sApellido = document.querySelector('#txtApellido').value,
    sCargo = document.querySelector('#txtCargo').value,
    sSalario = document.querySelector('#txtSalario').value;

    addEmpleadoToSystem(sId,sNombre,sApellido,sCargo,sSalario);
}