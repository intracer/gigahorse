/**
 * This code is generated using [[http://www.scala-sbt.org/contraband/ sbt-contraband]].
 */

// DO NOT EDIT MANUALLY
package gigahorse
final class ConfigMemorySize private (
  val bytes: Long) extends Serializable {
  
  
  
  override def equals(o: Any): Boolean = o match {
    case x: ConfigMemorySize => (this.bytes == x.bytes)
    case _ => false
  }
  override def hashCode: Int = {
    37 * (17 + bytes.##)
  }
  override def toString: String = {
    "ConfigMemorySize(" + bytes + ")"
  }
  protected[this] def copy(bytes: Long = bytes): ConfigMemorySize = {
    new ConfigMemorySize(bytes)
  }
  def withBytes(bytes: Long): ConfigMemorySize = {
    copy(bytes = bytes)
  }
}
object ConfigMemorySize {
  
  def apply(bytes: Long): ConfigMemorySize = new ConfigMemorySize(bytes)
}
