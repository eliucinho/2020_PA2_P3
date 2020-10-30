var listaVehiculos={
            vehiculos:[
                        {
                            placa:"HNL01",
                            marca:"ford",
                            modelo:"Focus",
                            anio:2020
                        },
                        {
                            placa:"HNL02",
                            marca:"Toyota",
                            modelo:"Corolla",
                            anio:2019
                        },
                        {
                            placa:"HNL03",
                            marca:"Honda",
                            modelo:"Civic",
                            anio:2018
                        }
            ]
    }
for (let indice in listaVehiculos.vehiculos) {
    console.log(listaVehiculos.vehiculos[indice])    
}
console.log("segundo forEach")
listaVehiculos.vehiculos.forEach(
    function (vehiculo){
        console.log(vehiculo)
    }    
)
