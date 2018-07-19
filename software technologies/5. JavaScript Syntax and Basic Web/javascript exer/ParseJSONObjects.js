function slove(arr) {
    let line=arr.map(JSON.parse);
    for (let st of line) {
        console.log(`Name: ${st.name}`);
        console.log(`Age: ${st.age}`);
        console.log(`Date: ${st.date}`);
    }

}

slove(['{"name":"Gosho","age":10,"date":"19/06/2005"}', '{"name":"Tosho","age":11,"date":"04/04/2005"}']);