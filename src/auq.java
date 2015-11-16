// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class auq
    implements android.view.View.OnClickListener
{

    final auk a;
    private final int b;

    auq(auk auk1, int i)
    {
        a = auk1;
        super();
        b = i;
    }

    public void onClick(View view)
    {
        a.b(b);
    }
}
