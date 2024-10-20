function getDataById() {
    const id = parseInt(prompt('Введите ID: ', ''));
    if (isNaN(id)) {
        alert('Некорректный ID. Попробуйте еще раз.');
        return;
    }

    const animal = animals.find((animal) => animal.id === id);
    if (!animal) {
        alert('Животное с указанным ID не найдено. Попробуйте снова.');
        return;
    }
}