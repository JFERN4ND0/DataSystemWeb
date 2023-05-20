const registrarClientes = () => {
  const r_name_c = document.getElementById("r_name_c").value;
  const r_email_c = document.getElementById("r_email_c").value;
  const r_telephone_c = document.getElementById("r_telephone_c").value;
  const r_direction_c = document.getElementById("r_direction_c").value;

  const arreglodatos = [
    r_name_c,
    r_email_c,
    r_telephone_c,
    r_direction_c
  ];

  if (validarDatos(arreglodatos)) {
    const datosC = {
      nombre_c: r_name_c,
      email_c: r_email_c,
      telefono_c: r_telephone_c,
      direction: r_direction_c,
      ultima_modificacion: "Mi",
    };

    fetch("api/rCliente", {
      method: "POST",
      headers: {
        "Accept": "application/json",
        "Content-type": "application/json",
      },
      body: JSON.stringify(datosC),
    }).then((res) => console.log(res.json()));
    alert("Cliente agregado con exito");
    //location.reload();
  }
};