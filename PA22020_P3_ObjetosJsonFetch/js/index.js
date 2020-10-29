var htmlListaPokemon='<div class="carousel-item active"><img src="..." class="d-block w-100" alt="..."><div class="carousel-caption d-none d-md-block"><h5>Listado de Pokemones</h5></div></div>'

function cargarPokemons(){
    let url="https://pokeapi.co/api/v2/pokemon?limit=100&offset=0";
    
    fetch(url)
        .then(
            function (respuesta){
                return respuesta.json()
            }
        )
        .then(
            function (respuestaApi){
                respuestaApi.results.forEach(
                    function (pokemon){
                        
                        cargarPokemon(pokemon)
                    }    
                )
                
            }
        )
}

function cargarPokemon(pokemon){
    fetch(pokemon.url)
    .then(
        function (respuesta){
            return respuesta.json()
        }
    )
    .then(
        function (respuestaApi){
            let id=respuestaApi.id
            let nombre=respuestaApi.nombre
            
            htmlListaPokemon+='<div class="carousel-item"><img src="https://pokeres.bastionbot.org/images/pokemon/'+id+'.png" class="d-block w-100" alt="..."><div class="carousel-caption d-none d-md-block"><h5>'+nombre+'</h5></div></div>'
            document.getElementById("listadoPokemon").innerHTML=htmlListaPokemon
        }
    )
}

cargarPokemons()


