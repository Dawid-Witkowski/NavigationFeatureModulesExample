package winged.example.featuremoduleone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.hilt.android.AndroidEntryPoint
import winged.example.featuremoduleone.databinding.FragmentOneBinding
import winged.example.featuremoduleone.navigation.NavigationFeatureOne
import javax.inject.Inject

@AndroidEntryPoint
class FragmentOne : Fragment() {
    private var _binding: FragmentOneBinding? = null
    private val binding get() = _binding!!

    @Inject
    lateinit var featureOneActions: NavigationFeatureOne

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOneBinding.inflate(inflater, container, false)
        binding.button.setOnClickListener {
            featureOneActions.navigateToFeatureTwo()
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null // prevents memory leaks
    }
}