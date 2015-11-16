// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.TextView;

final class csg
    implements TextWatcher
{

    final cse a;

    csg(cse cse1)
    {
        a = cse1;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
        cse.e(a).setVisibility(8);
        cse.f(a).setVisibility(0);
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
