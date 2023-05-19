<script>
    export let songs;
    import Song from './song.svelte'
</script>

<section>
    <div class="songs-list">
        {#each songs as info}
            <Song song={info}/>
        {/each}
    </div>
</section>

<style>
    h3 {
        color: white;
        font-weight: 50;
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




