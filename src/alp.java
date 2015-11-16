// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;

final class alp
{

    private final beb a = (new bec()).a("callpromos").b("Module that hosts the call promos.").a(true).a();

    public alp()
    {
    }

    public alo a(Context context)
    {
        return (alo)a.a(context, new alt());
    }

    public beb[] a()
    {
        return (new beb[] {
            a
        });
    }

    public cqv[] b(Context context)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new als());
        arraylist.add(new alv());
        return (cqv[])a.a(context, cqv, arraylist);
    }
}
