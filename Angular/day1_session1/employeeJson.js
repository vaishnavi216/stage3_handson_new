var s = '{"first_name" : "Sammy", "last_name" : "Shark", "salary" : 5000,"permanent_staff" : "true"}';

var obj = JSON.parse(s);

console.log("firstname: "+obj.first_name);
console.log("lastname: "+obj.last_name);
console.log("salary: "+obj.salary);
console.log("Permanent staff: "+obj.permanent_staff);