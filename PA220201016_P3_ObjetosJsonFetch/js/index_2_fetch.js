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
            console.log(respuestaApi)
        }
    )
}

cargarPokemons()