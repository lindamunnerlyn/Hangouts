// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;

final class blv
    implements TextWatcher
{

    final AlertDialog a;
    final bls b;

    blv(bls bls, AlertDialog alertdialog)
    {
        b = bls;
        a = alertdialog;
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
        a.getButton(-1).setEnabled(true);
    }
}
