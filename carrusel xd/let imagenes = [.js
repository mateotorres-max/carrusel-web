let imagenes = [
    "xdd.jpg"
    "xd.jpg"
    "xddd.jpg"
];

let posicion = 0;

function cambiarImagen(){

    posicion++;

    if(posicion >= imagenes.length){
        posicion = 0;
    }

    document.getElementById("imagen").src = imagenes[posicion];
}

setInterval(cambiarImagen, 3000);