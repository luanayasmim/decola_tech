module.exports = function (netSalary) {
    const rangeValues = [0, 2259.20, 2826.65, 3751.05, 4664.68];
    const taxesPercent = [0, 7.5, 15, 22.5, 27.5];

    let tax = 0;
    let calculationBasis = netSalary;

    for (let i = rangeValues.length - 1; i >= 0; i--) {
        if (calculationBasis > rangeValues[i]) {
            tax = tax + (calculationBasis - rangeValues[i]) * taxesPercent[i] / 100;
            calculationBasis = rangeValues[i];
        }
    }

    return tax;
}