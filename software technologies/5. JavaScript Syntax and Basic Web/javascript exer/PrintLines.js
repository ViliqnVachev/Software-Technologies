function slove(arr) {

        let tokens=[];
    while (true){
        for (let i = 0; i < arr.length; i++) {
            if(arr[i]==='Stop'){
                break;
            }else {
                tokens.push(arr[i]);
            }

        }
        break;
    }
    console.log(tokens.join('\r\n'));
}

slove(['Line 1', 'Line 2','Line 3','Stop','10','12'])