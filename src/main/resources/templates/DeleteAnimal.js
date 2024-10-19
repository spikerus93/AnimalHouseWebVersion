function deleteAnimalRecord() {
    const id = parseInt(prompt('Введите ID: ', ''));
    if (isNaN(id)) {
        alert('Некорректный ID. Попробуйте еще раз.');
        return;
    }

    const index = animals.findIndex((animal) => animal.id === id);
    if (index === -1) {
        alert('Животное с указанным ID не найдено. Попробуйте снова.');
        return;
    }

    animals.splice(index, 1);

    alert('Сведения о животном успешно удалены.');
}
