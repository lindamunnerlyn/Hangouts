// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

final class ciz
    implements TextWatcher
{

    final cix a;

    ciz(cix cix1)
    {
        a = cix1;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (bej.a(cix.a(a), charsequence))
        {
            cix.b(a).setText("");
            cix.c(a).a("");
            return;
        } else
        {
            cix.c(a).a(charsequence.toString());
            return;
        }
    }
}
