// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class anm
    implements gmz
{

    final ank a;

    anm(ank ank)
    {
        a = ank;
        super();
    }

    public String a()
    {
        return "name_to_account_name";
    }

    public void a(Context context, gmw gmw1)
    {
        if (gmw1.a("name"))
        {
            gmw1.b("account_name", gmw1.b("name"));
            gmw1.f("name");
        }
    }
}
