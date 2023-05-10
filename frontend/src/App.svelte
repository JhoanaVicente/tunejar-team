
<script>
import Header from "./components/header.svelte"
</script>


	<div class="container">

		<Header/>

		<div class="hero-main">
			<div>
				<h1>Mis canciones</h1>
			</div>

			<div>
				<h1>Catalogo</h1>
			</div>

		</div>

	</div>


<style>


	.container{
		width: 100%;
		height: 100vh;
		background-image: url(/images/fondo.png);
		background-size: 100%;
		background-repeat: no-repeat;
	}


	h1 {
		color: white;
		font-size: 2em;
		font-weight: 400;
	}



	.hero-main{
		display: grid;
		grid-template-columns: repeat(1fr, 1fr);
		gap: 3%;


	}




	@media (min-width: 640px) {
		main {
			max-width: none;
		}
	}
</style>