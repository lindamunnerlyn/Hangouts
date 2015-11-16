// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import android.widget.ArrayAdapter;

final class auj
    implements android.content.DialogInterface.OnClickListener
{

    final ArrayAdapter a;
    final aui b;

    auj(aui aui, ArrayAdapter arrayadapter)
    {
        b = aui;
        a = arrayadapter;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        ((coj)a.getItem(i)).a();
    }
}
