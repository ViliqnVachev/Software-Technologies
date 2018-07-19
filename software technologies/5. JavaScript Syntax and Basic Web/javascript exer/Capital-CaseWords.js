function capital(arr) {
    let text =arr.join(", ");
    let words=text.split(/\W+/);
    let nonEmptyWords=words.filter(w=>w.length>0);
    let upWords=nonEmptyWords.filter(isUpper);
    console.log(upWords.join(", "));
    function isUpper(str) {
        return str===str.toUpperCase();
    }
}
capital("We start by HTML, CSS, JavaScript, JSON and REST. Later we touch some PHP, MySQL and SQL. Later we play with C#, EF, SQL Server and ASP.NET MVC. Finally, we touch some Java, Hibernate and Spring.MVC.");