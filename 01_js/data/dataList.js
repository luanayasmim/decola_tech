exports.names = ['Carlos', 'Daniela', 'Marcos', 'Bernardo', 'Ana Paula'];

// Aplicação = frontend, app02 - importar
// Biblioteca = backend, exportar os nomes

exports.company = {
    description: "Avanade",
    city: "Recife",
    year: 2024,
    people: exports.names, // Se refere ao módulo
};
