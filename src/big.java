// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import android.widget.CheckBox;

final class big
    implements android.content.DialogInterface.OnClickListener
{

    final aoa a;
    final bif b;

    big(bif bif1, aoa aoa)
    {
        b = bif1;
        a = aoa;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (bif.a(b) != null)
        {
            if (bif.b(b).isChecked())
            {
                i = 1552;
            } else
            if (bif.c(b).isChecked())
            {
                i = 1553;
            } else
            {
                i = 1554;
            }
            g.a(a, i);
            bif.a(b).a(bif.b(b).isChecked(), bif.c(b).isChecked());
        }
    }
}
