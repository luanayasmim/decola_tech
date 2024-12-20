/*
    A função deste arquivo receberá três parâmetros: (dia, mês e ano)

    Com base nessas informações, determinar quantos dias restam para terminar o ano.
*/

module.exports = function (day, month, year) {
    //produzir os parêmetros como tipos numericos inteiro
    day = parseInt(day);
    month = parseInt(month);
    year = parseInt(year);

    if (month < 1 || month > 12) throw new Error("Mês inválido");

    // um ano bissexto deve ser divisivel por 4
    const months = [31, year % 4 == 0 ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];

    if (day < 1 || day > months[month - 1]) throw new Error("Dia inválido para o mês selecionado.");

    let remainingDays = months[month - 1] - day;

    for (let i = month; i < months.length; i++)
        remainingDays = remainingDays + months[i];

    return remainingDays;
}