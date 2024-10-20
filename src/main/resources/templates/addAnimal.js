function addNewAnimal() {
    const animalType = prompt('Выберите тип животного:', '');
    if (animalType === null) return; // если пользователь нажал Cancel

    let newAnimalData = {};
    switch (animalType) {
        case 'Собака':
            newAnimalData = {
                type: 'Домашнее животное',
                family: 'Собака'
            };
            break;
        case 'Кошка':
            newAnimalData = {
                type: 'Домашнее животное',
                family: 'Кошка'
            };
            break;
        case 'Хомяк':
            newAnimalData = {
                type: 'Домашнее животное',
                family: 'Грызун'
            };
            break;
        case 'Лошадь':
            newAnimalData = {
                type: 'Вьючное животное',
                family: 'Лошадь'
            };
            break;
        case 'Верблюд':
            newAnimalData = {
                type: 'Вьючное животное',
                family: 'Верблюд'
            };
            break;
        case 'Осел':
            newAnimalData = {
                type: 'Вьючное животное',
                family: 'Осел'
            };
            break;
        default:
            console.error(`Неизвестный тип животного: ${animalType}`);
            return;
    }

    const name = prompt('Введите кличку:', '');
    if (!name || name === '') {
        alert('Кличка не может быть пустой строкой. Попробуйте еще раз.');
        return;
    }

    const birthYear = prompt('Введите год рождения:', '');
    if (!birthYear || isNaN(parseInt(birthYear))) {
        alert('Год рождения должен быть числом. Попробуйте еще раз.');
        return;
    }

    const birthMonth = prompt('Введите месяц рождения:', '');
    if (!birthMonth || isNaN(parseInt(birthMonth))) {
        alert('Месяц рождения должен быть числом. Попробуйте еще раз.');
        return;
    }

    const birthDay = prompt('Введите день рождения:', '');
    if (!birthDay || isNaN(parseInt(birthDay))) {
        alert('День рождения должен быть числом. Попробуйте еще раз.');
        return;
    }

    const birthDate = `${birthYear}-${birthMonth}-${birthDay}`;

    // Проверка наличия ошибок
    if (!newAnimalData || !name || !birthDate) {
        alert('Произошла ошибка при вводе данных. Попробуйте снова.');
        return;
    }

    // Пример добавления нового животного в список
    // Приведенный ниже код является упрощенным примером без учета
    // необходимости использования базы данных или другого хранилища данных
    animals.push({
        id: animals.length + 1,
        ...newAnimalData,
        name,
        birthDate
    });

    alert(`Данные сохранены.\nID: ${animals.length}\nТип: ${newAnimalData.type}, Семейство: ${newAnimalData.family}, кличка: ${name}, дата рождения: ${birthDate}`);
}