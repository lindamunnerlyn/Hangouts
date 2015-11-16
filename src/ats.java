// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import android.widget.ArrayAdapter;

final class ats
    implements android.content.DialogInterface.OnClickListener
{

    final ArrayAdapter a;
    final atr b;

    ats(atr atr, ArrayAdapter arrayadapter)
    {
        b = atr;
        a = arrayadapter;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        ((cmu)a.getItem(i)).a();
    }
}
