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
    <title>Eliminar Usuario</title>
</head>
<body>
    <h1>Eliminar Usuario</h1>
    <form action="UsuarioController.php" method="POST">
        <select name="id" required>
            <option value="">Selecciona un usuario</option>
            <?php foreach ($usuarios as $user): ?>
                <option value="<?php echo $user['id']; ?>"><?php echo $user['nombre']; ?></option>
            <?php endforeach; ?>
        </select>
        <button type="submit" name="eliminar">Eliminar Usuario</button>
    </form>
    <a href="index.php">Volver a la lista de usuarios</a>
</body>
</html>