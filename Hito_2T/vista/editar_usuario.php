<?php
require_once '../controlador/SociosController.php';
$controller = new UsuarioController();
$socios = $controller->listarUsuario();
?>
<div class="card mt-4">
    <div class="card-header">
        <h5>Editar Usuario</h5>
    </div>
    <div class="card-body">
        <form action="../controlador/SociosController.php?action=actualizar" method="POST">
            <input type="hidden" name="id" value="<?php echo $usuario['id']; ?>">
            <div class="form-group">
                <label for="nombre">Nombre</label>
                <input type="text" class="form-control" id="nombre" name="nombre" value="<?php echo $usuario['nombre']; ?>" required>
            </div>
            <div class="form-group">
                <label for="apellido">Apellido</label>
                <input type="text" class="form-control" id="apellido" name="apellido" value="<?php echo $usuario['apellido']; ?>" required>
            </div>
            <div class="form-group">
                <label for="email">Email</label>
                <input type="email" class="form-control" id="email" name="email" value="<?php echo $usuario['email']; ?>" required>
            </div>
            <div class="form-group">
                <label for="apellido2">Segundo Apelllido</label>
                <input type="text" class="form-control" id="apellido2" name="apellio2" value="<?php echo $usuario['apellido2']; ?>" required>
            </div>
            <button type="submit" class="btn btn-primary">Actualizar Usuario</button>
            <a href="index.php?action=lista" class="btn btn-secondary">Cancelar</a>
        </form>
    </div>
</div>