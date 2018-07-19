function slove(arr) {
    let student = {};
    for (let obj of arr) {
        let tokens = obj.split(' -> ');

        let name = tokens[0];
        let value = tokens[1];
        if (name === 'age' || name === 'grade') {
            value = Number(tokens[1]);
        }
        student[name] = value;
    }
    console.log(JSON.stringify(student));
}

slove(['name -> Angel', 'surname -> Georgiev', 'age -> 20', 'grade -> 6.00', 'date -> 23/05/1995', 'town -> Sofia']);