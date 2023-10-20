<?php
session_start(); // Inicia la sesión (si no está iniciada)

// Comprueba si se ha enviado el formulario de inicio de sesión
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Datos de tu base de datos
    $servername = "localhost";
    $username = "root";
    $password = "";
    $dbname = "basw";

    // Recoge los datos del formulario
    $usernameInput = $_POST['username'];
    $passwordInput = $_POST['password'];

    // Conexión a la base de datos
    $conn = new mysqli($servername, $username, $password, $dbname);

    if ($conn->connect_error) {
        die("Error en la conexión a la base de datos: " . $conn->connect_error);
    }

    // Consulta SQL para verificar las credenciales
    $sql = "SELECT * FROM usuario WHERE usuario_nick = '$usernameInput' AND contraseña = '$passwordInput'";
    $result = $conn->query($sql);

    if ($result->num_rows == 1) {
        // Las credenciales son válidas, inicia la sesión y almacena el nombre de usuario
        $_SESSION['username'] = $usernameInput;
        header("Location: inicio.php"); // Redirige al usuario a la página de inicio
        exit();
    } else {
        // Credenciales incorrectas, muestra un mensaje de error
        $error_message = "Nombre de usuario o contraseña incorrectos.";
    }

    $conn->close();
}
?>

<!DOCTYPE html>
<html>
<head>
    <title>Inicio de Sesión</title>
</head>
<body>
    <h2>Iniciar Sesión</h2>

    <?php
    // Muestra el mensaje de error si existe
    if (isset($error_message)) {
        echo "<p>$error_message</p>";
    }
    ?>

    <form action="login.php" method="POST">
        <label for="username">Nombre de Usuario:</label>
        <input type="text" id="username" name="username" required><br><br>
        <label for="password">Contraseña:</label>
        <input type="password" id="password" name="password" required><br><br>
        <input type="submit" value="Iniciar Sesión">
    </form>
</body>
</html>