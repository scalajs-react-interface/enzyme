package sri

import sri.core.ReactClass

import scala.scalajs.js
import scala.scalajs.js.|

package object enzyme {

  type EnzymeSelector = String | js.Object | js.Dynamic

  implicit def ShallowWrapperToReactWrapper[C <: ReactClass](in: ShallowWrapper[C]):ReactWrapper[C] = in.asInstanceOf[ReactWrapper[C]]

}
