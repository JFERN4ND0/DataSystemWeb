const iniciarSesion = () => {
  const formLogin = document.getElementById("form_login");

  const datosU = {
    username: document.getElementById("login-user").value,
    password: document.getElementById("login-password").value,
  };

  fetch("api/login", {
    method: "POST",
    headers: {
      Accept: "application/json",
      "Content-type": "application/json",
    },
    body: JSON.stringify(datosU),
  })
  .then((res) => res.text())
  .then((data) => {
    if(data != "FAIL") {
        localStorage.token = data;
        localStorage.username = datosU.username;
        window.location.href = "administrador.html";
    } else alert("credenciales incorrectas");
  });
};