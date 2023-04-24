const registrarUsuarios = () => {
  const r_name_user = document.getElementById("r_name_user").value;
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

  if (validarDatos(arreglodatos)) {
    const datosU = {
      nombre_u: r_name_user,
      email_u: r_email_user,
      telefono_u: r_telephone_user,
      username: r_username,
      password: r_password,
      nivel: r_roll,
      estado: "Activo",
      registradopor: "Mi",
    };

    fetch("api/rusuarios", {
      method: "POST",
      headers: {
        "Accept": "application/json",
        "Content-type": "application/json",
      },
      body: JSON.stringify(datosU),
    });
    alert("Usuario agregado con exito");
    location.reload();
  }
};

const validarDatos = (adatos) => {
  for (const dato of adatos) {
    if (dato == "") {
      window.alert("Todos los campos deben estar llenos");
      return false;
    }
  }
  return true;
};
