// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class dcd
    implements android.content.DialogInterface.OnClickListener
{

    dcd()
    {
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.cancel();
    }
}
