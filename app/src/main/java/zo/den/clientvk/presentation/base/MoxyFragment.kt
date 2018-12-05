package zo.den.clientvk.presentation.base

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arellomobile.mvp.MvpAppCompatFragment
import dagger.android.support.AndroidSupportInjection

abstract class MoxyFragment : MvpAppCompatFragment(), BaseView{
    protected abstract val layout: Int

    override fun onAttach(context: Context){
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    final override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(layout, container, false)
    }

    final override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        onViewPrepare(savedInstanceState)
    }

    protected open fun onViewDetach() {

    }

    override fun onDestroyView() {
        onViewDetach()
        super.onDestroyView()
    }

    protected open fun onViewPrepare(savedInstanceState: Bundle?) {

    }
}