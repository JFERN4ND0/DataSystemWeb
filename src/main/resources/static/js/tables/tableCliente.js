$(document).ready(function () {
  cargarClientes();
});

const cargarClientes = () => {
  let listCliente = "";

  fetch("api/tClientes", {
    method: "GET",
    headers: {
      "Accept": "application/json",
      "Content-type": "application/json",
    },
  })
    .then((res) => res.json())
    .then((data) => {
      for (const cliente in data) {
        const cl = `<tr><td>${data[cliente].id_cliente}</td><td>${data[cliente].nombre_c}</td><td>${data[cliente].email_c}</td><td>${data[cliente].telefono_c}</td><td>${data[cliente].ultima_modificacion}</td></tr>`;
        listCliente += cl;
      }
      document.querySelector("#table-client tbody").outerHTML = listCliente;
    });
};
