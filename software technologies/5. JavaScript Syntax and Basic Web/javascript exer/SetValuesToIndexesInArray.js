function slove(arr) {
    let n =Number(arr[0]);
    let token=new Array(n).fill(0);

    for(let i=1;i<arr.length;i++){
        let line=arr[i].split(' - ').map(Number);
        token[(line[0])]=(line[1]);
    }
    console.log(token.join('\r\n'));

}

slove(['3','0 - 5', '1 - 6', '2 - 7']);