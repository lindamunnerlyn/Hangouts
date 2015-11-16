// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Toast;

final class cob extends coj
{

    final cna a;

    cob(cna cna1, String s)
    {
        a = cna1;
        super(s);
    }

    public void a()
    {
        doy.a(true);
        Toast.makeText(a.a, "refreshed", 0).show();
    }
}
