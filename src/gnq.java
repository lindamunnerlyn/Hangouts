// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class gnq
    implements gmz
{

    final gnj a;

    gnq(gnj gnj)
    {
        a = gnj;
        super();
    }

    public String a()
    {
        return "add_skinny_page_boolean";
    }

    public void a(Context context, gmw gmw1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (!gmw1.d("is_google_plus"))
        {
            flag = flag1;
            if (gmw1.a("page_count", 0) > 0)
            {
                flag = true;
            }
        }
        gmw1.b("gplus_skinny_page", flag);
    }
}
