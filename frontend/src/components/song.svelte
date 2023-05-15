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
        width: 110px;
        border-radius: 30%;
    }

    p {
        color: white;
        font-size: 0.7em;
        text-align: center;
        line-height: 0.2em;
    }
    div {
        padding: 10px;
        display: flex;
        flex-direction: column;
    }

</style>