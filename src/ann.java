// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class ann
    implements gmz
{

    final ank a;

    ann(ank ank)
    {
        a = ank;
        super();
    }

    public String a()
    {
        return "is_gplus_user_to_is_google_plus";
    }

    public void a(Context context, gmw gmw1)
    {
        if (gmw1.a("is_gplus_user"))
        {
            gmw1.b("is_google_plus", gmw1.d("is_gplus_user"));
            gmw1.f("is_gplus_user");
        }
    }
}
