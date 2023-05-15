<script>
    export let song;
<<<<<<< HEAD


=======
    let Int;
    song.releaseYear = Int;
>>>>>>> 196ee02b7edba2ecab2b2106f9aea835d23248b3
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