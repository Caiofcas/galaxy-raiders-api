@file:Suppress("UNUSED_PARAMETER") // <- REMOVE
package galaxyraiders.core.physics

data class Point2D(val x: Double, val y: Double) {
  operator fun plus(p: Point2D): Point2D {
    return Point2D(this.x + p.x, this.y + p.y)
  }

  operator fun plus(v: Vector2D): Point2D {
    return Point2D(this.x + v.dx, this.y + v.dy)
  }

  override fun toString(): String {
    return "Point2D(x=$x, y=$y)"
  }

  fun toVector(): Vector2D {
    return Vector2D(this.x, this.y)
  }

  fun impactVector(p: Point2D): Vector2D {
    return INVALID_VECTOR
  }

  fun impactDirection(p: Point2D): Vector2D {
    return INVALID_VECTOR
  }

  fun contactVector(p: Point2D): Vector2D {
    return INVALID_VECTOR
  }

  fun contactDirection(p: Point2D): Vector2D {
    return INVALID_VECTOR
  }

  fun distance(p: Point2D): Double {
    val dx = Math.pow(Math.abs(p.x - this.x), 2.0)
    val dy = Math.pow(Math.abs(p.y - this.y), 2.0)
    return Math.sqrt(dx + dy)
  }
}
