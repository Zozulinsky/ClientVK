package zo.den.clientvk.presentation.ui.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_friend.view.*
import zo.den.clientvk.R
import zo.den.clientvk.presentation.model.FriendModel

class FriendAdapter : RecyclerView.Adapter<FriendAdapter.FriendViewHolder>() {

    var list: List<FriendModel> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): FriendViewHolder {
        return FriendViewHolder(LayoutInflater.from(p0.context).inflate(R.layout.item_friend, p0, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(p0: FriendViewHolder, p1: Int) {
        p0.bind(list[p1])
    }


    inner class FriendViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(friendModel: FriendModel) {
            Picasso.get().load(friendModel.photo).fit().into(itemView.photo)
            itemView.name.text = friendModel.name
        }

    }

}