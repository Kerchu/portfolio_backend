const express = require('express');
const router = express.Router();

const mysqlConnection = require('../connections/connection');

const jwt = require('jsonwebtoken');

router.get('/', (req,res) => {
    mysqlConnection.query('select * from users', (err,rows,fields)=>{
        if(!err){
            res.json(rows);
        }else{
            console.log(err);
        }
    })
});

router.post('/login', (req,res)=>{
    const { userName, pass } = req.body;
    mysqlConnection.query('select userName, roleID from users where username=? and pass=?',
    [userName, pass],
    (err,rows,field)=>{
        if(!err){
            if(rows.length>0){
                let data = JSON.stringify(rows[0]);
                const token = jwt.sign(data, 'kaede');
                res.json({token});
            }else{
                res.json('Wrong Mail or Password')
            }
        }else{
            console.log(err);
        }
    })
})

router.post('/test',verifyToken, (req,res)=>{
    res.json('Information');
})

function verifyToken(req,res,next){
    if(!req.headers.authorization) return res.status(401).json('Unauthorized');
    const token = req.headers.authorization.substr(7);
    if(token!=''){
        const content = jwt.verify(token, 'kaede');
        req.data = content;
        next();
    }else{
        res.status(401).json('Empty Token');
    }
}

module.exports = router;
