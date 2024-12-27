exports.names = ['Carlos', 'Daniela', 'Marcos', 'Bernardo', 'Ana Paula'];

// Aplicação = frontend, app02 - importar
// Biblioteca = backend, exportar os nomes

exports.company = {
    description: "Avanade",
    city: "Recife",
    year: 2024,
    people: exports.names, // Se refere ao módulo
};

exports.courses = [
    { description: 'Psicologia', ch: 4800, shift: 'morning', status: true },
    { description: 'Análise e Desenvolvimento de Sistemas', ch: 2800, shift: 'evening', status: true },
    { description: 'Turismo', ch: 3200, shift: 'full-time', status: false },
]