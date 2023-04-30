<?php
    
    $host = "localhost";
    $DB_name = "mail";
    $DB_user = "user";
    $DB_pass = "password";

    $DB_conn = mysqli_connect( $host, $DB_user, $DB_pass, $DB_name );

    if ( isset( $_GET[ 'user' ] ) )  {
        $user = $_POST[ 'user' ] );
        $password = $_POST[ 'password' ] );
        
        $query = mysqli_query( $DB_conn, "SELECT nameUser, surnameUser, mail FROM User_Info WHERE password='$password' and user='$user'" );
        $row = mysqli_fetch_array( $query );

        $num_row    = mysqli_num_rows( $query );
                        
        if ( $num_row > 0 )  {   
            print( "Todo OK!" );            
        }
        else  {
            print( "Denegado!" ); 
        }
    }
?>