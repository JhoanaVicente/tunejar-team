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
        width: 150px;
        border-radius: 5%;
    }

    p {
        color: black;
        font-weight: bold;
        font-size: 0.7em;
        text-align: center;
        line-height: 0.1em;
    }
    div {
        padding: 10px;
        display: flex;
        flex-direction: column;
    }



</style>