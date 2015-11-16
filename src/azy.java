// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Toast;

final class azy
    implements Runnable
{

    final azw a;

    azy(azw azw1)
    {
        a = azw1;
        super();
    }

    public void run()
    {
        Toast.makeText(azv.a(a.b), l.tv, 1).show();
    }
}
