// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.widget.Toast;

public final class cna
    implements bds
{

    public cna()
    {
    }

    public void a(Context context)
    {
        Toast.makeText(context, "Dumping accounts.xml, please wait", 1).show();
        java.io.File file = g.d(context);
        Toast.makeText(context, "accounts.xml dumped", 0).show();
        g.a(context, file);
    }

    public boolean a(String s)
    {
        return "dumpaccounts".equals(s);
    }
}
