document.addEventListener('DOMContentLoaded', () => {
    document.getElementById('new-animal-form').onsubmit = async (event) => {
        event.preventDefault();

        const name = document.getElementById('name').value;
        const birthdate = document.getElementById('birthdate').valueAsDate;

        try {
            await fetch('/api/animals', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify({ name, birthdate })
            });

            location.reload();
        } catch (error) {
            console.log(error);
        }
    };

    loadAnimals();
});

async function loadAnimals() {
    const response = await fetch('/api/animals');
    const animals = await response.json();

    animals.forEach((animal) => {
        const row = `<tr>
            <td>${animal.id}</td>
            <td>${animal.name}</td>
            <td>${animal.type}</td>
            <td>${animal.birthDate.toLocaleDateString()}</td>
            <td>${animal.commands.join(', ')}</td>
        </tr>`;
        document.getElementById('animals-table-body').innerHTML += row;
    });
}