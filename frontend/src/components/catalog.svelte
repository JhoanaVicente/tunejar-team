<script>
    export let songs;
    import Song from './song.svelte'
</script>

<section>
    <div class="songs-list">
        <h3 class="catalog">Catálogo</h3>
            {#each songs as info}
                <Song song={info}/>
            {/each}
    </div>

    <div>
    <h3 class="my-favorites">Mi<br>Lista</h3>
    </div>
</section>

<style>
    h3 {
        color: white;
        font-weight: 100%;
    }

    section {
        display: grid;
        justify-items: start;
        margin-left: 100px;
    }

    .songs-list {
        display: flex;
    }
</style>




