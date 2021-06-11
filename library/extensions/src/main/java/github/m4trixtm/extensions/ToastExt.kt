package github.m4trixtm.extensions

import android.content.Context
import android.widget.Toast
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment

fun Context.toast(text: String) =
    Toast.makeText(this, text, Toast.LENGTH_SHORT).show()

fun Context.toast(@StringRes text: Int) =
    Toast.makeText(this, text, Toast.LENGTH_SHORT).show()

fun Context.longToast(text: String) =
    Toast.makeText(this, text, Toast.LENGTH_LONG).show()

fun Context.longToast(@StringRes text: Int) =
    Toast.makeText(this, text, Toast.LENGTH_SHORT).show()

fun Fragment.toast(text: String) =
    Toast.makeText(requireContext(), text, Toast.LENGTH_SHORT).show()

fun Fragment.toast(@StringRes text: Int) =
    Toast.makeText(requireContext(), text, Toast.LENGTH_SHORT).show()

fun Fragment.longToast(text: String) =
    Toast.makeText(requireContext(), text, Toast.LENGTH_LONG).show()

fun Fragment.longToast(@StringRes text: Int) =
    Toast.makeText(requireContext(), text, Toast.LENGTH_SHORT).show()