// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class egt
    implements android.view.View.OnClickListener
{

    final String a;
    final String b;
    final ad c;
    final egs d;

    egt(egs egs1, String s, String s1, ad ad1)
    {
        d = egs1;
        a = s;
        b = s1;
        c = ad1;
        super();
    }

    public void onClick(View view)
    {
        if (ebw.a("Babel", 3))
        {
            view = a;
            String s = b;
            ebw.d("Babel", (new StringBuilder(String.valueOf(view).length() + 48 + String.valueOf(s).length())).append("VideoSmSAttachmentView urlString: ").append(view).append(" contentType: ").append(s).toString());
        }
        c.startActivity(g.c(egs.a(d), b));
    }
}
