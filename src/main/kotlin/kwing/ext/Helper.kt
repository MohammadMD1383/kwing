package kwing.ext

import java.awt.*
import javax.swing.JFrame

/* -------------------- */

inline val <T> T.unit: Unit get() = Unit
inline val Int.color: Color get() = Color(this)

/* -------------------- */

inline infix fun Int.by(height: Int) = Dimension(this, height)
inline infix fun Int.at(y: Int) = Point(this, y)

/* -------------------- */

inline operator fun <T : Component> T.get(index: Int) = this to index
inline operator fun <T : Component> T.get(constraints: Any) = this to constraints
inline operator fun <T : Component> T.get(constraints: Any, index: Int) = Tuple(this, constraints, index)

/* -------------------- */

inline operator fun <T : Component> T.invoke(dsl: T.() -> Unit) = this.apply(dsl)

@JvmName("invokeTInt")
inline operator fun <T : Component> Pair<T, Int>.invoke(dsl: T.() -> Unit) = this.also { first.apply(dsl) }

@JvmName("invokeTAny")
inline operator fun <T : Component> Pair<T, Any>.invoke(dsl: T.() -> Unit) = this.also { first.apply(dsl) }

inline operator fun <T : Component> Tuple<T, Any, Int>.invoke(dsl: T.() -> Unit) = this.also { first.apply(dsl) }

/* -------------------- */

context(Container) inline operator fun <reified T : Component> T.unaryPlus() = this@Container.add(this@T) as T

context(Container) inline operator fun <T : PopupMenu> T.unaryPlus(): T {
	this@Container.add(this@T)
	return this@T
}

context(Container) @JvmName("unaryPlusTInt")
inline operator fun <T : Component> Pair<T, Int>.unaryPlus(): Pair<T, Int> {
	this@Container.add(this@Pair.first, this@Pair.second)
	return this@Pair
}

context(Container) @JvmName("unaryPlusTAny")
inline operator fun <T : Component> Pair<T, Any>.unaryPlus(): Pair<T, Any> {
	this@Container.add(this@Pair.first, this@Pair.second)
	return this@Pair
}

context(Container) inline operator fun <T : Component> Tuple<T, Any, Int>.unaryPlus(): Tuple<T, Any, Int> {
	this@Container.add(this@Tuple.first, this@Tuple.second, this@Tuple.third)
	return this@Tuple
}

/* -------------------- */

inline val JFrame.visible: Unit
	get() {
		this.isVisible = true
	}

inline var JFrame.locationRelativeTo: Component?
	get() = null
	set(value) = setLocationRelativeTo(value)
