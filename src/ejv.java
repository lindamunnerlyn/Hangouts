// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class ejv
    implements android.view.View.OnClickListener
{

    final String a;
    final String b;
    final ad c;
    final eju d;

    ejv(eju eju1, String s, String s1, ad ad1)
    {
        d = eju1;
        a = s;
        b = s1;
        c = ad1;
        super();
    }

    public void onClick(View view)
    {
        if (eev.a("Babel", 3))
        {
            view = a;
            String s = b;
            eev.d("Babel", (new StringBuilder(String.valueOf(view).length() + 48 + String.valueOf(s).length())).append("VideoSmSAttachmentView urlString: ").append(view).append(" contentType: ").append(s).toString());
        }
        c.startActivity(g.c(eju.a(d), b));
    }
}
