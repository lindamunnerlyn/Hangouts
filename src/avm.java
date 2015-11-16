// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;

final class avm
    implements TextWatcher
{

    final Context a;
    final avk b;

    avm(avk avk1, Context context)
    {
        b = avk1;
        a = context;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
        eha.a(a).a(editable, b.a);
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        avs avs1 = b.f;
        g.x().removeCallbacks(avs1);
        b.f.a(charsequence, j, k);
        g.a(b.f);
    }
}
