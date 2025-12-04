<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Student Registration</title>

<style>
    body {
        margin: 0;
        padding: 0;
        font-family: Arial, sans-serif;
        background: linear-gradient(135deg, #0078ff, #5bbcff);
        min-height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        color: white;
    }

    .container {
        text-align: center;
        background: rgba(255, 255, 255, 0.15);
        padding: 40px 30px;
        border-radius: 16px;
        backdrop-filter: blur(10px);
        width: 90%;
        max-width: 420px;
        box-shadow: 0 6px 20px rgba(0, 0, 0, 0.2);
    }

    h2 {
        margin-bottom: 15px;
        font-size: 28px;
        font-weight: bold;
        color: #fff;
    }

    p {
        font-size: 16px;
        margin-bottom: 25px;
        color: #f8f8f8;
    }

    .btn {
        display: inline-block;
        padding: 12px 20px;
        background: #fff;
        color: #0078ff;
        font-size: 16px;
        font-weight: bold;
        border-radius: 10px;
        text-decoration: none;
        transition: 0.3s;
    }

    .btn:hover {
        background: #e6e6e6;
    }
</style>

</head>
<body>

<div class="container">
    <h2>Welcome to Student Registration</h2>
    <p>Please click below to continue with the student registration process</p>
    <a href="reg" class="btn">Register Now</a>
</div>

</body>
</html>
