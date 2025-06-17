/* The isBadVersion API is defined in the parent class VersionControl.
      fun isBadVersion(version: Int) : Boolean {} */

class Solution: VersionControl() {
    override fun firstBadVersion(n: Int) : Int {
        // If there is only one version, it's automatically the wrong one
        if (n == 1) return n

        // n represents the last version
        var minVersion = 1L
        var maxVersion = n.toLong()
        
        while (maxVersion - minVersion > 1) {
            val middle: Long = ((minVersion+maxVersion)/2)
            if (isBadVersion(middle.toInt())) {
                maxVersion = middle
            } else {
                minVersion = middle
            }
        }
        
        return minVersion.toInt().takeIf { isBadVersion(it) } ?: maxVersion.toInt()
	}
}