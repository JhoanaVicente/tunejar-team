<script>

    export let songs;
</script>

<div class="catalog">
    <h1>Catalogo</h1>
    <div>
        {#each songs as song}
          <Song/>


        {/each}
    </div>
</div>


