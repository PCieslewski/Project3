import akka.actor.ActorRef

//This file contains all of the message definitions.
sealed trait Msg
//case class FindSuccessor(key: Long, origSender: ActorRef) extends Msg
case class FindPredecessor(id: Long, originalSender: ActorRef) extends Msg
case class Predecessor(id: Long, originalSender: ActorRef) extends Msg
case class InRange(id: Long) extends Msg
case class NewNode() extends Msg
case class LatchOntoParent(parentNode: ActorRef) extends Msg
case class ConfirmJoinOn(oldNextNode: ActorRef, oldEndPosition: Long) extends Msg

case class FindParent(childId: Long, originalSender: ActorRef) extends Msg
case class ParentResponse(parentPrev: ActorRef, parentOldRange: Range) extends Msg
case class JoinOn(childId: Long, childRange: Range) extends Msg
case class JoinSystem(node: ActorRef) extends Msg
case class SetBusy(flag: Boolean) extends Msg

case class DisplayRange() extends Msg

case class FindFingerSuccessor(id: Long, originalSender: ActorRef, fingerNumber: Int) extends Msg
case class SuccessorResponse(fingerSuccessor: ActorRef, fingerNumber: Int) extends Msg
case class UpdateFingerTable() extends Msg