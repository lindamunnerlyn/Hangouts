// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.ByteArrayOutputStream;

final class acl
{

    int a;
    final ack b;
    private acm c;
    private acm d;

    acl(ack ack1)
    {
        b = ack1;
        super();
        c = null;
        d = null;
        a = 0;
    }

    void a()
    {
        if (d != null)
        {
            throw new RuntimeException("BUG: Invalid newbuf() before copy()");
        } else
        {
            acm acm1 = new acm();
            acm1.a = b.a;
            acm1.b = b.b;
            acm1.c = c;
            c = acm1;
            a = a + 1;
            b.a = new ByteArrayOutputStream();
            b.b = 0;
            return;
        }
    }

    void b()
    {
        ByteArrayOutputStream bytearrayoutputstream = b.a;
        int i = b.b;
        b.a = c.a;
        b.b = c.b;
        d = c;
        c = c.c;
        a = a - 1;
        d.a = bytearrayoutputstream;
        d.b = i;
    }

    void c()
    {
        b.a(d.a.toByteArray(), d.b);
        d = null;
    }

    acn d()
    {
        acn acn1 = new acn(b);
        acn1.a = b.b;
        acn1.b = a;
        return acn1;
    }
}
