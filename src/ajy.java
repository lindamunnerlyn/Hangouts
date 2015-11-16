// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

public final class ajy
    implements android.content.DialogInterface.OnClickListener
{

    final aki a;
    final String b;

    public ajy(aki aki1, String s)
    {
        a = aki1;
        b = s;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.a(b);
    }
}
