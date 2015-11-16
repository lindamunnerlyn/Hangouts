// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Toast;

final class akl
    implements hff
{

    final aki a;

    akl(aki aki1)
    {
        a = aki1;
        super();
    }

    public boolean a()
    {
        jmi jmi1 = aki.c(a);
        if (jmi1.isEmpty())
        {
            Toast.makeText(aki.a(a), g.iU, 0).show();
            return true;
        }
        if (jmi1.size() == 1)
        {
            aki.a(a, (String)g.a(jmi1));
            return true;
        } else
        {
            aki.a(a, jmi1);
            return true;
        }
    }
}
