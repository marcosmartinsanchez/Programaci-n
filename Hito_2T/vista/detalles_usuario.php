<?php
require_once '../config/db_config.php';
require_once '../modelo/Class_Usuario.php';

$usuario = new Usuario($conn);
$id = $_GET['id'];
$usuarios = $usuario->obtenerUsuario();
$user = array_filter($usuarios, fn($u) => $u['id'] == $id)[0];
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Detalles del Usuario</title>
</head>
<body>
    <h1>Detalles del Usuario</h1>
    <p><strong>ID:</strong> <?php echo $user['id']; ?></p>
    <p><strong>Nombre:</strong> <?php echo $user['nombre']; ?></p>
    <p><strong>Email:</strong> <?php echo $user['email']; ?></p>
    <p><strong>Edad:</strong> <?php echo $user['edad']; ?></p>
    <p><strong>Plan Base:</strong> <?php echo $user['plan_base']; ?></p>
    <p><strong>Paquete Adicional:</strong> <?php echo $user['paquete_adicional']; ?></p>
    <p><strong>Duración:</strong> <?php echo $user['duracion']; ?></p>
    <a href="index.php">Volver a la lista de usuarios</a>
</body>
</html>