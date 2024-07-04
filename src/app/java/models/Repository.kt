package app.java.models

import java.util.*

object Repository {
    private val _users = mutableListOf<User>()
    val users: List<User>
        get() = _users


    val formattedUserNames: List<String>
        get() {
            return _users.map { user -> user.userFormattedName}
        }


    // keeping the constructor private to enforce the usage of getInstance
    init {
        val user1 = User("Jane", "")
        val user2 = User("John", null)
        val user3 = User("Anne", "Doe")

        _users.apply {
            // this == _users
            add(user1)
            add(user2)
            add(user3)
        }
    }

//    companion object {
//        private var INSTANCE: Repository? = null
//        val instance: Repository?
//            get() {
//                if (INSTANCE == null) {
//                    synchronized(Repository::class.java) {
//                        if (INSTANCE == null) {
//                            INSTANCE = Repository()
//                        }
//                    }
//                }
//                return INSTANCE
//            }
//    }
}

