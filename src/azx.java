// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Toast;

final class azx
    implements Runnable
{

    final azw a;

    azx(azw azw1)
    {
        a = azw1;
        super();
    }

    public void run()
    {
        Toast.makeText(azv.a(a.b), l.tw, 1).show();
    }
}
