// Generated by view binder compiler. Do not edit!
package space.mairi.materialdesign.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import space.mairi.materialdesign.R;
import space.mairi.materialdesign.utils.MyImageView;

public final class FragmentPictureBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Chip chipDBYesterday;

  @NonNull
  public final ChipGroup chipGroup;

  @NonNull
  public final Chip chipToday;

  @NonNull
  public final Chip chipYesterday;

  @NonNull
  public final FloatingActionButton fab;

  @NonNull
  public final MyImageView imageView;

  @NonNull
  public final TextInputEditText input;

  @NonNull
  public final TextInputLayout inputlayout;

  private FragmentPictureBinding(@NonNull ConstraintLayout rootView, @NonNull Chip chipDBYesterday,
      @NonNull ChipGroup chipGroup, @NonNull Chip chipToday, @NonNull Chip chipYesterday,
      @NonNull FloatingActionButton fab, @NonNull MyImageView imageView,
      @NonNull TextInputEditText input, @NonNull TextInputLayout inputlayout) {
    this.rootView = rootView;
    this.chipDBYesterday = chipDBYesterday;
    this.chipGroup = chipGroup;
    this.chipToday = chipToday;
    this.chipYesterday = chipYesterday;
    this.fab = fab;
    this.imageView = imageView;
    this.input = input;
    this.inputlayout = inputlayout;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentPictureBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentPictureBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_picture, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentPictureBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.chipDBYesterday;
      Chip chipDBYesterday = ViewBindings.findChildViewById(rootView, id);
      if (chipDBYesterday == null) {
        break missingId;
      }

      id = R.id.chipGroup;
      ChipGroup chipGroup = ViewBindings.findChildViewById(rootView, id);
      if (chipGroup == null) {
        break missingId;
      }

      id = R.id.chipToday;
      Chip chipToday = ViewBindings.findChildViewById(rootView, id);
      if (chipToday == null) {
        break missingId;
      }

      id = R.id.chipYesterday;
      Chip chipYesterday = ViewBindings.findChildViewById(rootView, id);
      if (chipYesterday == null) {
        break missingId;
      }

      id = R.id.fab;
      FloatingActionButton fab = ViewBindings.findChildViewById(rootView, id);
      if (fab == null) {
        break missingId;
      }

      id = R.id.imageView;
      MyImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.input;
      TextInputEditText input = ViewBindings.findChildViewById(rootView, id);
      if (input == null) {
        break missingId;
      }

      id = R.id.inputlayout;
      TextInputLayout inputlayout = ViewBindings.findChildViewById(rootView, id);
      if (inputlayout == null) {
        break missingId;
      }

      return new FragmentPictureBinding((ConstraintLayout) rootView, chipDBYesterday, chipGroup,
          chipToday, chipYesterday, fab, imageView, input, inputlayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
