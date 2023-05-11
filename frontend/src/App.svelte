<script>
    import Header from "./components/header.svelte"
    import Catalog from "./components/catalog.svelte"

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
            title: "Candy Shop",
            genre:"",
            year:"",
            author: "50 cent",
            coverUrl: "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0b/%28Portrait_of_Billie_Holiday_and_Mister%2C_Downbeat%2C_New_York%2C_N.Y.%2C_ca._Feb._1947%29_%28LOC%29_%285020400274%29_%28cropped%29.jpg/800px-%28Portrait_of_Billie_Holiday_and_Mister%2C_Downbeat%2C_New_York%2C_N.Y.%2C_ca._Feb._1947%29_%28LOC%29_%285020400274%29_%28cropped%29.jpg"
        }]
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