const canva = document.getElementById("canvas");
const particulaList = [];

const particula = {
  posicion : {x : 0 , y : 0},
  velocidad : {x : 1 , y : 1},
  color : "#FF9000",
  tamanio : 5,
};

const circulo = (canva, particula) => {
  const contexto = canva.createContext("2d");
  return {
    run : () => {
      contexto.fillStyle = particula.color;
      contexto.beginPath();
      contexto.arc(particula.posicion.x, particula.posicion.y, particula.tamanio, 0, 2 * Math.PI);
      contexto.fill();
    },
  };
};



const animacion = (i, canva, particulaList) => {
  requestAnimationFrame(
    () => {
      canva.width = document.body.clientWidth;
      canva.height = document.body.clientHeight;

      i && animacion(--i, canva, particulaList);
    },
  );
};

animacion(100, canva, particulaList);
