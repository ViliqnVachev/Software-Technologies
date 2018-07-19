function sum(input) {
    let numbers = input[0].split(' ');
    let a = Number(numbers[0]);
    let b = Number(numbers[1]);
    let c = Number(numbers[2]);
    let result;
    if (a + b == c) {
        result = `${Math.min(a, b)} + ${Math.max(a, b)} = ${c}`;
    }
    else if (b + c == a) {
        result = `${Math.min(b, c)} + ${Math.max(b, c)} = ${a}`;
    }
    else if (c + a == b) {
        result = `${Math.min(a,c)} + ${Math.max(a, c)} = ${b}`;
    }
    else {
        result='No';
    }
    console.log(result);
}

sum("-3 -2 -5");