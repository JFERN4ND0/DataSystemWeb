$(document).ready(function () {
  cargarUsuarios();
});

// const cargarUsuario = () => {
//   fetch("usuario/123", {
//     method: "GET",
//     headers: {
// "Accept": 'aplication/json',
//       "Content-type": "application/json",
//     },
//   })
//     .then((res) => res.json())
//     .then((data) => console.log(data));
// };

const cargarUsuarios = () => {
  let listUser = "";

  fetch("api/usuarios", {
    method: "GET",
    headers: {
      "Accept": "application/json",
      "Content-type": "application/json",
    },
  })
    .then((res) => res.json())
    .then((data) => {
      for (const user in data) {
        const usuario = `<tr><td>${data[user].id}</td><td>${data[user].nombre_u}</td><td>${data[user].username}</td><td>${data[user].nivel}</td><td>${data[user].estado}</td></tr>`;
        listUser += usuario;
      }
      document.querySelector("#table-user tbody").outerHTML = listUser;
    });
};
