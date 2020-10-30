console.log("bienvenidos a mi pagina");

//alert("hola mundo")

nombre='Adelman eliud'

//alert("hola "+nombre)

nombre=100

//alert("hola nuevo valor "+nombre)

nombre="Adelman eliud "+nombre

//alert("hola concatenación "+nombre)

mensajeComillas=' Hola con "comillas" '

//alert(mensajeComillas)

a=5
b=10
c="honduras"
resultado=a+b+c

//alert(resultado)

const NUMERO_PI=3.141628

//alert((NUMERO_PI+b))

a='20'
b='40'

resultado=parseInt(a)+parseInt(b)

//alert(resultado)

function decirHola(){
    alert("Hola UTH")
}

//decirHola()

function decirHola(saludo){
    //alert(saludo)
    console.log("Decir hola "+saludo)
}

//decirHola("Hola "+nombre)

function sumar(a,b){
    return a+b;
}

resultado=sumar('4','7') //47
resultado=sumar(4,7) //11

//alert(resultado)

function sumarFormulario(){
    a=document.getElementById("txtA").value
    b=document.getElementById("txtB").value
    resultadoSuma=parseInt(a)+parseInt(b)
    document.getElementById("txtResultado").value=resultadoSuma

}

function validarFormulario(){
    a=document.forms["formularioSuma"]["txtA"].value

    if(a==""){
        mensaje="El valor de a no puede ser vacio"
        document.getElementById("mensajeError").innerHTML=mensaje
    }else{
        mensaje="a fue ingresado correctamente" 
        document.getElementById("mensajeInformacion").innerHTML=mensaje       
    }

}

arregloImagenes=['UthFoto.png','UthLogo.png','UthPerfil.png']

for (let i = 0; i < arregloImagenes.length; i++) {
    const element = arregloImagenes[i];
    console.log(element)
}

arregloImagenes.forEach(decirHola)

contador=0
while (contador<=100) {
    console.log(contador)
    contador++
}

function cambiarImagenUTH(){
    numeroAleatorio=Math.floor(Math.random()*arregloImagenes.length)
    document.getElementById("imagenUth").src="imagenes/"+arregloImagenes[numeroAleatorio]
}

function insertarHtml(){
    document.getElementById("espacioInsertar").innerHTML="<h2>Hola soy una etiqueta</h2>"
}

if(true){
    z="z" //es una variable global
    var y="y" //variable global
    let x="x" //variable local
}

console.log(z)
console.log(y)
console.log(x)
