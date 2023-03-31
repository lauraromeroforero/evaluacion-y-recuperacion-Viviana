$(document).ready(function(){
    //alert("Aquiii con jquery");
    $('#listar').on('click', function(){
        let tabla = document.querySelector('#tabla')
        tabla.innerHTML = ''
        $.ajax({
            url: "http://localhost:8080/Mostrarlista",
            type: "GET",
            datatype: "JSON",
            success: function(respuesta){
                alert("Empleado Listado Exitosamente")
                tabla.innerHTML = '';
                for (i = 0; i <=respuesta.length; i++){
                    tabla.innerHTML += '<tr><td>' + respuesta[i].cedula +
                    '</td><td>' + respuesta[i].nombre +
                    '</td><td>' + respuesta[i].apellido +
                    '</td><td>' + respuesta[i].cargo +
                    '</td><td>' + respuesta[i].salario +
                    '</td><td>' + respuesta[i].nocturnas +
                    '</td><td>' + respuesta[i].festivas +
                    '</td><td>' + respuesta[i].ventas +
                    '<td><tr>';
                }
            }
        });
    });
    $('#btnGuardarEmpleado').on('click', function(){
        let datos = {
            id: parseInt($('#txtid').val()),
            nombre: $('#txtNombre').val(),
            apellido: $('#txtApellido').val(),
            cargo: $('#txtCargo').val(),
            salario: $('#txtSalario').val(),
            nocturnas: [$('#txtNocturnas').val(), $('#txtNocturnasdos').val(), $('#txtNocturnastres').val(), $('#txtNocturnascuatro').val(), $('#txtNocturnascinco').val()],
            festivas: [$('#txtFestivas').val(), $('#txtFestivasdos').val(), $('#txtFestivastres').val(), $('#txtFestivascuatro').val(), $('#txtFestivascinco').val()],
            ventas: [$('#txtVentas').val(), $('#txtVentasdos').val(), $('#txtVentastres').val(), $('#txtVentascuatro').val(), $('#txtVentascinco').val()]
        }
        let datosEnvio = JSON.stringify(datos);
        alert(datos);
        $.ajax({
            url: "http://localhost:8080/AgregarEmpleado",
            type: "POST",
            data: datosEnvio,
            contentType: "application/JSON",
            datatype: JSON,
            success: function(respuesta){
                console.log("Empleado Guardado Exitosamente");
            }
        })
    });

    $('#buscar').on('click', function(){
        let id = parseInt($('#idbuscar').val());
        $.ajax({
            url: "http://localhost:8080/buscarEmpleado/"+ id,
            type: "GET",
            datatype: "JSON",
            success: function(respuesta){
                if(respuesta){
                    console.log(respuesta);
                } else{
                    alert("No se encontro el Empleado");
                }
            }
    
        })
    });

    $('#eliminar').on('click', function(){
        let id = parseInt($('#idbuscar').val());
        $.ajax({
            url: "http://localhost:8080/eliminar/"+id,
            type: "GET",
            data: "JSON",
            success: function(respuesta){
                if(respuesta){
                    alert(respuesta);
                } else{
                    alert("No se encontro el Empleado");
                }
            }

        });

    });

    $
});