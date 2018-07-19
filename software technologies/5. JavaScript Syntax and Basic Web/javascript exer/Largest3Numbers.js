function sorted(input) {
   let arr=input.map(Number).sort((a,b)=> b-a);

    let count=Math.min(3,arr.length);
    for (let i = 0; i < count; i++) {
        console.log(arr[i])

    }
}
sorted(['10', '30']);