// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class hjl
    implements android.content.DialogInterface.OnClickListener
{

    final hjk a;

    hjl(hjk hjk1)
    {
        a = hjk1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.a = i;
        a.onClick(dialoginterface, -1);
        dialoginterface.dismiss();
    }
}
