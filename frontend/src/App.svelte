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
        background-image: url("https://e0.pxfuel.com/wallpapers/915/862/desktop-wallpaper-colorful-abstract-swirl-pattern-art.jpg");
        /*background-image: url(/images/fondo.png);*/
        background-size: cover;
        background-repeat: no-repeat;
    }

    @media (min-width: 640px) {
        main {
            max-width: none;
        }
    }
</style>