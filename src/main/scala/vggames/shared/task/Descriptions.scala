package vggames.shared.task

import java.util.concurrent.ConcurrentHashMap
import java.util.Scanner
import scala.collection.JavaConverters
import scala.collection.JavaConversions
import eu.henkelmann.actuarius.Transformer

class Descriptions(game : String) {

  private val descriptions = JavaConversions.mapAsScalaConcurrentMap(new ConcurrentHashMap[String, String])

  def forGroup(groupName : String) : String = {
    descriptions.get(groupName).getOrElse {
      val desc = Option(classOf[Descriptions].getResourceAsStream("/desc/" + game + "/" + groupName + ".markdown")).
        map(new Scanner(_).useDelimiter("$$").next).map(new Markdown()(_)).getOrElse("No description for group " + groupName)
      descriptions.put(groupName, desc)
      desc
    }
  }
}

class Markdown extends Transformer
