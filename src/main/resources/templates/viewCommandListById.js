function viewCommandListById() {
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

    alert(`Список команд:\n\nid: ${animal.id}\nКличка: ${animal.name}\nТип: ${animal.type}, Семейство: ${animal.family}\nКоманды: [${animal.commands.join(', ')}]`);
}