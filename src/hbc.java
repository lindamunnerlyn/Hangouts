// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;

public final class hbc
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
    jvz l;
    ksv m;
    hut n;

    public hbc()
    {
        i = true;
    }

    public hbc a()
    {
        i = true;
        return this;
    }

    public hbc a(Uri uri)
    {
        a = uri;
        return this;
    }

    public hbc a(String s)
    {
        d = s;
        return this;
    }

    public hbc b()
    {
        k = true;
        return this;
    }

    public hbc b(String s)
    {
        e = s;
        return this;
    }

    public hbb c()
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
        g.b(flag, "must specify an albumId or eventId");
        if (a != null && a != Uri.EMPTY)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        g.b(flag, "must specify a mediaUri");
        return new hbb(this);
    }

    public hbc c(String s)
    {
        f = s;
        return this;
    }
}
