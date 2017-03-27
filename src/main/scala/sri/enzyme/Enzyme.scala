package sri.enzyme

import sri.core.{ReactClass, ReactElement}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|


@js.native
trait ShallowWrapper[C <: ReactClass] extends js.Object {

  def find(selector: EnzymeSelector): ShallowWrapper[C] = js.native

  def findWhere(predicate: ShallowWrapper[C] => Boolean): ShallowWrapper[C] = js.native

  def filter(selector: EnzymeSelector): ShallowWrapper[C] = js.native

  def filterWhere(predicate: ShallowWrapper[C] => Boolean): ShallowWrapper[C] = js.native

  def contains(nodeOrNodes: ReactElement | js.Array[ReactElement]): Boolean = js.native

  def containsMatchingElement(node: ReactElement): Boolean = js.native

  def containsAllMatchingElements(nodes: js.Array[ReactElement]): Boolean = js.native

  def containsAnyMatchingElements(nodes: js.Array[ReactElement]): Boolean = js.native

  def equals(node: ReactElement): Boolean = js.native

  def matchesElement(node: ReactElement): Boolean = js.native

  def is(selector: EnzymeSelector): Boolean = js.native

  def isEmptyRender(): Boolean = js.native

  def not(selector: EnzymeSelector): ShallowWrapper[C] = js.native

  def text(): String = js.native

  def html(): String = js.native

  def render(): CheerioWrapper = js.native

  def unmount(): ShallowWrapper[C] = js.native

  def simulate(event: String, args: js.Any*): ShallowWrapper[C] = js.native

  def props(): C#PropsType = js.native

  def state(): C#StateType = js.native

  def state(name: String): Any = js.native

  def context(name: String = ???): Any = js.native

  def children(selector: EnzymeSelector = ???): ShallowWrapper[C] = js.native

  def childAt(childAt: Int): ShallowWrapper[C] = js.native

  def parents(selector: EnzymeSelector): ShallowWrapper[C] = js.native

  def parent(): ShallowWrapper[C] = js.native

  def closest(selector: EnzymeSelector): ShallowWrapper[C] = js.native

  def shallow(options: js.Object): ShallowWrapper[C] = js.native

  def prop(propName: String): Any = js.native

  def key(): String = js.native

  def `type`(): String | js.Function = js.native

  def name(): String = js.native

  def hasClass(className: String): Boolean = js.native

  def forEach(fn: (ShallowWrapper[C], Int) => _): ShallowWrapper[C] = js.native

  def map[T](fn: (ShallowWrapper[C], Int) => T): js.Array[T] = js.native

  def reduce[T](fn: (T, ShallowWrapper[C], Int) => _, initialValue: T = ???): js.Array[T] = js.native

  def reduceRight[T](fn: (T, ShallowWrapper[C], Int) => _, initialValue: T = ???): js.Array[T] = js.native

  def slice(begin: Int, end: Int): ShallowWrapper[C] = js.native

  def some(selector: EnzymeSelector): Boolean = js.native

  def someWhere(predicate: ShallowWrapper[C] => Boolean): Boolean = js.native

  def every(selector: EnzymeSelector): Boolean = js.native

  def everyWhere(predicate: ShallowWrapper[C] => Boolean): Boolean = js.native

  def get(index: Int): ReactElement = js.native

  def at(index: Int): ShallowWrapper[C] = js.native

  def first(): ShallowWrapper[C] = js.native

  def last(): ShallowWrapper[C] = js.native

  def isEmpty(): Boolean = js.native

  def debug(): String = js.native

  def tap(interceptor: js.Function): ShallowWrapper[C] = js.native

  def dive(options: js.Object = ???): ShallowWrapper[C] = js.native

  def getNode(): ReactElement = js.native

  def getNodes(): js.Array[ReactElement] = js.native

  def length: Int = js.native

  def instance(): C = js.native


}

@js.native
trait ReactWrapper[C <:ReactClass] extends ShallowWrapper[C] {

  def getDOMNode[T <: js.Object](): T = js.native

  def ref(refName: String): ReactWrapper[C] = js.native

  def detach(): Unit = js.native

  def mount(): ReactWrapper[C] = js.native
}

@js.native
trait CheerioWrapper extends js.Object

@js.native
trait Enzyme extends js.Object {

  def shallow(element: ReactElement, options: js.Object = ???): ShallowWrapper[element.type#Instance] = js.native

  def mount(element: ReactElement, options: js.Object = ???): ReactWrapper[element.type#Instance] = js.native

}


@js.native
@JSImport("enzyme",JSImport.Namespace)
object Enzyme extends Enzyme