// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.DialogInterface;

public final class aju
    implements android.content.DialogInterface.OnClickListener
{

    final Context a;
    final int b;

    public aju(Context context, int i)
    {
        a = context;
        b = i;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = (cro)hlp.b(a, cro);
        if (dialoginterface != null)
        {
            dialoginterface = dialoginterface.a(a, b);
            a.startActivity(dialoginterface);
        }
    }
}
