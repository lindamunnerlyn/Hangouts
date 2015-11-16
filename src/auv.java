// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;

final class auv
    implements TextWatcher
{

    final Context a;
    final aut b;

    auv(aut aut1, Context context)
    {
        b = aut1;
        a = context;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
        edy.a(a).a(editable, aut.b(b));
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        avb avb1 = aut.c(b);
        g.y().removeCallbacks(avb1);
        aut.c(b).a(charsequence, j, k);
        g.a(aut.c(b));
    }
}
