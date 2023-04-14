// $(document).ready(function () {
//   // const r_formulario = document.getElementById("formulario_r");
//   // r_formulario.submit();
// });

const registrarUsuarios = () => {
  console.log("llama a la funcion");
  const r_name_user = document.getElementById("r_name_user");
  const r_email_user = document.getElementById("r_email_user").value;
  const r_telephone_user = document.getElementById("r_telephone_user").value;
  const r_username = document.getElementById("r_username").value;
  const r_password = document.getElementById("register-password").value;
  const r_roll = document.getElementById("r_roll").value;
  const arreglodatos = [
    r_name_user,
    r_email_user,
    r_telephone_user,
    r_username,
    r_password,
  ];
  validarDatos(arreglodatos);

  const datos = {};

  fetch("api/usuarios", {
    method: "POST",
    headers: {
      "Content-type": "application/json",
    },
    body: JSON.stringify(datos),
  })
    .then((res) => res.json())
    .then((data) => console.log(data));
};

const validarDatos = (adatos) => {
  adatos.forEach((dato) => {
    if (dato == "") window.alert("Todos los campos deben estar llenos");
  });
};
