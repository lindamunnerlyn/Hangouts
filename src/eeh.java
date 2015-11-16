// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class eeh
    implements android.view.View.OnClickListener
{

    final ad a;
    final String b;
    final eeg c;

    eeh(eeg eeg, ad ad1, String s)
    {
        c = eeg;
        a = ad1;
        b = s;
        super();
    }

    public void onClick(View view)
    {
        a.startActivity(g.s(b));
    }
}
