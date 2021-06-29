function deptfun()
{
var s = '{"first_name" : "Jhon", "last_name" : "Stoke", "salary" : 5000,"permanent_staff" : "true", "dept_id" : 3,"dept_name" : "Payroll"}';

var obj = JSON.parse(s);

console.log("firstname: "+obj.first_name);
console.log("lastname: "+obj.last_name);
console.log("salary: "+obj.salary);
console.log("Permanent staff: "+obj.permanent_staff);
console.log("departmentId: "+obj.dept_id);
console.log("departmentName: "+obj.dept_name);
}
deptfun();