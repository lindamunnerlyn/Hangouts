// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

public final class ajv
    implements android.content.DialogInterface.OnClickListener
{

    final akf a;
    final String b;

    public ajv(akf akf1, String s)
    {
        a = akf1;
        b = s;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.a(b);
    }
}
