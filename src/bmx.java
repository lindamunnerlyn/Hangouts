// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.apps.hangouts.fragments.dialpad.DigitsEditText;

public final class bmx
    implements TextWatcher
{

    final DigitsEditText a;

    public bmx(DigitsEditText digitsedittext)
    {
        a = digitsedittext;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            g.a(editable);
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
