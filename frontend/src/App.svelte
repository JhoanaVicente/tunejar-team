
<script>
	export let name;
</script>



<main>
	<div class="container">
		<header>
			<img src="/images/logo.png" alt="Logo">
			<h2>Disfruta de la mejor musica</h2>
		</header>
	</div>
</main>

<style>
	@import url('https://fonts.googleapis.com/css2?family=Roboto+Mono:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;1,100;1,200;1,300;1,400;1,500;1,600;1,700&display=swap');



	main {
		margin: 0;
		padding: 0;
		box-sizing: border-box;
		font-family: "Roboto Mono"
	}

	.container{
		width: 100%;
		height: 100vh;
		background-image: url(/images/fondo.png);
		background-size: 100%;
		background-repeat: no-repeat;
	}

	header{
		display: flex;
		align-items: center;
		flex-direction: column;
		padding-top: 25px;
	}

	h2 {
		color: black;
		font-size: 1em;
		font-weight: 400;
		text-align: center;
	}






	@media (min-width: 640px) {
		main {
			max-width: none;
		}
	}
</style>