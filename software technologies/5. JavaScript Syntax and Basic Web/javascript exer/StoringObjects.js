function slove(arr) {

    let students = [];
    for (let i = 0; i < arr.length; i++) {
        let tokens = arr[i].split(' -> ');
        let name = tokens[0];
        let age = Number(tokens[1]);
        let grade = Number(tokens[2]);
        let result = {};
        result.name = name;
        result.age = age;
        result.grade = grade;
        students.push(result);
    }
    for (let st of students) {
        console.log(`Name: ${st.name}`);
        console.log(`Age: ${st.age}`);
        console.log(`Grade: ${st.grade.toFixed(2)}`);
    }
}

slove(['Pesho -> 13 -> 6.00', 'Ivan -> 12 -> 5.57', 'Toni -> 13 -> 4.90']);