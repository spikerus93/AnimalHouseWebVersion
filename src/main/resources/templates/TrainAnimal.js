function trainAnimal() {
    const id = parseInt(prompt('Введите ID: ', ''));
    if (isNaN(id)) {
        alert('Некорректный ID. Попробуйте еще раз.');
        return;
    }

    const command = prompt('Добавьте новую команду:', '');
    if (!command || command === '') {
        alert('Команда не может быть пустой строкой. Попробуйте еще раз.');
        return;
    }

    // Пример добавления новой команды к существующему животному
    // Приведенный ниже код является упрощенным примером без учета
    // необходимости использования базы данных или другого хранилища данных
    const animal = animals.find((animal) => animal.id === id);
    if (!animal) {
        alert('Животное с указанным ID не найдено. Попробуйте снова.');
        return;
    }

    animal.commands.push(command);

    alert('Данные сохранены.');
}