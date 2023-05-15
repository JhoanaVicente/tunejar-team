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
        background-image: url("https://c4.wallpaperflare.com/wallpaper/355/120/60/music-style-80s-style-illustration-hd-wallpaper-preview.jpg");
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