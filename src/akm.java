// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class akm
    implements android.content.DialogInterface.OnClickListener
{

    final String a[];
    final aki b;

    akm(aki aki1, String as[])
    {
        b = aki1;
        a = as;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        aki.a(b, ebz.g(a[i]));
    }
}
