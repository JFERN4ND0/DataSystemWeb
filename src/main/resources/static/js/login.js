const iniciarSesion = () => {
  const formLogin = document.getElementById("form_login");
  const uname = document.getElementById("login-user").value;
  const pss = document.getElementById("login-password").value;

  const datosU = {
    username: uname,
    password: pss,
  };

  fetch("api/login", {
    method: "POST",
    headers: {
      "Accept": "application/json",
      "Content-type": "application/json",
    },
    body: JSON.stringify(datosU),
  })
  .then((res) => {
  const resp = res.text();
  console.log(resp);
  });
};
