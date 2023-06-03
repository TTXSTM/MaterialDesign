package space.mairi.materialdesign.view

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import coil.load
import com.squareup.picasso.Picasso
import space.mairi.materialdesign.R
import space.mairi.materialdesign.databinding.FragmentPictureBinding
import space.mairi.materialdesign.utils.showSnackBar
import space.mairi.materialdesign.viewmodel.AppState
import space.mairi.materialdesign.viewmodel.PictureOfTheDayViewModel


class PictureOfTheDayFragment : Fragment() {

    private var _binding: FragmentPictureBinding? = null
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = PictureOfTheDayFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentPictureBinding.inflate(inflater, container, false)
        return binding.root

    }

    val viewModel : PictureOfTheDayViewModel by lazy {
        ViewModelProvider(this).get(PictureOfTheDayViewModel::class.java)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getLiveData().observe(viewLifecycleOwner){it ->
            when(it){
                is AppState.Error -> {

                }

                AppState.Loading -> {

                }

                is AppState.Success -> {

                    Picasso
                        .get()
                        .load(it.pictureOfTheDayResponseData.url)
                        .into(binding.imageView)


                }
            }
        }
        viewModel.sendRequest()

        binding.chipToday.setOnClickListener {
            // Действия при нажатии на Chip с id chipToday
            Toast.makeText(requireContext(), "chipToday", Toast.LENGTH_SHORT).show()
        }
        binding.chipYesterday.setOnClickListener {
            // Действия при нажатии на Chip с id chipToday
            Toast.makeText(requireContext(), "chipYesterday", Toast.LENGTH_SHORT).show()

        }
        binding.chipYesterday.isEnabled = false
        binding.chipDBYesterday.setOnClickListener {
            // Действия при нажатии на Chip с id chipToday
            Toast.makeText(requireContext(), "chipDBYesterday", Toast.LENGTH_SHORT).show()

        }

        binding.inputlayout.setEndIconOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse(
                    "https://en.wikipedia.org/wiki/${binding.input.text.toString()}")
            })
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}