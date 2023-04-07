$(document).ready(function() {
  cargarUsuarios();
  $('#table-user').DataTable();
});

/*
async function cargarUsuarios() {
  const rawResponse = await fetch("usuario/123", {
    method: "GET",
    headers: {
      'Accept': "aplication/json",
      "Content-type": "application/json",
    },
  });
  const usuarios = await rawResponse.json();
  console.log(usuarios);
};*/

const cargarUsuarios = () => {
fetch('usuario/123',{
        method: 'GET',
        body: JSON.stringify(newPost),
        headers: {
            "Content-type": "application/json"
        }
    }).then(res => res.json())
    .then(data => console.log(data))
}