// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class blq
    implements android.view.View.OnClickListener
{

    final blp a;

    blq(blp blp1)
    {
        a = blp1;
        super();
    }

    public void onClick(View view)
    {
        blo.a(a.getResources()).a(a.getFragmentManager());
    }
}
