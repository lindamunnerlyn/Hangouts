// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Toast;

final class cmr extends cmu
{

    final cls a;

    cmr(cls cls1, String s)
    {
        a = cls1;
        super(s);
    }

    public void a()
    {
        dme.a(true);
        Toast.makeText(a.a, "refreshed", 1).show();
    }
}
