const iniciarSesion = () => {
    const formLogin = document.getElementById("form_login");
    let encontrado;

    const datosU = {
        username: document.getElementById("login-user").value,
        password: document.getElementById("login-password").value,
    };

    fetch("api/login", {
        method: "POST",
        headers: {
            'Accept': "application/json",
            "Content-type": "application/json",
        },
        body: JSON.stringify(datosU),
    })
     .then((res) => res.json())
     .then((data) => {
        console.log(data);
     });
};