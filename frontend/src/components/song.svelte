<script>
    export let song;

</script>
<div>
    <img src={song.coverUrl} alt="caratula del disco">
    <p>{song.title}</p>
    <p>{song.author}</p>
    <p>{song.genre}</p>
    <p>{song.releaseYear}</p>
</div>

<style>
    img {
        width: 100px;
        height: 100px;
        border-radius: 5%;
    }

    p {
        color: white;
        font-weight: bold;
        font-size: 0.7em;
        text-align: center;
        line-height: 0.1em;
    }
    div {
        padding: 10px;
        display: flex;
        flex-direction: column;
        align-items: center;
    }
</style>