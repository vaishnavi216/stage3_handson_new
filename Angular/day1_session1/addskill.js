function addskill()
{
var s = '{"first_name" : "Jhon", "last_name" : "Stoke", "salary" : 5000,"permanent_staff" : "true", "dept_id" : 3,"dept_name" : "Payroll", "skill" : [{"id": 1, "value" : "html"},{"id": 2, "value" : "css"},{"id": 3, "value" : "javascript"}]}';

var obj = JSON.parse(s);

console.log("firstname: "+obj.first_name);
console.log("lastname: "+obj.last_name);
console.log("salary: "+obj.salary);
console.log("Permanent staff: "+obj.permanent_staff);
console.log("departmentId: "+obj.dept_id);
console.log("departmentName: "+obj.dept_name);
for(var i=0;i<=2;i++)
{
console.log("skill "+(i+1)+" : "+obj.skill[i].id+", "+obj.skill[i].value);
}
}
addskill();