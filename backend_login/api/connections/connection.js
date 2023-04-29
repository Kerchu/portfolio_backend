const mysql = require('mysql');

const mysqlConnection = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: 'rootpass',
    database: 'hostdb',
    port: '3306'
});
mysqlConnection.connect( err => {
    if (err){
        console.log('Error in db: ', err);
        return;
    }else{
        console.log('DB up!!');
    }
});

module.exports = mysqlConnection;