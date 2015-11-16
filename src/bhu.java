// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import android.widget.CheckBox;

final class bhu
    implements android.content.DialogInterface.OnClickListener
{

    final ani a;
    final bht b;

    bhu(bht bht1, ani ani)
    {
        b = bht1;
        a = ani;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (bht.a(b) != null)
        {
            if (bht.b(b).isChecked())
            {
                i = 1552;
            } else
            if (bht.c(b).isChecked())
            {
                i = 1553;
            } else
            {
                i = 1554;
            }
            g.a(a, i);
            bht.a(b).a(bht.b(b).isChecked(), bht.c(b).isChecked());
        }
    }
}
