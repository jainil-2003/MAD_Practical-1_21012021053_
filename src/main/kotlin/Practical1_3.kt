//3.	Scan student’s information and display all the data.

fun main() {
    print("Enter Enroll: ")
    var enroll = readLine()
    print("Enter name: ")
    var name= readLine().toString()
    print("Enter branch: ")
    var branch = readLine().toString()
    print("Enter Class: ")
    var Class = readLine()
    print("Enter Batch: ")
    var batch = readLine()
    print("College Name: ")
    var c_name = readLine()
    print("University Name: ")
    var u_name = readLine()
    print("Age: ")
    var age = readLine()

    println("**************\n\nStudent Data:")
    println("Enrollment No.: $enroll")
    println("Name: $name")
    println("Branch: $branch")
    println("Class: $Class")
    println("Batch: $batch")
    println("College Name: $c_name")
    println("University: $u_name")
    println("Age: $age")

}