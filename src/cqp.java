// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.TextView;

final class cqp
    implements TextWatcher
{

    final cqn a;

    cqp(cqn cqn1)
    {
        a = cqn1;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
        cqn.e(a).setVisibility(8);
        cqn.f(a).setVisibility(0);
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
