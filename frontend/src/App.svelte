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
<<<<<<< HEAD
        background-image: url("https://c4.wallpaperflare.com/wallpaper/355/120/60/music-style-80s-style-illustration-hd-wallpaper-preview.jpg");
=======
        background-image: url("https://slack-imgs.com/?c=1&o1=ro&url=https%3A%2F%2Fi.pinimg.com%2F236x%2F24%2F3f%2Fd6%2F243fd6a377a1a3fa4791921ee71ef2c5.jpg");
>>>>>>> 609377539ec0812e0d8c44318cbb9d0533d23f36
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