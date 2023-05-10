<script>

    export let songs;
    import Song from './song.svelte'
</script>

<div class="catalog">
    <h1>Catalogo</h1>
    <div>
        {#each songs as song}
          <Song/>


        {/each}
    </div>
</div>


