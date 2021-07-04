package Module

import java.sql.Connection
import java.sql.DriverManager

object DatabaseAccess extends App{



    def userResult():List[Array[String]] = {

        val url = "jdbc:mysql://localhost:3306/group38"
        // val driver = "com.mysql.jdbc.Driver"
        val username = "root"
        val password = ""
        var connection:Connection =null
        var htmlValues:List[Array[String]] = List.empty



        try{
           // Class.forName(driver)
            connection = DriverManager.getConnection(url, username, password)
            val statement = connection.createStatement
            val searchResult = statement.executeQuery("SELECT * FROM users")
            while(searchResult.next){
                val idNumber = searchResult.getString("id")
                val firstName = searchResult.getString("firstName")
                val lastName = searchResult.getString("lastName")
                val regNumber = searchResult.getString("registrationNumber")
                var subValues: Array[String] = Array(idNumber ,firstName , lastName , regNumber)
               //println(subValues)
                htmlValues :+= subValues
               //println(idNumber + " " + firstName + " " + lastName + " " + regNumber)

            }
        }
        catch{
            case e: Exception => e.printStackTrace()
        }

        connection.close()
        //println(htmlValues)
        htmlValues
    }
    userResult()

}
