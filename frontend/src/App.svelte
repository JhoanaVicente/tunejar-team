<script>
    import Header from "./components/header.svelte"
    import Catalog from "./components/catalog.svelte"

    let songs = [ // esto tendria que venir del backend
        {
            title: "La Macarena",
            author: "los del Rio",
            coverUrl: "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0b/%28Portrait_of_Billie_Holiday_and_Mister%2C_Downbeat%2C_New_York%2C_N.Y.%2C_ca._Feb._1947%29_%28LOC%29_%285020400274%29_%28cropped%29.jpg/800px-%28Portrait_of_Billie_Holiday_and_Mister%2C_Downbeat%2C_New_York%2C_N.Y.%2C_ca._Feb._1947%29_%28LOC%29_%285020400274%29_%28cropped%29.jpg"
        },
        {
            title: "Despacito",
            author: "Luis Fonsi",
            coverUrl: "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0b/%28Portrait_of_Billie_Holiday_and_Mister%2C_Downbeat%2C_New_York%2C_N.Y.%2C_ca._Feb._1947%29_%28LOC%29_%285020400274%29_%28cropped%29.jpg/800px-%28Portrait_of_Billie_Holiday_and_Mister%2C_Downbeat%2C_New_York%2C_N.Y.%2C_ca._Feb._1947%29_%28LOC%29_%285020400274%29_%28cropped%29.jpg"
        },
        {
            title: "Candy Shop",
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
        background-size: 100%;
        background-repeat: no-repeat;
    }


    h1 {
        color: white;
        font-size: 2em;
        font-weight: 400;
    }


    .hero-main {
        display: grid;
        grid-template-columns: repeat(1fr, 1fr);
        gap: 3%;


    }


    @media (min-width: 640px) {
        main {
            max-width: none;
        }
    }
</style>