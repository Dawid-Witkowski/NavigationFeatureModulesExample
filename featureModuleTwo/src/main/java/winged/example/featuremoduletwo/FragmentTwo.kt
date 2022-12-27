package winged.example.featuremoduletwo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import winged.example.featuremoduletwo.databinding.FragmentTwoBinding
import winged.example.featuremoduletwo.navigation.NavigationFeatureTwo
import javax.inject.Inject

@AndroidEntryPoint
class FragmentTwo : Fragment() {
    private var _binding: FragmentTwoBinding? = null
    private val binding get() = _binding!!

    @Inject
    lateinit var featureTwoActions: NavigationFeatureTwo

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTwoBinding.inflate(inflater,container,false)
        binding.button.setOnClickListener {
            featureTwoActions.navigateToFeatureOne()
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null // prevents memory leaks
    }
}