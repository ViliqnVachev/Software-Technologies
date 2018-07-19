function slove(arr) {
    let result = {};

    for (let i = 0; i < arr.length - 1; i++) {
        let tokens = arr[i].split(' ');

        let key = tokens[0];
        let value = tokens[1];


        if(key in result===false){
            result[key]=[];
        }
        result[key].push(value);

    }
    let keyQ = arr[arr.length - 1];
    if (keyQ in result) {

        console.log(result[keyQ].join('\r\n'));

    } else {
        console.log('None')
    }

}

slove(['key value', 'key eulav', 'test tset', 'key'])