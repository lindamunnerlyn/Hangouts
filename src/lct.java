// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.OutputStream;

public abstract class lct
{

    final String a;
    final String b;
    final String c;

    public lct(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("MIME type may not be null");
        }
        a = s;
        int i = s.indexOf('/');
        if (i != -1)
        {
            b = s.substring(0, i);
            c = s.substring(i + 1);
            return;
        } else
        {
            b = s;
            c = null;
            return;
        }
    }

    public String a()
    {
        return a;
    }

    public abstract void a(OutputStream outputstream);

    public abstract String b();

    public abstract String c();

    public abstract long d();

    public abstract String e();
}
