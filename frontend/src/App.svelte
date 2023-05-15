<script>
    import Header from "./components/header.svelte"
    import Catalog from "./components/catalog.svelte"
    import {onMount} from "svelte";

    let songs = []

    onMount(() => {
        fetch("http://localhost:9065/songs")
            .then(respuesta => respuesta.json())
            .then(datos => songs = datos)
    })

</script>

<div class="container">
    <Header/>
    <Catalog songs={songs}/>
</div>

<style>
    .container {
        width: 100%;
        height: 100vh;
        background-image: url("https://hdwallpaperim.com/wp-content/uploads/2017/08/31/146588-cassette-jeans-denim-748x497.jpg");
        background-size: cover;
        background-repeat: no-repeat;
        background-blend-mode: overlay;
        background-color: cadetblue;
    }

    @media (min-width: 640px) {
        main {
            max-width: none;
        }
    }
</style>