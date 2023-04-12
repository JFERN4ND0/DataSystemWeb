$(document).ready(function () {
  // const r_formulario = document.getElementById("formulario_r");
  // r_formulario.submit();
});

const registrarUsuarios = () => {
  const r_name_user = document.getElementById("r_name_user");
  const r_email_user = document.getElementById("r_email_user").value;
  const r_thelephone_user = document.getElementById("r_thelephone_user").value;
  const r_username = document.getElementById("r_username").value;
  const r_password = document.getElementById("register-password").value;
  const r_roll = document.getElementById("r_roll").value;

  if (r_name_user.value == "") window.alert("No pueden haber campos vacios");

  const datos = {};

  fetch("api/usuarios", {
    method: "POST",
    headers: {
      Accept: "aplication/json",
      "Content-type": "application/json",
    },
    body: JSON.stringify(datos),
  })
    .then((res) => res.json())
    .then((data) => console.log(data));
};
