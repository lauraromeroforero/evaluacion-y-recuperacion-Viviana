$(document).ready(function(){
    //alert("Aquiii con jquery");
    $('#listarEstudiante').on('click', function(){
        let tabla = document.querySelector('#tabla')
        tabla.innerHTML = ''
        $.ajax({
            url: "http://localhost:8080/listarEstudiante",
            type: "GET",
            datatype: "JSON",
            success: function(respuesta){
                console.log(respuesta)
                tabla.innerHTML = '';
                for (i = 0; i <=respuesta.length; i++){
                    tabla.innerHTML += '<tr><td>' + respuesta[i].id +
                    '</td><td>' + respuesta[i].nombre +
                    '</td><td>' + respuesta[i].apellido +
                    '</td><td>' + respuesta[i].curso +
                    '</td><td>' + respuesta[i].materias +
                    '</td><td>' + respuesta[i].notas +
                    '<td><tr>';
                }
            }
        });
    });
    $('#btnGuardarEstudiante').on('click', function(){
        let datos = {
            id: parseInt($('#txtid').val()),
            nombre: $('#txtNombre').val(),
            pais: $('#txtApellido').val(),
            fecha: $('#txtCurso').val(),
            materias: [$('#txtMateriauno').val(), $('#txtMateriados').val(), $('#txtMateriatres').val()],
            notas: [$('#txtNotauno').val(), $('#txtNotados').val(), $('#txtNotatres').val()],
        }
        let datosEnvio = JSON.stringify(datos);
        console.log(datos);
        $.ajax({
            url: "http://localhost:8080/AgregarEstudiante",
            type: "POST",
            data: datosEnvio,
            contentType: "application/JSON",
            datatype: JSON,
            success: function(respuesta){
                console.log(respuesta);
            }
        })
    });

    $('#buscar').on('click', function(){
        let id = parseInt($('#idbuscar').val());
        $.ajax({
            url: "http://localhost:8080/buscarEstudiante/"+ id,
            type: "GET",
            datatype: "JSON",
            success: function(respuesta){
                if(respuesta){
                    console.log(respuesta);
                } else{
                    alert("No se encontro el Estudiante");
                }
            }
    
        })
    });

    $('#Eliminar').on('click', function(){
        let id = parseInt($('#idbuscar').val());
        $.ajax({
            url: "http://localhost:8080/eliminarEstudiante/"+id,
            type: "GET",
            data: "JSON",
            success: function(respuesta){
                if(respuesta){
                    console.log(respuesta);
                } else{
                    alert("No se encontro el Estudiante");
                }
            }

        });

    });
});