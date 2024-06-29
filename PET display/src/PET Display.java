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
            overflow: hidden;
        }
        #pet-image img {
            max-width: 100%;
            max-height: 100%;
            object-fit: contain;
        }
    </style>
</head>
<body>
    <h1>Select a Pet</h1>
    <div>
        <label><input type="radio" name="pet" value="bird"> Bird</label>
        <label><input type="radio" name="pet" value="cat"> Cat</label>
        <label><input type="radio" name="pet" value="dog"> Dog</label>
        <label><input type="radio" name="pet" value="rabbit"> Rabbit</label>
        <label><input type="radio" name="pet" value="pig"> Pig</label>
    </div>
    <div id="pet-image">
        <img id="pet-img" src="" alt="Selected pet" style="display: none;">
        <span id="no-pet">No pet selected</span>
    </div>

    <script>
        const petImage = document.getElementById('pet-image');
        const petImg = document.getElementById('pet-img');
        const noPet = document.getElementById('no-pet');
        const radioButtons = document.querySelectorAll('input[name="pet"]');

        // Add your image file names here
        const petImages = {
            bird: 'path/to/bird-image',
            cat: 'path/to/cat-image',
            dog: 'path/to/dog-image',
            rabbit: 'path/to/rabbit-image',
            pig: 'path/to/pig-image'
        };

        radioButtons.forEach(radio => {
            radio.addEventListener('change', (e) => {
                const selectedPet = e.target.value;
                if (petImages[selectedPet]) {
                    petImg.src = petImages[selectedPet];
                    petImg.alt = `${selectedPet.charAt(0).toUpperCase() + selectedPet.slice(1)}`;
                    petImg.style.display = 'block';
                    noPet.style.display = 'none';
                } else {
                    petImg.style.display = 'none';
                    noPet.style.display = 'block';
                    noPet.textContent = `No image available for ${selectedPet}`;
                }
            });
        });
    </script>
</body>
</html>