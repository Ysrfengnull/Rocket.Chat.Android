package chat.rocket.android.chatroom.viewmodel

import chat.rocket.android.widget.autocompletion.model.SuggestionModel
import chat.rocket.common.model.UserStatus

class PeopleViewModel(val imageUri: String?,
                      text: String,
                      val username: String,
                      val name: String,
                      val status: UserStatus?,
                      pinned: Boolean = false,
                      searchList: List<String>) : SuggestionModel(text, searchList, pinned) {

    override fun toString(): String {
        return "PeopleViewModel(imageUri='$imageUri', username='$username', name='$name', status=$status, pinned=$pinned)"
    }
}