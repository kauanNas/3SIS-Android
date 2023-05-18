// Generated by view binder compiler. Do not edit!
package br.com.fiap.movies.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import br.com.fiap.movies.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityTela3Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnConfirmarTransferencia;

  @NonNull
  public final Button btnRevisarChavePix;

  @NonNull
  public final TextView textChavePix;

  @NonNull
  public final TextView textTransferindo;

  private ActivityTela3Binding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnConfirmarTransferencia, @NonNull Button btnRevisarChavePix,
      @NonNull TextView textChavePix, @NonNull TextView textTransferindo) {
    this.rootView = rootView;
    this.btnConfirmarTransferencia = btnConfirmarTransferencia;
    this.btnRevisarChavePix = btnRevisarChavePix;
    this.textChavePix = textChavePix;
    this.textTransferindo = textTransferindo;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityTela3Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityTela3Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_tela3, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityTela3Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_confirmar_transferencia;
      Button btnConfirmarTransferencia = ViewBindings.findChildViewById(rootView, id);
      if (btnConfirmarTransferencia == null) {
        break missingId;
      }

      id = R.id.btn_revisar_chave_pix;
      Button btnRevisarChavePix = ViewBindings.findChildViewById(rootView, id);
      if (btnRevisarChavePix == null) {
        break missingId;
      }

      id = R.id.text_chave_pix;
      TextView textChavePix = ViewBindings.findChildViewById(rootView, id);
      if (textChavePix == null) {
        break missingId;
      }

      id = R.id.text_transferindo;
      TextView textTransferindo = ViewBindings.findChildViewById(rootView, id);
      if (textTransferindo == null) {
        break missingId;
      }

      return new ActivityTela3Binding((ConstraintLayout) rootView, btnConfirmarTransferencia,
          btnRevisarChavePix, textChavePix, textTransferindo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
