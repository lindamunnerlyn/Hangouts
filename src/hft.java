// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;

public final class hft
{

    Uri a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    long h;
    boolean i;
    int j;
    boolean k;
    kec l;
    lay m;
    hzx n;

    public hft()
    {
        i = true;
    }

    public hft a()
    {
        i = true;
        return this;
    }

    public hft a(Uri uri)
    {
        a = uri;
        return this;
    }

    public hft a(String s)
    {
        d = s;
        return this;
    }

    public hft b()
    {
        k = true;
        return this;
    }

    public hft b(String s)
    {
        e = s;
        return this;
    }

    public hfs c()
    {
        boolean flag1 = true;
        boolean flag;
        if (!TextUtils.isEmpty(e) || !TextUtils.isEmpty(g))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.d(flag, "must specify an albumId or eventId");
        if (a != null && a != Uri.EMPTY)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        g.d(flag, "must specify a mediaUri");
        return new hfs(this);
    }

    public hft c(String s)
    {
        f = s;
        return this;
    }
}
