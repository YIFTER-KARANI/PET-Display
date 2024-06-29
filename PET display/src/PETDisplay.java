<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pet Selector</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            display: flex;
            flex-direction: column;
            align-items: center;
            padding: 20px;
        }
        #pet-image {
            width: 300px;
            height: 300px;
            border: 1px solid #ccc;
            margin-top: 20px;
            display: flex;
            justify-content: center;
            align-items: center;
            font-size: 24px;
        }
    </style>
</head>
<body>
    <h1>Select a Pet</h1>
    <div>
        <input type="radio" id="bird" name="pet" value="bird">
        <label for="bird">Bird</label>

        <input type="radio" id="cat" name="pet" value="cat">
        <label for="cat">Cat</label>

        <input type="radio" id="dog" name="pet" value="dog">
        <label for="dog">Dog</label>

        <input type="radio" id="rabbit" name="pet" value="rabbit">
        <label for="rabbit">Rabbit</label>

        <input type="radio" id="pig" name="pet" value="pig">
        <label for="pig">Pig</label>
    </div>
    <div id="pet-image">Select a pet</div>

    <script>
        const petImage = document.getElementById('pet-image');
        const radioButtons = document.querySelectorAll('input[type="radio"]');

        radioButtons.forEach(radio => {
            radio.addEventListener('change', (e) => {
                const selectedPet = e.target.value;
                petImage.textContent = `You selected a ${selectedPet}!`;
                // Here you can add code to display an actual image of the selected pet
                // For example: petImage.innerHTML = `<img src="images/${selectedPet}.jpg" alt="${selectedPet}">`;
            });
        });
    </script>
</body>
</html>