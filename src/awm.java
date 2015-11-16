// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class awm
    implements android.content.DialogInterface.OnClickListener
{

    final ave a;

    awm(ave ave1)
    {
        a = ave1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = a.getActivity();
        if (dialoginterface != null)
        {
            dialoginterface.finish();
        }
    }
}
