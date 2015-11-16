// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;

final class drq
    implements hjv
{

    final dql a;
    final int b;
    final String c;
    final drp d;

    drq(drp drp1, dql dql1, int i, String s)
    {
        d = drp1;
        a = dql1;
        b = i;
        c = s;
        super();
    }

    public boolean a(hjr hjr, Object obj)
    {
        hjr = (String)obj;
        obj = a.b();
        boolean flag;
        boolean flag1;
        if (obj == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = TextUtils.isEmpty(hjr);
        if (b == 1 && (flag != flag1 || obj != null && !((Uri) (obj)).equals(Uri.parse(hjr))))
        {
            g.a(dcn.e(drp.a(d).a()), 1599);
        }
        ((gqz)hlp.a(a.x(), gqz)).b(drp.a(d).a()).c(c, hjr).d();
        a.a(hjr);
        return true;
    }
}
