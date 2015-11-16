// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class avq
    implements android.view.View.OnLongClickListener
{

    final avk a;

    avq(avk avk1)
    {
        a = avk1;
        super();
    }

    public boolean onLongClick(View view)
    {
        a.b.a();
        return true;
    }
}
