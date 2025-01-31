<?php
require_once '../modelo/class_socio.php';

class UsuarioController {
    private $modelo;

    public function __construct() {
        $this->modelo = new Usuario();
    }

    public function agregarUsuario($nombre, $apellido, $email, $apellido2, $edad) {
        $this->modelo->agregarUsuario($nombre, $apellido, $email, $apellido2, $edad);
    }

    public function listarUsuario() {
        return $this->modelo->obtenerUsuario();
    }

    public function obtenerUsuarioPorId($id_usuario) {
        return $this->modelo->obtenerUsuarioPorId($id_usuario);
    }

    public function actualizarUsuario($id_usuario, $nombre, $apellido, $email, $apellido2, $edad) {
        $this->modelo->actualizarUsuario($id_usuario, $nombre, $apellido, $email, $apellido2, $edad);
    }

    public function eliminarUsuario($id_usuario) {
        $this->modelo->eliminarUsuario($id_usuario);
    }
}
?>
