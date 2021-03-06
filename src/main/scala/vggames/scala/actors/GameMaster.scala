package vggames.scala.actors

import akka.actor.{Actor, ActorSystem, Props}
import akka.routing.RoundRobinRouter

class GameMaster extends Actor {
  private val scalaProcessorRouter = GameMaster.system.actorOf(
    Props[ScalaProcessorActor].withRouter(RoundRobinRouter(nrOfInstances=5)), "local-proc-router")
  
  def receive = {
    case r: Run[_] => scalaProcessorRouter.!(r)(sender)
  }
}

object GameMaster {
  val system = ActorSystem("VGGameSystem")
  val master = system.actorOf(Props[GameMaster], "GameMasterActor")
}
