// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;

final class dox
    implements hfe
{

    final dns a;
    final int b;
    final String c;
    final dow d;

    dox(dow dow1, dns dns1, int i, String s)
    {
        d = dow1;
        a = dns1;
        b = i;
        c = s;
        super();
    }

    public boolean a(hfa hfa, Object obj)
    {
        hfa = (String)obj;
        obj = a.a();
        boolean flag;
        boolean flag1;
        if (obj == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = TextUtils.isEmpty(hfa);
        if (b == 1 && (flag != flag1 || obj != null && !((Uri) (obj)).equals(Uri.parse(hfa))))
        {
            g.a(dbf.e(dow.a(d).a()), 1599);
        }
        ((gms)hgx.a(a.x(), gms)).b(dow.a(d).a()).c(c, hfa).d();
        a.a(hfa);
        return true;
    }
}
