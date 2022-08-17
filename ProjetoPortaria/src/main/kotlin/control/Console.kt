package control

class Console private constructor(){
    companion object
    {
        fun getInt(text: String): Int {
            var ret: Int? = null
            do {
                println(text)
                val info = readLine()

                if (info != null && info != "") {
                    ret = info.trim().toIntOrNull()

                    if (ret == null || ret <= 0) {
                        println("valor invalido")
                    }
                } else {
                    println("valor invalido")
                }

            } while (ret == null || ret <= 0)

            return ret
        }
        fun readString(text: String): String {

            var ret: String?

            do {
                println(text)
                val string = readLine()
                ret = string

            } while (ret == null || ret == "")

            return ret.lowercase().trim()

        }
    }
}