/*import java.security.spec.MGF1ParameterSpec.SHA1

class UUID(
        val string: String
) {

    @OptIn(ExperimentalStdlibApi::class)
    fun generateUUID5(namespaceUuid: String, inputObject: Any): UUID {
        val objectString = inputObject.toString()
        val sha1Bytes = SHA1().digest((namespaceUuid + objectString).toByteArray(Charsets.UTF_8))
        val uuidBytes = sha1Bytes.copyOfRange(0, 16)

        uuidBytes[6] = (uuidBytes[6].toInt() and 0x0f or 0x50).toByte()
        uuidBytes[8] = (uuidBytes[8].toInt() and 0x3f or 0x80).toByte()

        val hexUuidString = uuidBytes.toHexString()

        val formattedAsUUID = hexUuidString.replaceFirst(Regex("^(.{8})(.{4})(.{4})(.{4})(.{12})$"), "$1-$2-$3-$4-$5")

        return UUID(formattedAsUUID)
    }

}
*/