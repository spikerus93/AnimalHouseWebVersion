function showGeneralInfo() {
    alert(`В питомнике ${animals.length} животных\n\n${animals.map((animal) =>
        `- ID: ${animal.id}\n  Тип: ${animal.type},
         Семейство: ${animal.family}\n
         Кличка: ${animal.name}\n
         Дата рождения: ${animal.birthDate}`).join('\n')}`);
}