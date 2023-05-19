<script>
    import {onMount} from "svelte";

    let miLista = []

    onMount(() => {
        fetch("http://localhost:9065/songs")
            .then(respuesta => respuesta.json())
            .then(datos => miLista = datos)
    })
</script>

<div>
    <h3 class="my-favorites">Mi<br>Lista</h3>
</div>

<style>
    h3 {
        color: white;
        font-weight: 100%;
    }

</style>