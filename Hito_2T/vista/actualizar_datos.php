<?php
require_once '../config/db_config.php';
require_once '../modelo/Class_Usuario.php';

$usuario = new Usuario($conn);
$usuarios = $usuario->obtenerUsuario();
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Actualizar Datos</title>
</head>
<body>
    <h1>Actualizar Datos de Usuario</h1>
    <form action="UsuarioController.php" method="POST">
        <select name="id" required>
            <option value="">Selecciona un usuario</option>
            <?php foreach ($usuarios as $user): ?>
                <option value="<?php echo $user['id']; ?>"><?php echo $user['nombre']; ?></option>
            <?php endforeach; ?>
        </select>
        <select name="plan_base" required>
            <option value="Básico">Básico</option>
            <option value="Estándar">Estándar</option>
            <option value="Premium">Premium</option>
        </select>
        <select name="paquete_adicional">
            <option value="">Ninguno</option>
            <option value="Deporte">Deporte</option>
            <option value="Cine">Cine</option>
            <option value="Infantil">Infantil</option>
        </select>
        <button type="submit" name="actualizar">Actualizar Datos</button>
    </form>
    <a href="index.php">Volver a la lista de usuarios</a>
</body>
</html>