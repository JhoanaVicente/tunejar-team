<script>
    import Header from "./components/header.svelte"
    import Catalog from "./components/catalog.svelte"
    import {onMount} from "svelte";

<<<<<<< HEAD

    let songs = []

    onMount(() => {
        fetch("http://localhost:9065/cancion")
            .then(respuesta => respuesta.json())
            .then( datos => songs = datos)
    })
=======
    // esto son datos de prueba
    // tendriamos que hacer una peticion al backend para pedir la
    // informacion:
    // GET localhost:9065/cancion
    // {
    //     nombreCancion: "La Macarena",
    //     artista: "los del Rio",
    //     coverUrl: "",
    //     generoMusical: "",
    //     releaseYear: ""
    // }
    let songs = [ // esto tendria que venir del backend
        {
            title: "felises los 4",
            genre:"reggeton",
            year:"",
            author: "Maluma",
            coverUrl: "https://th.bing.com/th/id/OIP.BRnGT23SKPg7BH9N4pqqNwHaHa?pid=ImgDet&rs=1"
        },
        {
            title: "Insurrección",
            genre:"",
            year:"",
            author: "manolo garcia",
            coverUrl: "https://th.bing.com/th/id/R.2ea177a46023e4516925a49886051a0a?rik=IFOuBq5njNrKTQ&pid=ImgRaw&r=0"
        },
        {
            title: "Soldadito marinero",
            genre:"",
            year:"",
            author: "Fito & fitipaldis",
            coverUrl: "https://i.pinimg.com/originals/33/13/5b/33135bdd7301f77a09e3ccfca9a7de08.jpg"

        }]
>>>>>>> 25ccf96ab4bbdfbce45ff3d5782c751d3a7d0023
</script>

<div class="container">
    <Header/>
    <Catalog songs={songs}/>
</div>

<style>
    .container {
        width: 100%;
        height: 100vh;
        background-image: url(/images/fondo.png);
        background-size: cover;
        background-repeat: no-repeat;
    }

    @media (min-width: 640px) {
        main {
            max-width: none;
        }
    }
</style>