// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.ListView;

final class hka
    implements Runnable
{

    final hjy a;

    hka(hjy hjy1)
    {
        a = hjy1;
        super();
    }

    public void run()
    {
        hjy.b(a).focusableViewAvailable(hjy.b(a));
    }
}
