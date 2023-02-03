const baseEndpoint = 'https://api.github.com';
const usersEndpoint = `${baseEndpoint}/users`;

const $n = document.querySelector('[name="name"]');
const $b = document.querySelector('[name="blog"]');
const $l = document.querySelector('[name="location"]');

async function displayUser(username) { //faltaba async
  $n.textContent = 'cargando...';
  const response = await fetch(`${usersEndpoint}/${username}`);
  //Se necesita un metodo JSON
  const data = await response.json();
  console.log(data);
  $n.textContent = `${data.name}`;
  $b.textContent = `${data.blog}`;
  $l.textContent = `${data.location}`;
}

function handleError(err) {
  console.log('OH NO!');
  console.log(err);

  //Se le agrega el signo $ porque la constante estaba mal especificada

  $n.textContent = `Algo salió mal: ${err}`;
}

displayUser('stolinski').catch(handleError);