package academy.bangkit.arsenal


import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Player(
    val name: String,
    val shortName: String,
    val position: String,
    val number: Int,
    val nationality: String,
    val bio: String,
    val photo: String
): Parcelable
