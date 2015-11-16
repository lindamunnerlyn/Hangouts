// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class blz
    implements android.view.View.OnClickListener
{

    final bly a;

    blz(bly bly1)
    {
        a = bly1;
        super();
    }

    public void onClick(View view)
    {
        blx.a(a.getResources()).a(a.getFragmentManager());
    }
}
