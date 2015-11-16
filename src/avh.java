// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class avh
    implements android.view.View.OnClickListener
{

    final avb a;
    private final int b;

    avh(avb avb1, int i)
    {
        a = avb1;
        super();
        b = i;
    }

    public void onClick(View view)
    {
        a.b(b);
    }
}
