
// Hacer visible el formulario de checkboxes
$('#boton_agregar_consulta').click(() => {
        console.log("Hello world")
        if ($('#agregar_consulta').is(':hidden')){
            $('#agregar_consulta').show()
        }else {
            $('#agregar_consulta').hide()
        }

    }
)

// Datos de prueba

paginas = [
    {
        "Pagina": {
            "Titulo": "Titulo 1"
        },
        "subscrito": false
    },
    {
        "Pagina": {
            "Titulo":  "Titulo 2"
        },
        "subscrito": true
    },
    {
        "Pagina": {
            "Titulo":  "Titulo 3"
        },
        "subscrito": false
    }
]

// Poner los checkboxes

for (let i in paginas){
    let html = '<div class="col">' +
        '<div class="form-check">'
    if (paginas[i].subscrito){
        html += '<input class="form-check-input" type="checkbox" value="" id="flexCheckDefault'+ i +'" checked/>'
    }else {
        html += '<input class="form-check-input" type="checkbox" value="" id="flexCheckDefault'+ i + '"/>'
    }
    html +=
        '<label class="form-check-label" htmlFor="flexCheckDefault'+ i + '">' + paginas[i].Pagina.Titulo + '</label>' +
        '</div>' +
        '</div>'
    $("#checkboxes").append(html)
}

