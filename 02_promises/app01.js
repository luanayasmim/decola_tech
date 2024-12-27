const getPromise = require('./promises2');

async function testPromise() {
    try {
        const value = await getPromise();
        console.log(value);
    } catch (err) {
        console.error(err)
    }
}

testPromise();