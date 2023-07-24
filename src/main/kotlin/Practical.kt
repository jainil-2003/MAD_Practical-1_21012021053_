/*open class person(var mobilenum:Long, var address:String){
    constructor(mno:Long,add:String).this(mno,address){
        address = add;
        mobilenum = mno
    }
}*/
class student(var enno :Int , var name : String){
    constructor():this(53,"jainil"){
        var enno = this.enno
        var name = this.name
    }
    fun shoinfo(){
        println("student name is:${name}")
        println("enrollment no is:${enno}")
    }
}
fun main(){
        var s1 = student(53,"jainil")
        s1.shoinfo()
}