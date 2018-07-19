function slove(arr) {
    let result = {};

    for (let i = 0; i < arr.length - 1; i++) {
        let tokens = arr[i].split(' ');

        let key = tokens[0];
        let value = tokens[1];


            result[key] = value;

    }
    let keyQ = arr[arr.length - 1];
    if (keyQ in result) {

        console.log(result[keyQ]);

    } else {
        console.log('None')
    }

}

slove(['key value', 'key eulav', 'test tset', 'key'])