package kwing.ext

import java.awt.Component
import java.awt.Container
import java.awt.Dimension
import java.awt.Point

inline val <T> T.unit: Unit get() = Unit

inline infix fun Int.by(height: Int) = Dimension(this, height)
inline infix fun Int.at(y: Int) = Point(this, y)

inline operator fun <reified T : Component> T.invoke(dsl: T.() -> Unit) = dsl()

context(Container) inline operator fun <reified T : Component> T.unaryPlus(): T = this@Container.add(this@T) as T
