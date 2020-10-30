var sumaTotal=0;

function calcularMultiplicacion(){
    let valorMultiplicar=document.getElementById("valorMultiplicar").value
    let etiquetaResultado=document.getElementById("resultado")

    etiquetaResultado.value=valorMultiplicar*100

    let multiplicacionTotal="";
    let etiquetaResultadoMultiplicacion=document.getElementById("resultadoMultiplicacion")
    for (let index = 1; index <= 100; index++) {
        let resultadoMultiplicacion = valorMultiplicar*index;
        let oracionMultiplicacion=index+" x "+valorMultiplicar+" = "+resultadoMultiplicacion
        
        multiplicacionTotal+="<li>"+oracionMultiplicacion+"<li>"        
    }
    etiquetaResultadoMultiplicacion.innerHTML=multiplicacionTotal

}

function incrementarContador(){
    sumaTotal+=1
    let etiquetaResultadoCuenta=document.getElementById("resultadoCuenta")

    etiquetaResultadoCuenta.innerHTML=sumaTotal

}

function incrementarTamanio(){
    let etiquetaImagen=document.getElementById("imgVehiculo")
    etiquetaImagen.style.width='20px'
    etiquetaImagen.style.display='none'
}