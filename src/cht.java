// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

final class cht
    implements TextWatcher
{

    final chr a;

    cht(chr chr1)
    {
        a = chr1;
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
        if (bdt.a(chr.a(a), charsequence))
        {
            chr.b(a).setText("");
            chr.c(a).a("");
            return;
        } else
        {
            chr.c(a).a(charsequence.toString());
            return;
        }
    }
}
