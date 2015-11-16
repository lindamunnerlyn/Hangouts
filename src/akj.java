// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class akj
    implements android.content.DialogInterface.OnClickListener
{

    final String a[];
    final akf b;

    akj(akf akf1, String as[])
    {
        b = akf1;
        a = as;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        akf.a(b, eey.g(a[i]));
    }
}
