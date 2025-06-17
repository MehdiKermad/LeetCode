/* The isBadVersion API is defined in the parent class VersionControl.
      fun isBadVersion(version: Int) : Boolean {} */

class Solution: VersionControl() {
    override fun firstBadVersion(n: Int) : Int {
        // If there is only one version, it's automatically the wrong one
        if (n == 1) return n

        // n represents the last version
        var minVersion = 1
        var maxVersion = n
        
        while (maxVersion - minVersion > 1) {
            val middle = ((minVersion.toLong()+maxVersion.toLong())/2).toInt()
            if (isBadVersion(middle)) {
                maxVersion = middle
            } else {
                minVersion = middle
            }
        }
        
        return minVersion.takeIf { isBadVersion(it) } ?: maxVersion
	}
}