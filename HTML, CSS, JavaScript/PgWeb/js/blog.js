const URL = "https://api.thedogapi.com/v1/images/search";

function cargarImg(){
  fetch(URL)
    .then(res => res.json())
    .then(data => {
      const img = document.querySelector('#imgAPI');
      img.src = data[0].url;
    });
}

cargarImg();

const btnRecargar = document.getElementById('recargar');

btnRecargar.addEventListener('click', () => {
  cargarImg();
});
