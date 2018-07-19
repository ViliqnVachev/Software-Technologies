function slove(arr) {
    let result = [];

    for (let i = 0; i < arr.length; i++) {
        let line = arr[i].split(' ');
        let comand = line[0];

        if (comand === 'add') {
            let number = line[1];
            result.push(number);
        }
        else {
            let index = line[1];
            result.splice(index, 1);
        }

    }
    console.log(result.join('\r\n'));
}

slove(['add 3', 'add 5', 'remove 1','add 2']);