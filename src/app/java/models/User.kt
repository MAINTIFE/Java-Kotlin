package app.java.models

//data class User(var firstName: String?, var lastName: String?)

data class User(var firstName: String?, var lastName: String? = null)

// usage
val jane = User("Jane") // same as User("Jane", null)
val joe = User(firstName =  "Joe", lastName =  "Doe")



// extension function
fun User.getFormattedName(): String {
    return if (lastName != null) {
        if (firstName != null) {
            "$firstName $lastName"
        } else {
            lastName ?: "Unknown"
        }
    } else {
        firstName ?: "Unknown"
    }
}

// extension property
val User.userFormattedName: String
    get() {
        return if (lastName != null) {
            if (firstName != null) {
                "$firstName $lastName"
            } else {
                lastName ?: "Unknown"
            }
        } else {
            firstName ?: "Unknown"
        }
    }

// usage:
val user = User("Alice", "Smith")
val name = user.getFormattedName()
val formattedName = user.userFormattedName