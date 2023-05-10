<script>
    export let song;
</script>
<div>
    <img src={song.coverUrl} alt="caratula del disco">
    <p>{song.title}</p>
    <p>{song.author}</p>
</div>

<style>
    img {
        width: 150px;
    }

    p {
        color: white;
    }
    div {
        display: flex;
        flex-direction: column;
    }

</style>