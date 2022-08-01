<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Cita Dentista </h1>
    <form action="registrar cita" method="post">
    
    <div>
            <label for="dia_cita">Dia_Cita: </label>
           <input type="date" name="dia cita" id="dia cita">
        </div>

        <div>
            <label for="hora_cita">Hora_Cita: </label>
            <input type="time" name="hora cita" id="hora cita">
        </div>

        <div>
            <label for="nombre">Nombre: </label>
            <input type="text" name="nombre" id="nombre">
        </div>

        <div>
            <label for="apellidos">Apellidos: </label>
            <input type="text" name="apellidos" id="apellidos">
        </div>

        <div>
            <label for="centro">Centro: </label>
            <select name="centro" id="centro">
                <option value="1">Centro Dental Colon</option>
                <option value="2">Centro prótesis dental Guerrita</option>
                <option value="3">Centro estomatología Fidiana</option>
                <option value="4">Centro implantología Sector Sur</option>
                
            </select>
        </div>

        <div>
            <label for="">Tipo: </label>
    
                 <label for="texto">Nueva_Cita</label>
                 <input type="radio" name="tipo" id="nueva_cita" value="nueva_cita" checked>
    
                 <label for="novela">Revision</label>
                 <input type="radio" name="tipo" id="revision" value="revision">
        </div>

        <div>
            <input type="submit" value="Confirmar">
            <input type="reset" value="Limpiar">

        </div>
    
    
 

</body>
</html>