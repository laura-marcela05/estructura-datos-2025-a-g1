let edad = 12;
let control;

// Gestionar el control
if (edad >= 1 && edad <= 130) {
    control = true;
} else {
    control = false;
}

// Evaluar la edad
if (!(control)) {
    if (edad >= 18) {
        console.log("Mayor de edad");
    } else {
        console.log("Menor de edad");
    }
} else {
    console.log("Edad incorrecta");
}
