<script>

    export let songs;
    import Song from './song.svelte'
</script>

<section>
    <h1>Catálogo</h1>
    <div class="songs-list">

        {#each songs as info}
          <Song song={info}/>
        {/each}
    </div>
</section>

<style>
    h1 {
        color: white;
        font-size: 2em;
        font-weight: 100%;
        text-align: right;
        padding-right: 5%;
    }

    section {
        margin: 3%;
        padding: 3%;
        background-color: rgba(255,255,255,0.05);
    }

    .songs-list {
        width: 100%;
        display: flex;

    }
</style>




