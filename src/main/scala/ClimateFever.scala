import org.json4s.DefaultFormats
import org.json4s.jackson.JsonMethods

object ClimateFever extends Schema with App {

    // Read file climate-fever.json
    val pathFile = scala.io.Source.fromFile("src/Resources/climate-fever.json")
    val json = JsonMethods.parse(pathFile.reader())
    println(json.values)

    // Convert parsed json to "Claims" case class
    implicit val formats = DefaultFormats
    val claims = json.extract[Claims]
    println(claims.animal_claims(1).claim)

}
