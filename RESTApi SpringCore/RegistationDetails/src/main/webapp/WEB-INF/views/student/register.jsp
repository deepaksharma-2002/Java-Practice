<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Registration</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f3f4f6;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .container {
            background: white;
            width: 90%;
            max-width: 450px;
            padding: 25px;
            border-radius: 10px;
            box-shadow: 0 4px 10px rgba(0,0,0,0.1);
        }

        h2 {
            text-align: center;
            margin-bottom: 25px;
            color: #333;
        }

        label {
            display: block;
            margin: 10px 0 5px;
            font-weight: bold;
        }

        input, textarea {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 16px;
        }

        button {
            width: 100%;
            padding: 12px;
            background: #0066ff;
            color: white;
            border: none;
            border-radius: 5px;
            margin-top: 20px;
            font-size: 18px;
            cursor: pointer;
        }

        button:hover {
            background: #004bcc;
        }
    </style>
</head>
<body>

    <div class="container">
        <h2>Student Registration</h2>

        <form action="submit" method="post">

            <label for="name">Full Name</label>
            <input type="text" name="name" placeholder="Enter your name" required>

            <label for="email">Email</label>
            <input type="email" name="email" placeholder="Enter your email" required>

            <label for="number">Mobile Number</label>
            <input type="text" name="number" placeholder="Enter your mobile number" required>

            <label for="address">Address</label>
            <textarea name="address" rows="3" placeholder="Enter your address" required></textarea>

            <button type="submit">Register</button> 
        </form>
        
        <p>Alreat Register See <a href="allStudents">student details</a></p>
    </div>

</body>
</html>
