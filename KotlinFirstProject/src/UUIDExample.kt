import java.util.*
import java.util.UUID.randomUUID


fun main() {
    // Generate a random UUID
    val myUuid = UUID.randomUUID()
    val myUuidAsString = myUuid.toString()

    // Print the UUID
    println("Generated UUID: $myUuid")

    //actual fun randomIOSUUID(): String = NSUUID().UUIDString()
    //actual fun randomAndroidUUID() = UUID.randomUUID().toString()
}
