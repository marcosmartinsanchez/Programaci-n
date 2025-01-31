<?php
require_once '../controlador/SociosController.php';
$controller = new UsuarioController();
$socios = $controller->listarUsuario();
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Listado de Usuarios</title>
</head>
<body>
    <h1>Usuarios Registrados</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Nombre</th>
            <th>Apellido</th>
            <th>Email</th>
            <th>Segundo Apellido</th>
            <th>Edad</th>
        </tr>
        <?php foreach ($usuario as $usuario): ?>
            <tr>
                <td><?= $usuario['id_usuario'] ?></td>
                <td><?= $usuario['nombre'] ?></td>
                <td><?= $usuario['apellido'] ?></td>
                <td><?= $usuario['email'] ?></td>
                <td><?= $usuario['apellido2'] ?></td>
                <td><?= $usuario['edad'] ?></td>
                <td>
                    <a href="editar_usuario.php?id=<?= $usuario['id_usuario'] ?>">Editar</a>
                    <a href="eliminar_usuario.php?id=<?= $usuario['id_usuario'] ?>">Eliminar</a>
                </td>
            </tr>
        <?php endforeach; ?>
    </table>
    <br>
    <a href="alta_usuario.php">Agregar un nuevo usuario</a>
</body>
</html>
