<!-- Comienza código: create.php -->
<?PHP
session_start();
$message = $_SESSION['message']; 
$message_type = $_SESSION['message_type']; 
if(isset($message)) { ?>
    <div class="alert alert-<?PHP echo $message_type ?> alert-dismissible fade show" role="alert">
    <p><?PHP echo $message; ?></p>

    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
    </div>

<?PHP 
    session_unset(); 
} ?>

<div class="card card-body">
    <div class="card-header">Crear Persona</div>
    <form action="./insert.php" method="POST">
        <div class="form-group">
            <div class="mb-3">
                <label for="name">Nombre</label>
                <input type="text" id="name" name="name" class="form-control" placeholder="Escriba su nombre" autofocus required>
            </div>
        
            <div class="mb-3">
                <label for="surname">Apellido</label>
                <input type="text" name="surname" class="form-control" placeholder="Escriba su apellido" autofocus required>
            </div>
        
            <div class="mb-3">
                <label for="name">Teléfono</label>
                <input type="text" name="phone" class="form-control" placeholder="Escriba su teléfono" autofocus>
            </div>
        
            <div class="mb-3">
                <label for="name">E-mail</label>
                <input type="email" name="email" class="form-control" placeholder="Escriba su email" autofocus>
            </div>
        </div>
        <input type="submit" class="btn btn-success" name="create" value="Crear">
    </form>
</div>
